Viaje viaje;

@Test
public void conMicroYDepartamento() {
  Micro micro = new Micro();
  Departamento departamento = new Departamento();
  departamento.setIncluyeDesayuno(false);
  viaje = new Viaje(micro, departamento);
  Assert.assertEquals(1500, viaje.cuantoCuesta());
}

@Test
public void conAvionYHotel() {
  Avion avion = new Avion();
  avion.setCostoPasaje(500);
  Hotel hotel = new Hotel();
  hotel.setCantidadDeNoches(4);
  hotel.setCantidadDeEstrellas(5);
  viaje = new Viaje(avion, hotel);
  Assert.assertEquals(1020, viaje.cuantoCuesta());
}

@Test
public void conBicicletaYDepartamentoSinDesayuno() {
  Bicicleta bicicleta = new Bicicleta();
  Departamento departamento = new Departamento();
  departamento.setIncluyeDesayuno(false);
  viaje = new Viaje(bicicleta, departamento);
  Assert.assertEquals(1000, viaje.cuantoCuesta());
}

@Test
public void conBicicletaYDepartamentoConDesayuno() {
  Bicicleta bicicleta = new Bicicleta();
  Departamento departamento = new Departamento();
  departamento.setIncluyeDesayuno(true);
  viaje = new Viaje(bicicleta, departamento);
  Assert.assertEquals(2000, viaje.cuantoCuesta());
}