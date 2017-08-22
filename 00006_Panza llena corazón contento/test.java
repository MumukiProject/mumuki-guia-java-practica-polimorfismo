@Test
public void cuando_come_se_pone_contenta() {
  MascotaVirtual mascota = new MascotaVirtual();
  mascota.comer();
  Assert.assertTrue(mascota.estaContenta());
}

@Test
public void cuando_come_dos_veces_se_cansa() {
  MascotaVirtual mascota = new MascotaVirtual();
  mascota.comer();
  mascota.comer();
  Assert.assertTrue(mascota.estaCansada());
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


@Test
public void cuando_inicia_no_esta_cansada() {
  MascotaVirtual mascota = new MascotaVirtual();
  Assert.assertFalse(mascota.estaCansada());
}
