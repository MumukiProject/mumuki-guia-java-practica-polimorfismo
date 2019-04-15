Boveda boveda;

@Before
public void before() {
  boveda = new Boveda();
  boveda.asegurarCon(new SeguridadBaja());
}

@Test
public void si_se_depositan_200_monedas_el_saldo_es_200() {
  boveda.depositarMonedas(200);
  Assert.assertEquals(200, boveda.getSaldo());
}

@Test
public void si_se_depositan_50_monedas_y_luego_otras_50_el_saldo_es_100() {
  boveda.depositarMonedas(50);
  boveda.depositarMonedas(50);
  Assert.assertEquals(100, boveda.getSaldo());
}

@Test
public void si_se_depositan_50_monedas_y_luego_se_extraen_20_el_saldo_es_30() {
  boveda.depositarMonedas(50);
  boveda.extraerMonedas(20);
  Assert.assertEquals(30, boveda.getSaldo());
}


@Test
public void si_se_depositan_50_monedas_y_luego_se_extraen_100_y_la_seguridad_baja_el_saldo_es_menos_50() {
  boveda.depositarMonedas(50);
  boveda.extraerMonedas(100);
  Assert.assertEquals(-50, boveda.getSaldo());
}

@Test
public void si_se_depositan_50_monedas_y_luego_se_extraen_100_y_la_seguridad_es_media_el_saldo_50() {
  boveda.asegurarCon(new SeguridadMedia());

  boveda.depositarMonedas(50);
  boveda.extraerMonedas(100);
  Assert.assertEquals(50, boveda.getSaldo());
}

@Test
public void si_se_depositan_50_monedas_y_la_seguridad_es_alta_el_saldo_49() {
  boveda.asegurarCon(new SeguridadAlta());

  boveda.depositarMonedas(50);
  Assert.assertEquals(49, boveda.getSaldo());
}


@Test(expected = RuntimeException.class)
public void si_se_depositan_50_monedas_y_luego_se_extraen_100_y_la_seguridad_es_media_se_lanza_una_excepcion() {
  boveda.asegurarCon(new SeguridadAlta());

  boveda.depositarMonedas(50);
  boveda.extraerMonedas(100);
}



