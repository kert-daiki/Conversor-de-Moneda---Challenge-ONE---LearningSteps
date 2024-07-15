package conversormoneda.main;

import javax.swing.plaf.SpinnerUI;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import conversormoneda.api_service.ApiRecord;
import conversormoneda.api_service.ConsultaApi;


/**
 * Principal
 */
public class Principal {

  public static void main(String[] args) {
//  Gson gson = new GsonBuilder()
//          .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//          .setPrettyPrinting()
//          .create();
      Gson gson = new Gson();

            // System.out.println(consultaApi);
    ArrayCodes codigo = new ArrayCodes();
    String currencyBase = codigo.ListaCodigos(2);
    String currencyTarget = codigo.ListaCodigos(1);

//    System.out.println(currencyBase);
//    System.out.println(currencyTarget);
//
    ConsultaApi consultaApi = new ConsultaApi();
    String result = consultaApi.consulta("USD","COP",200);
    ApiRecord apiRegistro = gson.fromJson(result, ApiRecord.class);
    System.out.println("Resultado 1 "+result);
      System.out.println("Resultado 2 "+apiRegistro.conversion_result());


//  ApiRecord apiRegistro = gson.fromJson(consulta, ApiRecord.class);
    // System.out.println(String.valueOf(codigo));
//    System.out.println(consultaApi);
    
  }
}
