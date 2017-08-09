class Viaje {
  Transporte transporte;
  Alojamiento alojamiento;
  
  Viaje(Transporte transporte, Alojamiento alojamiento) {
    this.transporte = transporte;
    this.alojamiento = alojamiento;
  }
  
  int cuantoCuesta() {
    return transporte.costoTotal() + alojamiento.arancel();
  }
}