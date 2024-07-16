package conversormoneda.modules;

import conversormoneda.main.ArrayCodes;

import java.util.ArrayList;

public class UserMenu {
    ArrayCodes codigo = new ArrayCodes();
    CountryCodes countryCodes = new CountryCodes();
    ArrayList<String> listaCodigos = codigo.ListaCodigos();
    ArrayList<String> countries = codigo.country();
    public void UserMenu(){


        System.out.println("Bienvenido al Latam Exchange Money");
        System.out.println("-------------------------\n");
        System.out.println("Las Monedas Diponibles son:");

//        for (String item: codigo.ListaCodigos()){
//            System.out.println("- "+item);
//        }
    }
    public void ListaDePaises(){
        for (CountryCodes coObj: countryCodes.countryCodes()){
            System.out.println("     -"+coObj.getId()+" "+coObj.getPais() +" - Moneda: "+ coObj.getMoneda() );
        }
    }
    public void MenuSelect(){
        System.out.println("1 - Escoger moneda base");
        System.out.println("2 - Terminar programa");
        System.out.println("-------------------------\n");
    }
    public void MensajeSelecciona(){
        System.out.println("Escribe el numero del pais al que desea pasar");
        System.out.println("Si deseas cancelar oprime 4");
    }
    public void TargetCurrencySelect() {
        for (CountryCodes coObj : countryCodes.countryCodes()) {
            System.out.println("     -" + coObj.getId() + " " + coObj.getPais() + " - Moneda: " + coObj.getMoneda());
        }
        System.out.println("Escoge la moneda a la que quieres pasar");
    }
}
