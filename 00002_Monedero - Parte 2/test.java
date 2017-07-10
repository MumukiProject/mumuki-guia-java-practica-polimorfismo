CuentaCorriente cc;
CajaDeAhorro ca;

@Before
public void before() {
  cc = new CuentaCorriente();
  ca = new CajaDeAhorro();
}

@Test
public void giroAlDescubierto() {
  cc.depositar(200);
  cc.extraer(300);
  Assert.assertEquals(-100, cc.getSaldo());
}

@Test
public void extraerMasDeLoQueSePuede() {
  ca.depositar(200);
  ca.extraer(300);
  Assert.assertEquals(200, ca.getSaldo());
}

@Test
public void extraer() {
  ca.depositar(200);
  ca.extraer(100);
  Assert.assertEquals(100, ca.getSaldo());
}