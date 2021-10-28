package suchen.ui.view;

public class SuchenStartView {
  
   public SuchenStartView(){
   }

   public void run(boolean hasDaten){
      System.out.println("--------------------------------------------------------");
      System.out.println("Suchmenue");
      System.out.println("Druecken sie 0 um zurück zu gehen");
      System.out.println("Druecken sie 1 um zu Waren zu Suchen");
      
      if (hasDaten) {
         System.out.println("Druecken sie 2 um Detailsinformationen zu Waren abzurufen");
         System.out.println("Druecken sie 3 um  Waren zum Warenkorb hinzuzufuegen");
      }
      System.out.println("Druecken sie 4 um den Inhalt des Warenkorbs zu sehen");
   } 
}

