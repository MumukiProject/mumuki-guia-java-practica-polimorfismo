Paquete paqueteChico = new Paquete(1900, 120);
Paquete paqueteGrande = new Paquete(2100, 180);
Carta cartaCorta = new Carta(10);
Carta cartaLarga = new Carta(500);
Ciudad marDelTuyu = new Ciudad(349);
Ciudad santaClara = new Ciudad(403);
Ciudad ushuaia = new Ciudad(3112);
EnvioCortaDistancia envioDesdeMarDelTuyu = new EnvioCortaDistancia(marDelTuyu);
EnvioUrgente envioDesdeMarDelTuyuUrgente = new EnvioUrgente(marDelTuyu);
Cartero cartero = new Cartero(paqueteGrande);
Cartero cartera = new Cartero(cartaCorta);

@Test
public void un_paquete_de_volumen_menor_a_2000_cm3_es_pequenio() {
  Assert.assertTrue("paqueteChico.esPequenio() debería ser true, pero fue false", paqueteChico.esPequenio());
}

@Test
public void un_paquete_de_volumen_mayor_a_2000_cm3_no_es_pequenio() {
  Assert.assertFalse(paqueteGrande.esPequenio());
}

@Test
public void el_peso_de_un_paquete_es_el_de_su_contenido_mas_el_de_la_caja() {
  Assert.assertEquals(170, paqueteChico.peso());
}

@Test
public void un_paquete_de_peso_menor_a_200_gramos_es_liviano() {
  Assert.assertTrue(paqueteChico.esLiviano());
}

@Test
public void un_paquete_de_peso_mayor_a_200_gramos_no_es_liviano() {
  Assert.assertFalse(paqueteGrande.esLiviano());
}

@Test
public void las_cartas_siempre_son_pequenias() {
  Assert.assertTrue(cartaCorta.esPequenio());
  Assert.assertTrue(cartaLarga.esPequenio());
}

@Test
public void el_peso_de_una_carta_depende_de_su_cantidad_de_lineas_y_el_peso_del_papel() {
  Assert.assertEquals(12, cartaCorta.peso(), 0);
  Assert.assertEquals(502, cartaLarga.peso(), 0);
}

@Test
public void un_paquete_pequenio_puede_enviarse_entre_ciudades_de_distancia_menor_a_200_km() {
 Assert.assertTrue(envioDesdeMarDelTuyu.puedeEnviar(paqueteChico, santaClara));
}

@Test
public void un_paquete_pequenio_no_puede_enviarse_entre_ciudades_de_distancia_mayor_a_200_km() {
 Assert.assertFalse(envioDesdeMarDelTuyu.puedeEnviar(paqueteChico, ushuaia));
}

@Test
public void un_paquete_que_no_es_pequenio_no_puede_enviarse_entre_ciudades_de_distancia_menor_a_200_km() {
 Assert.assertFalse(envioDesdeMarDelTuyu.puedeEnviar(paqueteGrande, santaClara)); 
}

@Test
public void una_carta_no_puede_enviarse_entre_ciudades_de_distancia_mayor_a_200_km() {
 Assert.assertFalse("envioDesdeMarDelTuyu.puedeEnviar(cartaCorta, ushuaia) debería ser false, pero fue true", envioDesdeMarDelTuyu.puedeEnviar(cartaCorta, ushuaia));
}

@Test
public void el_costo_de_envio_de_un_paquete_depende_de_su_peso_y_la_distancia_entre_ciudades() {
 Assert.assertEquals(224, envioDesdeMarDelTuyu.costo(paqueteChico, santaClara)); 
}

@Test
public void el_costo_de_envio_de_una_carta_depende_de_su_peso_y_la_distancia_entre_ciudades() {
 Assert.assertEquals(66, envioDesdeMarDelTuyu.costo(cartaCorta, santaClara));
}

@Test
public void un_paquete_pequenio_siempre_se_puede_enviar_de_forma_urgente() {
 Assert.assertTrue(envioDesdeMarDelTuyuUrgente.puedeEnviar(paqueteChico, santaClara));
 Assert.assertTrue(envioDesdeMarDelTuyuUrgente.puedeEnviar(paqueteGrande, ushuaia));
}

@Test
public void una_carta_siempre_se_puede_enviar_de_forma_urgente() {
 Assert.assertTrue(envioDesdeMarDelTuyuUrgente.puedeEnviar(cartaCorta, ushuaia));
}

@Test
public void el_costo_de_envio_urgente_de_un_paquete_depende_de_su_peso_y_un_valor_fijo() {
 Assert.assertEquals(5170, envioDesdeMarDelTuyuUrgente.costo(paqueteChico, ushuaia)); 
}

@Test
public void el_costo_de_envio_urgente_de_una_carta_depende_de_su_peso_y_un_valor_fijo() {
 Assert.assertEquals(5012, envioDesdeMarDelTuyuUrgente.costo(cartaCorta, ushuaia));
}

@Test
public void la_comision_de_un_envio_que_no_se_puede_enviar_es_0(){
  Assert.assertEquals(0, cartero.comision(envioDesdeMarDelTuyu, ushuaia), 0); 
}

@Test
public void la_comision_de_un_envio_corta_distancia_que_se_puede_enviar_es_el_10_porciento(){
  Assert.assertEquals(6.6, cartera.comision(envioDesdeMarDelTuyu, santaClara), 0.6); 
}

@Test
public void la_comision_de_un_envio_urgente_es_el_20_porciento(){
  Assert.assertEquals(1002.4, cartera.comision(envioDesdeMarDelTuyuUrgente, santaClara), 0.4); 
}

//no estoy orgulloso de lo largo que quedó esto