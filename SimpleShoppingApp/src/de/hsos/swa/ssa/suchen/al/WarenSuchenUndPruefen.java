package suchen.al;

import java.util.ArrayList;
import suchen.bl.Katalog;
import suchen.bl.Ware;
import suchen.bl.Produktinformation;
import suchen.dal.WarenRepository;


public class WarenSuchenUndPruefen {
    private static Katalog katalog;

    public WarenSuchenUndPruefen(){
        if(katalog == null)
            WarenSuchenUndPruefen.katalog = new WarenRepository();
    }
    public ArrayList<Produktinformation> sucheProduktInfo(Ware ware){
        return katalog.gebeProduktinformation(ware);
    } 
    
    public ArrayList<Ware> suchenPruefen(long warenNummer){
        if (WarenSuchenUndPruefen.katalog.suchen(warenNummer) == null)
            return new ArrayList<Ware>();

        return WarenSuchenUndPruefen.katalog.suchen(warenNummer);
    }
    public ArrayList<Ware> suchenPruefen(String warenName){
        if (WarenSuchenUndPruefen.katalog.suchen(warenName) == null)
            return new ArrayList<Ware>();

        return WarenSuchenUndPruefen.katalog.suchen(warenName);
    }
}

