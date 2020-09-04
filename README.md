# AREP-PARCIAL-I

## Requerimientos

1. Construir un servicio WEB (puede usar Spark o Sockets) que reciba una lista de números y retorne una estructura JSON con: La lista de números ordenada. Para probar, y para ver como el browser arma el query, puede usar una cadena puede enviarla en un solo campo con valores separados por comas. Ayuda: use un form html con un solo campo.
2. Usted debe implementar el ordenamiento por medio de bubble sort. Piense que este algoritmo se podría user para objetos de otro tipo.
3. Su diseño debe soportar la composición de nuevas operaciones sobre la lista para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre la lista aumentando el API web, es decir,  debe ser fácilmente extensible.
4. Agregue una operaciónes para calcular la sumatoria  y el promedio de la lista y modifique su programa para que la estructura Json contenga estos valores.
5. El diseño del servidor debe tener en cuenta buenas prácticas de diseño OO.
6. Despliegue el servicio en Heroku.
7. Construya un cliente JAVA para probar el servicio en heroku.
8. El cliente y el servidor debe entregarlos en un proyecto estructurado con Maven.
9. El cliente debe traer "quemada" en el código fuente la url de su aplicación desplegada en Heroku.

 ## Despliegue
 [Despliegue en Heroku](https://guarded-mountain-62231.herokuapp.com/)
 
 ## Comandos 
  Para compilar y correr las pruebas: ```mvn package```
  
  Para ejecutar y utilizar el programa: ```mvn exec:java -Dexec.mainClass="com.arep.client.Cliente""```

  Para ejecutar las pruebas: ```mvn test```
  
  Para generar javadoc con maven: ```mvn javadoc:javadoc```
  
  Para generar javadoc de las pruebas: ```mvn javadoc:test-javadoc```
  
  **IMPORTANTE:** Para poder utilizar el aplicativo es necesario compilar primero el proyecto con **mvn package**.
 
 
 ## Construido 
[Eclipse](https://www.eclipse.org/) Editor de JAVA donde se puede compilar el proyecto. 

[JUnit](https://junit.org/junit5/) Framework para pruebas en JAVA.

## Autor
Johann Sebastian Páez Campos - PARCIAL 1 - AREP 04/09/2020

## Licencia
Este programa es de uso libre, puede ser usado por cualquier persona.
