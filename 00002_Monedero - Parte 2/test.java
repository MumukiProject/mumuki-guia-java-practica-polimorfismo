CuentaCorriente cc;
CajaDeAhorro ca;

@Before
public void before() {
  cc = new CuentaCorriente();
  ca = new CajaDeAhorro();
}

@Test
public void depositar() {
  cuenta.depositar(200);
  Assert.assertEquals(200, cuenta.getSaldo());
}

@Test
public void extraer() {
  cuenta.depositar(200);
  cuenta.extraer(100);
  Assert.assertEquals(100, cuenta.getSaldo());
}