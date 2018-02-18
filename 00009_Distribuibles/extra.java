class Ciudad {
  int kilometros;
  
  Ciudad(ubicacionEnKilometros) {
    kilometros = ubicacionEnKilometros;
  }
  
  int kilometros() {
    return kilometros;
  }
  
  int distancia(Ciudad otraCiudad) {
    return (this.kilometros() - otraCiudad.kilometros()).abs();
  }
}