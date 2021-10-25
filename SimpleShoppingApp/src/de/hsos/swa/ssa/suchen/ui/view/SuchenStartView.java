package suchen.ui.view;

import suchen.al.EinkaeuferIn;

public class SuchenStartView {
   EinkaeuferIn einkaeuferIn;
   SuchenStartControl control;
  
   public SuchenStartView(){
      einkaeuferIn = new EinkaeuferIn();
      control = new SuchenStartControl(einkaeuferIn);
   }

   public void run(){
      do 
      {
         menueAnzeigen();
      } while(!control.run());
   } 

   private void menueAnzeigen() {
      System.out.println("--------------------------------------------------------");
      System.out.println("Suchmenue");
      System.out.println("Druecken sie 0 um zurück zu gehen");
      System.out.println("Druecken sie 1 um zu Waren zu Suchen");
      
      if (control.hasSuchdaten()) {
         System.out.println("Druecken sie 2 um Detailsinformationen zu Waren abzurufen");
         System.out.println("Druecken sie 3 um zu Waren zum Warenkorb hinzuzufuegen");
      }
   }
}

