package tools;

import java.util.ArrayList;
import suchen.acl.WareDTO;
import suchen.acl.WarenkorbFuerSuche;

public class Warenkorb implements WarenkorbFuerSuche {

    static long warenkorbNummer = 0;
    ArrayList<WareDTO> inhalt;

    public Warenkorb(long warenkorbAnzahl) {
        warenkorbNummer++;
        inhalt = new ArrayList<WareDTO>();
    }

    public Warenkorb() {
    }

    @Override
    public void wareHinzufuegen(WareDTO ware) {
        inhalt.add(ware);
    
        //this.printInhalt();
    }

    @Override
    public long gebeWarenkorbnummer() {
        return warenkorbNummer;
    }

    public void printInhalt(){
        int counter=0;
        for (WareDTO tmp : inhalt){
            counter++;
            System.out.println(tmp.toString());
        }
        if(counter==0)
        System.out.println("Warenkorb ist leer");
    }


}