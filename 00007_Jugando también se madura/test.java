MascotaVirtual mascota;
@Before
public void before() {
  mascota = new MascotaVirtual();
}

@Test
public void cuandoNaceEstaHambrienta() {
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
}

@Test
public void cuandoComeSePoneContenta() {
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
  mascota.comer();
  Assert.assertEquals("Contenta", mascota.getEstado().getClass().getName());
}

@Test
public void cuandoCome2VecesEstandoContentaSePoneAburrida() {
  mascota.comer();
  mascota.comer();
  mascota.comer();
  Assert.assertEquals("Aburrida", mascota.getEstado().getClass().getName());
}

@Test
public void cuandoJuegaContentaEsMasMadura() {
  mascota.setEstado(new Contenta());
  mascota.jugar();
  Assert.assertEquals(2, mascota.getNivelDeMadurez());
}

@Test
public void cuandoJuega2VecesEstandoContentaSePoneHambrienta() {
  mascota.setEstado(new Contenta());
  mascota.jugar();
  mascota.jugar();
  Assert.assertEquals("Hambrienta", mascota.getEstado().getClass().getName());
}

@Test
public void siJuegaEstandoAburridaSePoneContenta() {
  mascota.setEstado(new Aburrida());
  mascota.jugar();
  Assert.assertEquals("Contenta", mascota.getEstado().getClass().getName());
}