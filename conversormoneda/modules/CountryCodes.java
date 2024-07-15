package conversormoneda.modules;

import conversormoneda.main.ArrayCodes;

import java.util.ArrayList;

public class CountryCodes {
    private String moneda;
    private String pais;
    private int id;
    public CountryCodes(int id, String pais, String moneda){
        this.id = id;
        this.pais = pais;
        this.moneda = moneda;
    }

    public CountryCodes() {

    }
public int getId(){
        return  id;
}
    public String getMoneda() {
        return moneda;
    }

    public String getPais() {
        return pais;
    }

    ArrayCodes codigos = new ArrayCodes();
    ArrayList<String> listaCodigos = codigos.ListaCodigos();
    ArrayList<String> countries = codigos.country();
    public ArrayList<CountryCodes> countryCodes (){
       ArrayList<CountryCodes> countryCodesList = new ArrayList<>();
       for (int i = 0 ; i < codigos.country().size(); i++){
           String country = codigos.country().get(i);
           String currency = codigos.ListaCodigos().get(i);
           int id = i+1;
           countryCodesList.add(new CountryCodes(id, country, currency));
       }
        return countryCodesList;
    }
}
