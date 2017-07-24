BovedaDeBajaSeguridad bbs;
BovedaDeAltaSegurodad bas;
BovedaDelDragon bbd;

@Before
public void before() {
  bbs = new BovedaDeBajaSeguridad();
  bas = new BovedaDeAltaSegurodad();
  bbd = new BovedaDelDragon();
}

@Test
public void giroAlDescubierto() {
  bbs.depositar(200);
  bbs.extraer(300);
  Assert.assertEquals(-100, bbs.getCantidadDeMonedas());
}

@Test
public void extraerMasDeLoQueSePuede() {
  bas.depositar(200);
  bas.extraer(300);
  Assert.assertEquals(200, bas.getCantidadDeMonedas());
}

@Test
public void extraerLoJusto() {
  bas.depositar(200);
  bas.extraer(200);
  Assert.assertEquals(0, bas.getCantidadDeMonedas());
}

@Test
public void cantidadDeMonedasEnBovedaDelDragon() {
  bbd.setCodiciaDelDragon(5);
  bbd.depositar(200);
  Assert.assertEquals(195, bbd.getCantidadDeMonedas());
}