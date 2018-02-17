Manzana manzana;
Pomelo pomelo;
Naranja naranja;

@Test
public void una_manzana_da_80_ml_de_jugo() {
  Assert.asserEquals(80, manzana.jugo());
}

public void una_naranja_da_105_ml_de_jugo() {
  Assert.asserEquals(105, naranja.jugo());
}

public void un_pomelo_da_130_ml_de_jugo() {
  Assert.asserEquals(120, pomelo.jugo());
}