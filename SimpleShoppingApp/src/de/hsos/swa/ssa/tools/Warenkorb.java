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
    
        this.printInhalt();
    }

    @Override
    public long gebeWarenkorbnummer() {
        return warenkorbNummer;
    }

    private void printInhalt(){
        for (WareDTO tmp : inhalt){
            System.out.println(tmp.getName());
        }
    }


}