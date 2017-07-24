BovedaDeBajaSeguridad bovedaInsegura;
BovedaDeAltaSeguridad bovedaSegura;

@Before
public void before() {
  bovedaInsegura = new BovedaDeBajaSeguridad();
  bovedaSegura = new BovedaDeAltaSeguridad();
}

@Test
public void giroAlDescubierto() {
  bovedaInsegura.depositar(200);
  bovedaInsegura.extraer(300);
  Assert.assertEquals(-100, bovedaPura.getCantidadDeMonedas());
}

@Test
public void extraerMasDeLoQueSePuede() {
  bovedaSegura.depositar(200);
  bovedaSegura.extraer(300);
  Assert.assertEquals(200, bovedaSegura.getCantidadDeMonedas());
}

@Test
public void extraer() {
  bovedaSegura.depositar(200);
  bovedaSegura.extraer(100);
  Assert.assertEquals(100, bovedaSegura.getCantidadDeMonedas());
}