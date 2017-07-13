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
  hotel.setCantidadDeNoches(4);
  hotel.setCantidadDeEstrellas(5);
  viaje = new Viaje(avion, hotel);
  Assert.assertEquals(1020, viaje.costoTotal());
}

@Test
public void ConBicicletaYDepartamentoSinDesayuno() {
  Bicleta bicicleta = new Bicicleta();
  Departamento departamento = new Departamento();
  departamento.setIncluyeDesayuno(false);
  viaje = new Viaje(bicicleta, departamento);
  Assert.assertEquals(1000, viaje.costoTotal());
}

@Test
public void ConBicicletaYDepartamentoSinDesayuno() {
  Bicleta bicicleta = new Bicicleta();
  Departamento departamento = new Departamento();
  departamento.setIncluyeDesayuno(false);
  viaje = new Viaje(bicicleta, departamento);
  Assert.assertEquals(2000, viaje.costoTotal());
}