package tools;

import java.util.ArrayList;

import suchen.acl.WareDTO;
import suchen.acl.WarenkorbFuerSuche;

public class Warenkorb implements WarenkorbFuerSuche {
    static long warenkorbNummer = 0;
    ArrayList<WareDTO> inhalt = new ArrayList();

    public Warenkorb(long warenkorbAnzahl) {
        warenkorbNummer++;
    }

    public Warenkorb() {
    }

    @Override
    public void wareHinzufuegen(WareDTO ware) {
        inhalt.add(ware);

    }

    @Override
    public long gebeWarenkorbnummer() {
        return warenkorbNummer;
    }

}