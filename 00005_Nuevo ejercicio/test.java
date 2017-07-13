@Test

public void CuandoComeSePoneContenta() {
  MascotaVirtual mascota = new MascotaVirtual();
  Assert.assertEquals('hambrienta', mascota.getEstado())
  mascota.comer()
  Assert.assertEquals('contenta', mascota.getEstado())
}