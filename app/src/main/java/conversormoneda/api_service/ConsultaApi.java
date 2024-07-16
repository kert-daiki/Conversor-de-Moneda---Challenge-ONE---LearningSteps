package conversormoneda.api_service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// import com.google.gson.Gson;

/**
 * ConsultaApi
 */
public class ConsultaApi {
   public String result;
   public String base_code;
   String target_code;

   int monto;
   double conversion_rate;
   double conversion_result;

public ConsultaApi( ){

}


  // public ApiRecord(String codigoBase, String codigoTarget, int monto) {
  public String consulta(String base_code, String target_code, int monto){

    String API_KEY = "37603f151ba8f519937a76dd";
    String direccion = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/pair/"+base_code+"/"+target_code+"/"+monto;
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(direccion))
        .build();

    try {
      HttpResponse<String> response = client
          .send(request, BodyHandlers.ofString());

      // System.out.println(response.body());
//      System.out.println(direccion);
      String json = response.body();

//       return json;


      return json;
      // se tratan los erroes y se envia a RuntimeException
    } catch (IOException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }


}
