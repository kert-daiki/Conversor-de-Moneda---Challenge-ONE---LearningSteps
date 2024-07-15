package conversormoneda.main;

import java.util.ArrayList;

/**
 * ArrayCodes
 */
public class ArrayCodes {
  public String ListaCodigos (int opcion){
    ArrayList<String> listCodes = new ArrayList<String>();
      listCodes.add("ARS");
      listCodes.add("COP");
      listCodes.add("USD");
    
    String codigoResultado = listCodes.get(opcion);

    return codigoResultado;
  }

  
}
