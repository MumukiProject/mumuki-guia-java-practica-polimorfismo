CuentaCorriente cc;
CajaDeAhorro ca;
CajaDeAhorroEnDolares cad;

@Before
public void before() {
  cc = new CuentaCorriente();
  ca = new CajaDeAhorro();
  cad = new CajaDeAhorroEnDolares();
}

@Test
public void saldoEnPesosCC() {
  cc.depositar(200);
  Assert.assertEquals(200, cc.saldoEnPesos());
}

@Test
public void saldoEnPesosCA() {
  ca.depositar(200);
  Assert.assertEquals(200, ca.saldoEnPesos());
}

@Test
public void saldoEnPesosCAD() {
  cad.setCotizacion(17);
  cad.depositar(200);
  Assert.assertEquals(2400, cad.saldoEnPesos());
}