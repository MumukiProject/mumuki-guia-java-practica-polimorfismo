class PruebaMascota {
  void darDeComerAUnaMascota() {
    MascotaVirtual koromon = new MascotaVirtual();
    koromon.estaHambrienta(); // deuelve true
    koromon.comer();
    koromon.estaContenta(); // deuelve true
  }
}