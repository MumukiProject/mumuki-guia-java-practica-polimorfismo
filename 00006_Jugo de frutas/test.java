Manzana manzana = new Manzana();
Pomelo pomelo = new Pomelo();
Naranja naranja = new Naranja();
JugoMixto jugoDeManzanaYNaranja = new JugoMixto(manzana, naranja);
JugoMixto jugoDeNaranjaYPomelo = new JugoMixto(naranja, pomelo);
JugoMixto jugoDeManzanaYPomelo = new JugoMixto(manzana, pomelo);

@Test
public void un_jugo_mixto_de_manzana_y_naranja_no_tiene_mucha_vitamina_c() {
  Assert.assertFalse(jugoDeManzanaYNaranja.tieneMuchaVitaminaC());
}

@Test
public void un_jugo_mixto_de_naranja_y_pomelo_tiene_mucha_vitamina_c() {
  Assert.assertTrue(jugoDeNaranjaYPomelo.tieneMuchaVitaminaC());
}

@Test
public void un_jugo_mixto_de_manzana_y_pomelo_tiene_mucha_vitamina_c() {
  Assert.assertTrue(jugoDeManzanaYPomelo.tieneMuchaVitaminaC());
}

@Test
public void un_jugo_mixto_de_manzana_y_naranja_tiene_245_ml_de_jugo_total() {
  Assert.assertEquals(245, jugoDeManzanaYNaranja.jugoTotal());
}

@Test
public void un_jugo_mixto_de_naranja_y_pomelo_tiene_285_ml_de_jugo_total() {
  Assert.assertEquals(285, jugoDeNaranjaYPomelo.jugoTotal());
}

@Test
public void un_jugo_mixto_de_manzana_y_pomelo_tiene_260_ml_de_jugo_total() {
  Assert.assertEquals(260, jugoDeManzanaYPomelo.jugoTotal());
}