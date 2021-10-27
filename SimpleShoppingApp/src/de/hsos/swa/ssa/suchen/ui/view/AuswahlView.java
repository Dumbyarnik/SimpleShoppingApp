package suchen.ui.view;

import java.util.ArrayList;
import suchen.bl.Ware;

public class AuswahlView {
    
        
    public void run(ArrayList<Ware> data){
        System.out.println("Druecken sie 0 um zurück zu gehen");
        System.out.println("Waehle die jeweilige Nummer um Ware zum Warenkorb hinzuzufuegen:");
        warenAnzeigen(data);
    }

    private void warenAnzeigen(ArrayList<Ware> data) {
        for (int i=0; i<data.size(); i++ ) {
            Ware ware = data.get(i);
            System.out.println("(" + (i+1) + ") " + ware.getName());
        }
    }
}
