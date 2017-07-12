Viaje viaje;

@Test
public void ConMicroYCabania() {
  Micro micro = new Micro();
  Cabania cabania = new Cabania();
  viaje = new Viaje(micro, cabania);
  Assert.assertEquals(2500, viaje.costoTotal());
}

@Test
public void ConAvionYHotel() {
  Avion avion = new Avion();
  avion.setCostoPasaje(500);
  Hotel hotel = new Hotel();
  hotel.setCantidadNoches(4);
  hotel.setCantidadEstrellas(5);
  viaje = new Viaje(avion, hotel);
  Assert.assertEquals(2500, viaje.costoTotal());
}