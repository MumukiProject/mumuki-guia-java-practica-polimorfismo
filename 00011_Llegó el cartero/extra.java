class Ciudad {
  int kilometros;
  
  Ciudad(int ubicacionEnKilometros) {
    kilometros = ubicacionEnKilometros;
  }
  
  int kilometros() {
    return kilometros;
  }
  
  int distancia(Ciudad otraCiudad) {
    return Math.abs(this.kilometros() - otraCiudad.kilometros());
  }
}