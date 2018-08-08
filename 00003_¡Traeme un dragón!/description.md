_Y no hay dos sin tres_ :stuck_out_tongue:

Finalmente y tras algunas pérdidas económicas nuestros queridos duendes se dieron cuenta de que necesitaban bóvedas de alta seguridad, que protegen con dragones :dragon:. 

Las bóvedas de alta seguridad lanzan una excepción si se trata de extraer más monedas que el saldo. Pero nada es gratis: cada vez que se hace un depósito, el banco se lleva una moneda. 

```java
Boveda boveda = new Boveda();
boveda.asegurarCon(new SeguridadAlta());
boveda.depositarMonedas(20); // deposita 19 monedas
boveda.depositarMonedas(10); // deposita 9 monedas
boveda.getSaldo(); // devuelve 28, porque la seguridad 
                   // alta se cobró 2 monedas
boveda.extraerMonedas(50); // ¡lanza una excepción!
```

Ah, momento, ¿cómo se lanzan excepciones en Java? :bomb: Es bastante fácil: 

```java
throw new RuntimeException("Saldo insuficiente");
```

Esta sentencia fallará lanzando una excepción con el mensaje `"Saldo insuficiente"`, de forma análoga a su versión Ruby:

```ruby
raise "Saldo Insuficiente"
```

> ¡Agregá lo necesario para soportar los nuevos requerimientos! Y recordá que el polimorfismo es tu amigo :grin:.

