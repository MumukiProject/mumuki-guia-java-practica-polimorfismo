Boveda boveda;

@Before
public void before() {
  boveda = new Boveda();
}

@Test
public void depositar() {
  boveda.depositar(200);
  Assert.assertEquals(200, boveda.getCantidadDeMonedas());
}

@Test
public void extraer() {
  boveda.depositar(200);
  boveda.extraer(100);
  Assert.assertEquals(100, boveda.getCantidadDeMonedas());
}