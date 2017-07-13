@Test
public void CuandoNaceEstaHambrienta() {
  MascotaVirtual mascota = new MascotaVirtual();
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
}

@Test
public void CuandoComeSePoneContenta() {
  MascotaVirtual mascota = new MascotaVirtual();
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
  mascota.comer();
  Assert.assertEquals("Contenta", mascota.getEstado().getClass().getName());
}

@Test
public void CuandoCome2VecesEstandoContentaSePoneAburrida() {
  MascotaVirtual mascota = new MascotaVirtual();
  mascota.comer();
  mascota.comer();
  mascota.comer();
  Assert.assertEquals("Aburrida", mascota.getEstado().getClass().getName());
}