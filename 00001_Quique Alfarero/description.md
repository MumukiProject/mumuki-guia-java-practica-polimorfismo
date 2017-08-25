Nuestro hechicero amigo _Quique Alfarero_ :zap: recibió una suculenta herencia por parte de sus padres y nos pidió ayuda para saber como funciona el banco :bank:  de los duendes. 

De cada `Boveda` sabemos su saldo (su cantidad de monedas), que inicialmente es 0. Además, de cada una se pueden `extraerMonedas` y `depositarMonedas`. Por ejemplo: 
 
```java
Boveda unaBoveda = new Boveda();
unaBoveda.getSaldo(); // devuelve 0
unaBoveda.depositarMonedas(30); 
unaBoveda.getSaldo(); // ahora devuelve 30 
unaBoveda.extraerMonedas(20); 
unaBoveda.getSaldo(); // ahora devuelve 10 
```

> Implementá una clase `Boveda` de forma que se pueda usar como en el ejemplo.