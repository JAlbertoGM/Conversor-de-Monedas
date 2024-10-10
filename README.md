# Conversor de Monedas en Java

Este es un programa de conversión de monedas desarrollado en Java que permite convertir de una divisa base a una nueva divisa utilizando la API de **ExchangeRate API**. El programa se apoya en la librería Gson para manejar el formato JSON, que es utilizado para procesar las respuestas de la API.

## Características

- Conversión de una moneda base a otra moneda de destino.
- Conexión a la API de **ExchangeRate API** para obtener los tipos de cambio actuales.
- Uso de la librería Gson para el procesamiento de datos en formato JSON.
- Incluye un archivo `.jar` de Gson (versión `gson-2.11.0`) que debe ser agregado antes de ejecutar el programa.

## Estructura del Código

### Clase Principal: `Main.java`

Este archivo contiene el punto de entrada del programa. Aquí se gestionan las interacciones del usuario para ingresar las divisas y se invoca la lógica de conversión proporcionada por la clase `Convertidor.java`.

### Clase `Convertidor.java`

En esta clase se encuentra la lógica principal del programa, donde se realiza la conexión a la API de **ExchangeRate API** y se ejecuta la consulta de conversión de moneda. El flujo del programa es el siguiente:

1. Se pasa la divisa base al programa.
2. Se solicita a la API el valor de la nueva divisa.
3. Se utiliza Gson para procesar la respuesta JSON.
4. Se retorna el valor de la conversión.

### 1. Clave de Acceso a la API
Para utilizar este programa correctamente, cada usuario debe generar su propia clave de acceso a la API de **ExchangeRate**. Esto se puede hacer desde el siguiente enlace: [ExchangeRate API](https://www.exchangerate-api.com/).

Una vez generada la clave, debes incluirla en el archivo `Convertidor.java` donde se maneja la conexión con la API.
String apiKey = "TU_CLAVE_DE_API";

### 2. Incluir el Archivo `.jar` de Gson

El programa utiliza la librería **Gson** para procesar las respuestas en formato JSON. Debes incluir el archivo `gson-2.11.0.jar`, que se encuentra en la carpeta `jars`, en tu proyecto antes de ejecutar el programa. Esto se puede hacer configurando el classpath correctamente o agregando el `.jar` a las bibliotecas del proyecto.

## Instalación y Ejecución

### Clonar este repositorio:

```bash
git clone https://github.com/JAlbertoGM/Conversor-de-Monedas.git
```
1. Descargar la librería **Gson** (si no está ya incluida en la carpeta `jars`) desde [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson).

2. Añadir la librería Gson al classpath del proyecto:

   Si usas un IDE (como Eclipse o IntelliJ), añade el archivo `.jar` a las dependencias del proyecto.

3. Ejecutar el programa:

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar el programa.
- **ExchangeRate API**: API utilizada para obtener los tipos de cambio actuales.
- **Gson**: Librería utilizada para procesar los datos en formato JSON.


