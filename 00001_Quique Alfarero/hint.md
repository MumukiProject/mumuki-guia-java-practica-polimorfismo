Ah, momento, ¿cómo se lanzan excepciones en Java? :bomb: Es bastante fácil: 

```java
throw new RuntimeException("Saldo insuficiente");
```

Esta sentencia fallará lanzando una excepción con el mensaje `"Saldo insuficiente"`, de forma análoga a su versión Ruby:

```ruby
raise "Saldo Insuficiente"
```