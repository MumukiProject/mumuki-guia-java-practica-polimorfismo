class Viaje {
  Transporte transporte;
  Alojamiento alojamiento;
  
  public int cuantoCuesta() {
    return transporte.costoTotal() + alojamiento.arancel();
  }
}