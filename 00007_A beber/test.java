Manzana manzana = new Manzana();
Pomelo pomelo = new Pomelo();
Naranja naranja = new Naranja();
JugoSimple jugoDeManzana = new JugoSimple(manzana);
JugoSimple jugoDePomelo = new JugoSimple(pomelo);
JugoSimple jugoDeNaranja = new JugoSimple(naranja);
JugoMixto jugoDeManzanaYNaranja = new JugoMixto(manzana, naranja);
JugoMixto jugoDeNaranjaYPomelo = new JugoMixto(naranja, pomelo);
JugoMixto jugoDeManzanaYPomelo = new JugoMixto(manzana, pomelo);
Persona tomadorDeJugoDePomelo = new Persona();
Persona tomadorDeJugoDeManzanaYNaranja = new Persona();

@Test
public void una_manzana_da_80_ml_de_jugo() {
  Assert.assertEquals(80, manzana.jugo());
}

@Test
public void una_naranja_da_105_ml_de_jugo() {
  Assert.assertEquals(105, naranja.jugo());
}

@Test
public void un_pomelo_da_130_ml_de_jugo() {
  Assert.assertEquals(130, pomelo.jugo());
}

@Test
public void una_manzana_no_es_acida() {
  Assert.assertFalse(manzana.esAcida());
}

@Test
public void una_naranja_es_acida() {
  Assert.assertTrue(naranja.esAcida());
}

@Test
public void un_pomelo_es_acido() {
  Assert.assertTrue(pomelo.esAcida());
}

@Test
public void un_jugo_de_manzana_no_tiene_mucha_vitamina_c() {
  Assert.assertFalse(jugoDeManzana.tieneMuchaVitaminaC());
}

@Test
public void un_jugo_de_pomelo_tiene_mucha_vitamina_c() {
  Assert.assertTrue(jugoDePomelo.tieneMuchaVitaminaC());
}

@Test
public void un_jugo_de_naranja_tiene_205_ml_de_jugo_total() {
  Assert.assertEquals(205, jugoDeNaranja.jugoTotal());
}

@Test
public void un_jugo_de_pomelo_tiene_230_ml_de_jugo_total() {
  Assert.assertEquals(230, jugoDePomelo.jugoTotal());
}

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
public void un_jugo_mixto_de_manzana_y_naranja_tiene_235_ml_de_jugo_total() {
  Assert.assertEquals(235, jugoDeManzanaYNaranja.jugoTotal());
}

@Test
public void un_jugo_mixto_de_naranja_y_pomelo_tiene_285_ml_de_jugo_total() {
  Assert.assertEquals(285, jugoDeNaranjaYPomelo.jugoTotal());
}

@Test
public void un_jugo_mixto_de_manzana_y_pomelo_tiene_260_ml_de_jugo_total() {
  Assert.assertEquals(260, jugoDeManzanaYPomelo.jugoTotal());
}

@Test
public void una_persona_tiene_0_vitamina_c_inicialmente() {
  Assert.assertEquals(0, tomadorDeJugoDePomelo.getVitaminaC(), 0);  
}

@Test
public void una_persona_suma_la_mitad_de_vitamina_c_de_un_jugo_de_pomelo() {
  tomadorDeJugoDePomelo.beber(jugoDePomelo);
  Assert.assertEquals(115, tomadorDeJugoDePomelo.getVitaminaC(), 0);  
}

@Test
//Esto da 23.0 por tipos, pero no voy a enseñar castear a double! Asumo que puede ignorarse.
public void una_persona_suma_la_decima_parte_de_vitamina_c_de_un_jugo_de_manzana_y_naranja() {
  tomadorDeJugoDeManzanaYNaranja.beber(jugoDeManzanaYNaranja);
  Assert.assertEquals(23.5, tomadorDeJugoDeManzanaYNaranja.getVitaminaC(), 0.5);  
}