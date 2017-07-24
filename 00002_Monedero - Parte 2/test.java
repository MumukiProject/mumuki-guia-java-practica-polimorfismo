BovedaPura bovedaPura;
BovedaMestiza bovedaMestiza;

@Before
public void before() {
  bovedaPura = new BovedaPura();
  bovedaMestiza = new BovedaMestiza();
}

@Test
public void giroAlDescubierto() {
  bovedaPura.depositar(200);
  bovedaPura.extraer(300);
  Assert.assertEquals(-100, bovedaPura.getCantidadDeMonedas());
}

@Test
public void extraerMasDeLoQueSePuede() {
  bovedaMestiza.depositar(200);
  bovedaMestiza.extraer(300);
  Assert.assertEquals(200, bovedaMestiza.getCantidadDeMonedas());
}

@Test
public void extraer() {
  bovedaMestiza.depositar(200);
  bovedaMestiza.extraer(100);
  Assert.assertEquals(100, bovedaMestiza.getCantidadDeMonedas());
}