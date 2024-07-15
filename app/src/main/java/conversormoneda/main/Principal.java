package conversormoneda.main;

import javax.swing.plaf.SpinnerUI;

import conversormoneda.api_service.ConsultaApi;

/**
 * Principal
 */
public class Principal {

  public static void main(String[] args) {
    ConsultaApi consultaApi = new ConsultaApi();

    // System.out.println(consultaApi);

    ArrayCodes codigo = new ArrayCodes();
    String currencyBase = codigo.ListaCodigos(2);
    String currencyTarget = codigo.ListaCodigos(1);

    System.out.println(currencyBase);
    System.out.println(currencyTarget);
    
    consultaApi.consulta(currencyBase,currencyTarget,2000);
    // System.out.println(String.valueOf(codigo));
    System.out.println(consultaApi);
    
  }
}
