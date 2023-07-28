# SECCION 7 - MANEJO DE ERRORES

## 1) Creando nueva aplicacion y controlador

    - Personalizacion de paginas de error, ejemplo: error 500 por falta de vista index para retornar

## 2) Personalizando errores 404 y 500

    - Personalizacion de Error 500, de que no existe la plantilla
    - Creamos en template un dir para 'error' y creamos el 500.html para manejar dicho error

## 3) Anotacion @ControllerAdvice para manejo de excepciones

    - Personalizar una excepcion en particular, ejemplo: divison por cero, aritmetic error
    - Manejar este error mediante un controlador especial
    - Creamos el controlador como siempre PERO EN VEZ DE '@Controller', es '@ControllerAdvice'
        -> NO MAPEA A UNA RUTA, mapea a una excepcion, un metodo que lo manejamos mediante una vista

## 4) Personalizando pagina de error para la excepcion NumberFormatException

    - Cuando queremos convertir de un String a un integer pero viene con otro formato -> NumberFormatException

## 5) Manejando excepcion personalizada creando clases Model y Service

    - Mas completo: Creamos una propia clase de excepcion para usuarios, idea tener una lista de usuario y buscar por id
    SI NO ENCUENTRA el id de usuario lanzamos la excepcion y lo manejamos como queramos
    - Creamos el modelo con los atributos, getters, setters y constructores
    - Creamos el service para el usuario que va a contener el 'contrato', metodos a usar, Listar y ObtenerPorId
    - Creamos el serviceImplement para usuario con la instanciacion de objetos usuarios y agregamos usuarios manualmente a un arreglo
    ( MAS TARDE SE TRABAJARA CON BASE DE DATOS)
    Luego, creamos los metodos Listar, para listar justamente el arrayList que definimos antes
    y el obtenerPorId para iterar por los usuarios con sus ID's y mostrarlos mas adelante

## 6) Agregando metodo handler VER

    - Agregamos como veniamos haciendo con el GetMapping y demas.
    - Veremos que el 'ver/id' con ID == null nos tira el error NullPointerException
    - La idea es crear un handler para el error pero especifico para cuando usuario es igual a null, no para todo 
    NullPointerException

## 7) Creando clase Excepcion personalizada para 'Usuario' NullPointerExcepcion (id == null)

    - Creamos el package error e implementamos la clase UsuarioNoEncontradoException

## 8) Lanzamiento de excepcion usando Api Optional de Java 8







