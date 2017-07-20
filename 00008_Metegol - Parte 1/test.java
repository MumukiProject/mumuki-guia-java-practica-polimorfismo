Metegol metegol = new Metegol();
@Test
public void conAntiguedad2() {
  metegol.setAntiguedad(2);
  Assert.assertEquals(22, metegol.habilidad());
}

@Test
public void conAntiguedad3() {
  metegol.setAntiguedad(3);
  Assert.assertEquals(33, metegol.habilidad());
}

@Test
public void conAntiguedad0() {
  metegol.setAntiguedad(0);
  Assert.assertEquals(0, metegol.habilidad());
}