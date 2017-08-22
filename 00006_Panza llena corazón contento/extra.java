class PruebaMascota {
  void darDeComerAUnaMascotaHambrienta() {
    MascotaVirtual koromon = new MascotaVirtual();
    koromon.comer();
    koromon.estaContenta();
  }
  
  void darDeComerAUnaMascotaContenta() {
    MascotaVirtual koromon = new MascotaVirtual();
    koromon.comer();
    koromon.comer();
    koromon.estaCansada(); // devuevle true
  }
  
  
  
}