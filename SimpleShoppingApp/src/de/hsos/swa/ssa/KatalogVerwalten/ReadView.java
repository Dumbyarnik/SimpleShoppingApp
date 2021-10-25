package KatalogVerwalten;

import java.util.ArrayList;

import datenbank.DataBase;
import suchen.bl.Ware;

public class ReadView {
    ReadControl control;
    
    public ReadView(DataBase db){
        control = new ReadControl(db);
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
