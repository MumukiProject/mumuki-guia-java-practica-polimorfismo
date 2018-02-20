Paquete paqueteChico = new Paquete(1900, 120);
Paquete paqueteGrande = new Paquete(2100, 180);
Carta carta = new Carta(10);
Ciudad marDelTuyu = new Ciudad(349);
Ciudad santaClara = new Ciudad(403);
Ciudad ushuaia = new Ciudad(3112);
EnvioUrgente envioDesdeUshuaia = new EnvioUrgente(ushuaia);

@Test
public void un_paquete_pequenio_siempre_se_puede_enviar_de_forma_urgente() {
 Assert.assertTrue(envioDesdeUshuaia.puedeEnviar(paqueteChico, santaClara));
 Assert.assertTrue(envioDesdeUshuaia.puedeEnviar(paquetGrande, marDelTuyu));
}

@Test
public void una_carta_siempre_se_puede_enviar_de_forma_urgente() {
 Assert.assertTrue(envioDesdeUshuaia.puedeEnviar(carta, ushuaia));
}

@Test
public void el_costo_de_envio_urgente_de_un_paquete_depende_de_su_peso_y_un_valor_fijo() {
 Assert.assertEquals(5170, envioDesdeUshuaia.costo(paqueteChico, santaClara)); 
}

@Test
public void el_costo_de_envio_urgente_de_una_carta_depende_de_su_peso_y_un_valor_fijo() {
 Assert.assertEquals(5012, envioDesdeUshuaia.costo(carta, santaClara));
}