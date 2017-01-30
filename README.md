# Proyecto de Grado
Facultad de Ingeniería, UDELAR, 2016

# Introducción
Este repositorio contiene la implementación del proyecto de grado "Desarrollo de interfaces gráficas a partir de mockups."

El proyecto consta principalmente de 2 componentes el backend que brinda soporte para el

### Backend
El backend esta encargado del manejo de la información, publicando los respectivos puntos de acceso para acceder a la misma.

Consta de los siguientes componentes:
* `api:` proyecto que publica endpoints específicos utilizando un micro framework llamado Spark.
* `ifml:` ecore modeling project que contiene el metamodelo base de ifml y las clases generadas para poder llevar a cabo la generación del IFML.

### Frontend
El proyecto frontend contiene todo lo necesario para la interacción con el backend, así como las funcionalidades de creación y armado de mockups. Este proyecto está implementado en javascript, más precisamente en angularjs.


# Instalación

### Backend
Descargar Eclipse Modeling Framework IDE. Tener en cuenta que la distribución de eclipse que se descarguen debe tener instalado Maven.
Se debe definir una Classpath variable de nombre EMFPLUGINS, con la cual apuntamos a la carpeta plugins del eclipse instalado. Los proyectos ya tienen en su classpath registros que apuntan a dicha carpeta.

### Frontend
Para levantar el proyecto frontend utilizamos Grunt, una librería para automatizar la ejecución de tareas. Utilizamos también Yeoman para la generación de templates, bower para la instalación de librerías y compass para compilar las hojas de estilo.

La instalación de estos componentes se realiza a través de npm:
```
> npm install -g grunt-cli bower yo generator-karma generator-angular
> gem install compass --pre
```

# Uso
Es necesario tener el backend en ejecución el cual publica en determinado puerto configurable los servicios de generación de IFML y luego ejecutar la aplicación frontend.

### Backend
Instanciar el proyecto api en eclipse y ejecutar como Java Application. Actualmente el proyecto tiene configurado el puerto 4567 y se puede verificar accediendo vía GET al siguiente endpoint `localhost:4567/status` retornando OK en caso de éxito.

### Frontend
Dirigirse al directorio del proyecto.
```
> bower install
> grunt serve
```

La interfaz queda disponible desde la dirección http://localhost:9000
