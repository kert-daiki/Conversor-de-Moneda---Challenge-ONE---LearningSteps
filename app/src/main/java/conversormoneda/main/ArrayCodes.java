package conversormoneda.main;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayCodes
 */
public class ArrayCodes {

  public ArrayList<String> ListaCodigos (){
    ArrayList<String> listCodes = new ArrayList<String>();
      listCodes.add("ARS");
      listCodes.add("COP");
      listCodes.add("USD");

    return listCodes;
  }
  public  ArrayList<String> country(){
    ArrayList<String> countries = new ArrayList<>();
    countries.add("Argentina");
    countries.add("Colombia");
    countries.add("Estados-Unidos");
    return  countries;
  }
  public String codigoResultado(int opcion){
    String codeResult = ListaCodigos().get(opcion-1);
    return codeResult;
  }

  
}
