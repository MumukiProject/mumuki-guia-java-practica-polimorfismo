class Metegol {
  Jugador arquero;
  Jugador defensor;
  Jugador mediocampista;
  Jugador delantero;
  
  public int cantidadDeGoles() {
    return arquero.cantidadDeGoles() +
           defensor.cantidadDeGoles() * 3 +
           mediocampista.cantidadDeGoles() * 4 +
           delanteri.cantidadDeGoles() * 3;
  }
}