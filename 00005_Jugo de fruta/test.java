Manzana manzana = new Manzana();
Pomelo pomelo = new Pomelo();
Naranja naranja = new Naranja();

@Test
public void una_manzana_da_80_ml_de_jugo() {
  Assert.assertEquals(80, manzana.jugo());
}

@Test
public void una_naranja_da_105_ml_de_jugo() {
  Assert.assertEquals(105, naranja.jugo());
}

public void un_pomelo_da_130_ml_de_jugo() {
  Assert.assertEquals(120, pomelo.jugo());
}