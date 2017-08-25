Boveda boveda;

@Before
public void before() {
  boveda = new Boveda();
}

@Test
public void si_se_depositan_200_monedas_el_saldo_es_200() {
  boveda.depositarMonedas(200);
  Assert.assertEquals(200, boveda.saldo());
}

@Test
public void si_se_depositan_50_monedas_y_luego_otras_50_el_saldo_es_100() {
  boveda.depositarMonedas(50);
  boveda.depositarMonedas(50);
  Assert.assertEquals(100, boveda.saldo());
}

@Test
public void si_se_depositan_50_monedas_y_luego_se_extraen_20_el_saldo_es_30() {
  boveda.depositarMonedas(50);
  boveda.extraerMonedas(20);
  Assert.assertEquals(30, boveda.saldo());
}


@Test(expected = RuntimeException.class)
public void si_se_depositan_50_monedas_y_luego_se_extraen_90_se_lanza_una_excepcion() {
  boveda.depositarMonedas(50);
  boveda.extraerMonedas(90);
}