_Las cosas son mas complejas, Quique... :zap:_

Resulta que los duendes administran 2 niveles de seguridad para las bóvedas: las de `SeguridadBaja` y las de `SeguridadMedia`. ¿La diferencia? Cuando sacás monedas de más...

* ...en una cuenta de seguridad baja, el saldo queda en negativo;
* pero en una cuenta de seguridad media, el saldo no se modifica. 

Veamos un ejemplo: 

```java
Boveda boveda = new Boveda();
boveda.asegurarCon(new SeguridadMedia());
boveda.extraerMonedas(20);
boveda.getSaldo(); // Sigue siendo 0

boveda.asegurarCon(new SeguridadBaja());
boveda.extraerMonedas(20);
boveda.getSaldo(); // Ahora es -20
```

> ¡Agregale seguridad a las cuentas! Completá el código y modificá lo que ya hiciste para poder utilizar las cuentas como en el ejemplo. 

