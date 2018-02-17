Paquete paqueteChico = new Paquete(1900, 120);
Paquete paqueteGrande = new Paquete(2100, 180);
Carta cartaCorta = new Carta(10);
Carta cartaLarga = new Carta(500);

@Test
public void un_paquete_de_volumen_menor_a_2000_cm3_es_pequenio() {
  Assert.assertTrue(paqueteChico.esPequenio());
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
  Assert.assertEquals(3, cartaCorta.peso());
  Assert.assertEquals(53, cartaLarga.peso());
}