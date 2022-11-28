# elevator
## Simulador de ascensor

### Para correr el proyecto en Windows desde cmd (debe tener Maven instalado):

[Link de descarga Maven](https://maven.apache.org/download.cgi)
- Ingresar al directorio de la carpeta root del proyecto
- Ejecutar el siguiente comando:

```
mvn install
mvn compile
java -jar target\elevator-1.0-SNAPSHOT.jar
```


### Para correr el proyecto desde un IDE(*):

- File>Open project
- Seleccione el archivo descargado.
- Run>Run Project.

### Para pruebas unitarias desde un IDE:

- Click derecho sobre AscensorTest (TestPackages>com.kindalab.elevator.test)
- Run>Test File.

(*) El IDE utilizado para desarrollar el proyecto fue NetBeans 12.0, pero las indicaciones serán similares para el resto.
