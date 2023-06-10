# PersonaGen - Generador de Datos de Usuario, Direcciones y Datos Bancarios Aleatorios

¡Bienvenido(a) al repositorio de PersonaGen!

PersonaGen es un proyecto de API REST desarrollado en Spring Boot que te permite generar datos aleatorios de usuario, direcciones y datos bancarios. Esta herramienta puede ser útil para pruebas, prototipos o cualquier escenario en el que necesites datos ficticios para llenar una base de datos o simular información de usuarios.

## Características

- Generación de datos aleatorios de usuarios, incluyendo nombres, apellidos, direcciones de correo electrónico y números de teléfono.
- Generación de direcciones aleatorias incluyendo también campos para el formato español (como la comunidad autónoma, o la provincia).
- Generación de datos bancarios aleatorios, incluyendo cvv, bic e iban.
 
## Documentación

Puedes acceder al swagger de la api desde aquí, pero se paciente con la carga por favor :sweat_smile:
* `Swagger UI` https://personagen.fly.dev/swagger-ui/index.html
* `JSON` https://personagen.fly.dev/v2/api-docs

## Uso de la API

La API de PersonaGen ofrece varios endpoints para generar los diferentes tipos de datos aleatorios. A continuación, se muestra un ejemplo de cómo usar la API:

1. Inicia la aplicación y asegúrate de que esté en ejecución.

2. Realiza una solicitud HTTP a uno de los siguientes endpoints:

   - Generar datos de usuario aleatorios:
     ```
     http://localhost:8080/user/random-user
     ```

   - Generar direcciones aleatorias:
     ```
     http://localhost:8080/address/random-address
     ```

   - Generar datos bancarios aleatorios:
     ```
     http://localhost:8080/bankdata/random-bankdata
     ```

3. Recibirás una respuesta JSON con los datos generados.

## Contribuciones

¡Se agradecen las contribuciones a este proyecto! Si tienes ideas para mejorar la funcionalidad, agregar nuevas características o corregir problemas, no dudes en enviar un pull request. Tu ayuda es valiosa para hacer crecer y mejorar PersonaGen.

Trataré de mejorar la API periodicamente para agregar mas funcionalidades. Keep in touch!

## Agradecimientos

Agradezco a la comunidad de desarrolladores de Spring Boot por proporcionar una base sólida para el desarrollo de esta API REST. También quiero agradecer a todos los colaboradores que han contribuido a este proyecto y a la comunidad de software de código abierto por su apoyo y contribuciones continuas.

¡Espero que PersonaGen os sea útil para generar vuestros locos datos de prueba!

Happy coding! :man_technologist:
