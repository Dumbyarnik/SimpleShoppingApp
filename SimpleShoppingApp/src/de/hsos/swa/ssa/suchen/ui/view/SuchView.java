package suchen.ui.view;
import java.util.ArrayList;

import suchen.al.EinkaeuferIn;
import suchen.bl.Ware;

public class SuchView {
    SuchControl control;
    
    public SuchView(EinkaeuferIn einkaeuferIn){
        control = new SuchControl(einkaeuferIn);
    }
    
    public ArrayList<Ware> run(){
        do {   
            menueAnzeigen();
        } while(!control.run());

        suchergebnissAnzeigen();
        return control.getSuchergebniss();
    }

    public void menueAnzeigen() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Warensuche");
        System.out.println("Druecken Sie 0 um zurueck zu gehen");
        System.out.println("Geben Sie eine Suchbegriff oder Warennummer zum suchen ein");
    }

    private void suchergebnissAnzeigen() {
        ArrayList<Ware> waren = control.getSuchergebniss();
        
        if (waren.size() == 0) {
            wareUnbekanntAnzeigen();
        }
        
        for (Ware ware: waren) {
            wareAnzeigen(ware);
        }
    }

    public void wareAnzeigen(Ware ware) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Warennummer : " + ware.getWarennummer());
        System.out.println("Name        :        " + ware.getName());
        System.out.println("Preis       : " + ware.getPreis());
        System.out.println("Beschreibung: " + ware.getBeschreibung());
    }

    public void wareUnbekanntAnzeigen() {
        System.out.println("Leider konnte kein Produkt zu ihrer Suchanfrage gefunden werden :(");
    }
}