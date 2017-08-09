class Viaje {
  Transporte transporte;
  Alojamiento alojamiento;
  
  Viaje(Transporte transporte, Alojamiento alojamiento) {
    this.transporte = transporte;
    this.alojamiento = alojamiento;
  }
  
  double cuantoCuesta() {
    return transporte.costoTotal() + alojamiento.arancel();
  }
}