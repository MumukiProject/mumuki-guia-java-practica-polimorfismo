@Test
public void cuando_come_se_pone_contenta() {
  MascotaVirtual mascota = new MascotaVirtual();
  mascota.comer();
  Assert.assertTrue(mascota.estaContenta());
}

@Test
public void cuando_come_deja_de_estar_hambrienta() {
  MascotaVirtual mascota = new MascotaVirtual();
  mascota.comer();
  Assert.assertFalse(mascota.estaHambrienta());
}

@Test
public void cuando_inicia_esta_hambrienta() {
  MascotaVirtual mascota = new MascotaVirtual();
  Assert.assertTrue(mascota.estaHambrienta());
}

@Test
public void cuando_inicia_no_esta_contenta() {
  MascotaVirtual mascota = new MascotaVirtual();
  Assert.assertFalse(mascota.estaContenta());
}
