package conversormoneda.api_service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

// import com.google.gson.Gson;

/**
 * ConsultaApi
 */
public class ConsultaApi {

  // public ApiRecord(String codigoBase, String codigoTarget, int monto) {
  public ApiRecord consulta(String codigoBase, String codigoTarget, int monto){

    String API_KEY = "37603f151ba8f519937a76dd";
    String direccion = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/pair/"+codigoBase+"/"+codigoTarget+"/"+monto;
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(direccion))
        .build();

    try {
      HttpResponse<String> response = client
          .send(request, BodyHandlers.ofString());

      // System.out.println(response.body());
      String json = response.body();

      // return json;
      
      return new Gson().fromJson(json, ApiRecord.class);
      // se tratan los erroes y se envia a RuntimeException
    } catch (Exception e) {
      throw new RuntimeException("No se encuentran datos.");
    }
  }

}
