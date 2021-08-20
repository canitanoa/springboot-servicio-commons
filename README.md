# springboot-servicio-commons
Proyecto common para los MS

> Este proyecto funciona como libreria para los microservicios

Para eso vamos a tener que compilarlo con maven y empaquetarlo como JAR para poder implementarlo en los MS que lo consuman.
Pre-requisitos: 
En necesario tener configuradas las Variables de entorno: JAVA_HOME y PATH

> Pasos: 

- Crear un archivo "Compile.cmd" para ejecutar el archivo "mvnw.cmd" que se crea con el proyecto:

@echo off
@ECHO ***********
@ECHO GENERAR JAR
@ECHO ***********
CALL mvnw.cmd install
CD..
pause

- Correr el "Compile.cmd" que genera el JAR y lo deja en "springboot-servicio-commons\target"





