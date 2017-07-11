Viaje viaje;
Alojamiento alojamiento;
Transporte transporte;

@Test
public void ConAvionYHotel() {
  transporte = (Avion) new Avion();
  alojamiento = (Hotel) new Hotel();
  transporte.setCostoPasaje(100);
  alojamiento.setCantidadDeNoches(4);
  alojamiento.setCantidadDeEstrellas(4);
  viaje = new Viaje(transporte, alojamiento);
  Assert.assertEquals(216, viaje.costoTotal());
}