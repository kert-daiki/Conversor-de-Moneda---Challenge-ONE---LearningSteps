package conversormoneda.main;




import com.google.gson.Gson;

import conversormoneda.api_service.ApiRecord;
import conversormoneda.api_service.ConsultaApi;
import conversormoneda.modules.UserMenu;

import java.util.Scanner;


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


    UserMenu menu = new UserMenu();
    Scanner lectura = new Scanner(System.in);
    menu.UserMenu();
    menu.ListaDePaises();
    menu.MenuSelect();
    String baseCurrSelected = null;
    var sel1 = lectura.nextInt();
    int pais1 = 0;
    int pais2 = 0;
//
    ArrayCodes codigo = new ArrayCodes();


  switch (sel1) {
    case 1:
       menu.ListaDePaises();
       menu.MensajeSelecciona();
       pais1 = lectura.nextInt();
      switch (pais1) {
        case 1 -> baseCurrSelected = codigo.codigoResultado(pais1);
        case 2 -> baseCurrSelected = codigo.codigoResultado(pais1);
        case 3 -> baseCurrSelected = codigo.codigoResultado(pais1);
        case 4 -> {
          System.out.println("Finalizando programa.");
          System.exit(0);
        }
      }
      System.out.println("Seleccionaste: "+baseCurrSelected);

      menu.TargetCurrencySelect();
      pais2 = lectura.nextInt();
      switch (pais2){
        case 1 -> baseCurrSelected = codigo.codigoResultado(pais2);
        case 2 -> baseCurrSelected = codigo.codigoResultado(pais2);
        case 3 -> baseCurrSelected = codigo.codigoResultado(pais2);
        case 4 -> {
          System.out.println("Finalizando programa.");
          System.exit(0);
        }
        default -> throw new IllegalStateException("Unexpected value: " + pais2);
      }
      System.out.println("Seleccionaste: "+baseCurrSelected);
      break;
    case 2:
      System.out.println("Programa Finalizado");
      System.out.println("Gracias por usar nuetros servicos.");
      System.exit(0);
      break;
    default:
      throw new IllegalStateException("Unexpected value: " + sel1);
  }


    String currencyBase = codigo.codigoResultado(pais1);
    String currencyTarget = codigo.codigoResultado(pais2);


    ConsultaApi consultaApi = new ConsultaApi();
    String result = consultaApi.consulta(currencyBase,currencyTarget,200);
    ApiRecord apiRegistro = gson.fromJson(result, ApiRecord.class);
    System.out.println("Resultado 1 "+result);
      System.out.println("Resultado 2 "+apiRegistro.conversion_result());



    
  }
}