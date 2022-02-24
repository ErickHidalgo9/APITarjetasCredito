# APITarjetasCredito
Aplicacion responsable de obtener el tipo de tarjeta de credito más adecuada para el cliente


Componentes Importantes:
- Java 8;
- Desarrollo en REST;
- Spring Boot;
- Maven
- Spring Tool Suit 4
- Postman
- PostgreSQL

Esta aplicación será la responsable de obtener el tipo de tarjeta de crédito más adecuado para el cliente basado en su perfil. Los datos de perfil que el usuario capturará son los siguientes:

* Input:
  * Preferencias (Your passion) : compras, viajes, ayuda, negocio, deportes, estilo
  * Salario (Monthly salary)
  * Edad (Age)
* OutPut
  * Tipo de tarjeta

# Ejecucion

1. Se debe crear una BD llamada tarjeta en Postgresql

2. En postman con el endpoint [http://localhost:9081/api/v1/tarjeta/restapi/tarjetas/lista](http://localhost:9081/api/v1/tarjeta/restapi/tarjetas/lista/) se accede a la lista de tarjetas como se muestra en la siguiente imagen:
![Listar Tarjetas](https://user-images.githubusercontent.com/99521248/155462097-1e444383-e621-44d5-8c35-69f3831dfd91.png)

3. En postman con el endpoint [http://localhost:9081/api/v1/tarjeta/restapi/tarjeta/tipo](http://localhost:9081/api/v1/tarjeta/restapi/tarjeta/tipo) se busca el tipo de tarjeta adecuado al cliente como se muestra en la siguiente imagen:
![TipoTarjeta](https://user-images.githubusercontent.com/99521248/155462117-2dcf76fc-366f-496e-86e8-011c3999b161.png)

4. Tambien se puede acceder con swagger en el siguiente enlace [http://localhost:9081/api/v1/tarjeta/swagger-ui/#/tarjeta-controller](http://localhost:9081/api/v1/tarjeta/swagger-ui/#)

![S1](https://user-images.githubusercontent.com/99521248/155462338-cb0718b7-5c5c-4d7c-96f4-4285fc9e17b3.png)

![Swagger2](https://user-images.githubusercontent.com/99521248/155462325-7ab551ef-92d5-482a-97bb-24d34b7676fc.png)

![Swagger3](https://user-images.githubusercontent.com/99521248/155462349-9b3a75c0-0602-43a0-8542-1eabb134892f.png)
