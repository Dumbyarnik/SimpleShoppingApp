package suchen.ui.view;

import java.util.ArrayList;
import suchen.bl.Ware;

public class SuchView {
    
    public SuchView(){
    }

    public void menueAnzeigen() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Warensuche");
        System.out.println("Druecken Sie 0 um zurueck zu gehen");
        System.out.println("Geben Sie eine Suchbegriff oder Warennummer zum suchen ein");
    }

    public void suchergebnissAnzeigen(ArrayList<Ware> waren) {
              
        if (waren.isEmpty()) {
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