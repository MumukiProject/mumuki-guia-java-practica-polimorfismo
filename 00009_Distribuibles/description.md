Ahora que ya tenemos qué enviar... ¡enviémoslo! :email: 

Un `EnvioCortaDistancia` tiene una ciudad origen y destino, las cuales saben calcular su `distancia` a otra. Además, el envío sabe qué va a enviar: un `Distribuible`, que puede ser tanto una `Caja` como un `Paquete`.

Para los envíos corta distancia, el distribuible `sePuedeEnviar` si es pequeño y la distancia entre ciudades es menor a 200km. Además, tiene un `costo`: es la distancia entre ciudades sumada al peso en gramos del distribuible.

> Creá las clases e interfaces correspondientes, asumiendo que ya existe la clase `Ciudad`.