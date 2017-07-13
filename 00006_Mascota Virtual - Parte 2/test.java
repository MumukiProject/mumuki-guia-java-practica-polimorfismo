@Test

public void CuandoComeSePoneContenta() {
  MascotaVirtual mascota = new MascotaVirtual();
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
  mascota.comer();
  Assert.assertEquals("Contenta", mascota.getEstado().getClass().getName());
}