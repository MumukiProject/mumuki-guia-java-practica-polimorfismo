MascotaVirtual mascota;
@Before
public void before() {
  mascota = new MascotaVirtual();
}

@Test
public void CuandoNaceEstaHambrienta() {
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
}

@Test
public void CuandoComeSePoneContenta() {
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
  mascota.comer();
  Assert.assertEquals("Contenta", mascota.getEstado().getClass().getName());
}

@Test
public void CuandoCome2VecesEstandoContentaSePoneAburrida() {
  mascota.comer();
  mascota.comer();
  mascota.comer();
  Assert.assertEquals("Aburrida", mascota.getEstado().getClass().getName());
}

@Test
public void CuandoJuegaContentaEsMasMadura() {
  mascota.setEstado(new Contenta());
  mascota.jugar();
  Assert.assertEquals(2, mascota.getNivelDeMadurez());
}

@Test
public void CuandoJuega2VecesEstandoContentaSePoneHambrienta() {
  mascota.setEstado(new Contenta());
  mascota.jugar();
  mascota.jugar();
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
}

@Test
public void SiJuegaEstandoAburridaSePoneContenta() {
  mascota.setEstado(new Aburrida());
  mascota.jugar();
  Assert.assertEquals("Contenta", mascota.getEstado().getClass().getName());
}