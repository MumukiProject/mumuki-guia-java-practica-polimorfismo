Manzana manzana = new Manzana();
Pomelo pomelo = new Pomelo();
Naranja naranja = new Naranja();
JugoSimple jugoDeManzana = new JugoSimple(manzana);
JugoSimple jugoDePomelo = new JugoSimple(pomelo);
JugoSimple jugoDeNaranja = new JugoSimple(naranja);
  
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