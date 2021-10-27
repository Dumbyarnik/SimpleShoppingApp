package KatalogVerwalten;

import java.util.ArrayList;
import suchen.bl.Ware;

public class ReadView {
    ReadControl control;
    
    public ReadView(){
    }

    public void menueAnzeigen() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Warensuche");
        System.out.println("Geben Sie eine Suchbegriff oder Warennummer zum suchen ein");
    }

    public void suchergebnissAnzeigen(ArrayList<Ware> waren) {
        if (waren.size() == 0) {
            wareUnbekanntAnzeigen();
        }
        
        for (Ware ware: waren) {
            wareAnzeigen(ware);
        }
    }

    private void wareAnzeigen(Ware ware) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Warennummer : " + ware.getWarennummer());
        System.out.println("Name        : " + ware.getName());
        System.out.println("Preis       : " + ware.getPreis());
        System.out.println("Beschreibung: " + ware.getBeschreibung());
    }

    private void wareUnbekanntAnzeigen() {
        System.out.println("Leider konnte kein Produkt zu ihrer Suchanfrage gefunden werden :(");
    }
}
