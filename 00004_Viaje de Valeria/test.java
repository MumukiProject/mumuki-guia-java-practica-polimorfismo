Viaje viaje;
Alojamiento alojamiento;
Transporte transporte;

@Test
public void ConAvionYHotel() {
  transporte = new Micro();
  alojamiento = new Cabania();
  viaje = new Viaje(transporte, alojamiento);
  Assert.assertEquals(2500, viaje.costoTotal());
}