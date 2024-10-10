import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Convertidor {

    public double Convertidor(double cantidad, String moneda1, String moneda2) {

        String API_KEY = ""; // Coloca tu  API Key aquí
        String API_URL = "https://v6.exchangerate-api.com/v6/"; //Creamos la estructura de la consulta

        try {
            // Construir la URL con el monto a convertir
            String urlString = API_URL + API_KEY + "/pair/" + moneda1 + "/" + moneda2 + "/" + cantidad;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Leer la respuesta de la API
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            // Convertir el resultado a un JsonObject
            JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
            double conversionResult = jsonObject.get("conversion_result").getAsDouble();

            // Retorna el resultado
            return conversionResult;

        } catch (Exception e) {
            //System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
        }
        return -1;
    }
}
