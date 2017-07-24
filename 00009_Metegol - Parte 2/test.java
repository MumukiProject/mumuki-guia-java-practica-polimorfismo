@Test
public void habilidadAtacanteCuandoGira50Veces() {
  Delantero delantero = new Delantero();
  delantero.setCantidadDeGiros(50);
  Assert.assertEquals(100, delantero.habilidad());
}

@Test
public void habilidadDeUnDefensorSiempre10() {
  Defensor defensor = new Defensor();
  Assert.assertEquals(10, defensor.habilidad());
}

@Test
public void habilidadDeUnArqueroEs0() {
  Arquero arquero = new Arquero();
  Assert.assertEquals(0, arquero.habilidad());
}