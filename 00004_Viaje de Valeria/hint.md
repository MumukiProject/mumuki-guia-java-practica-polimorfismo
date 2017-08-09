Varias de las clases que vas a tener que definir tienen estado: los aviones, por ejemplo, tienen un costo de pasaje que es variable. Entonces, cuando tengamos que instanciar un avión, ¿cómo podemos hacer para inicializar el atributo `costoPasaje`?

Una posible forma es mediante un setter...

```java
Viaje aVillaCarlosPaz = new Viaje();
aVillaCarlosPaz.setCostoPasaje(300);
```
...mientras que otra posible forma es mediante un constructor:

```java
Viaje aTanti = new Viaje(330);
```

Dado que esta última forma es más simple, resolvé los ejercicios de esta guía usando constructores y no setters. 

