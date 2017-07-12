Viaje viaje;

@Test
public void ConAvionYHotel() {
  Micro micro = new Micro();
  Cabania cabania = new Cabania();
  viaje = new Viaje(micro, cabania);
  Assert.assertEquals(2500, viaje.costoTotal());
}