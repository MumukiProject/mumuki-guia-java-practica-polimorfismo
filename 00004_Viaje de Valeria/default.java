class Viaje {
  Transporte transporte;
  Alojamiento alojamiento;
  
  public Viaje(Transporte transporte, Alojamiento alojamiento) {
    this.transporte = transporte;
    this.alojamiento = alojamiento;
  }
  
  public int cuantoCuesta() {
    return transporte.costoTotal() + alojamiento.arancel();
  }
}