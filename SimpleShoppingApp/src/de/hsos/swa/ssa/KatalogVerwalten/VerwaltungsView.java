package KatalogVerwalten;

public class VerwaltungsView {

    private VerwaltungsControl control; 
    
    public VerwaltungsView() {
        control = new VerwaltungsControl();
    }

   public void run(){
        do{
            System.out.println("--------------------------------------------------------");
            System.out.println("DB Menue");
            System.out.println("Druecken Sie 0 um zu verlassen");
            System.out.println("Druecken Sie 1 fuer Create");
            System.out.println("Druecken Sie 2 fuer Read");
            System.out.println("Druecken Sie 3 fuer Update");
            System.out.println("Druecken Sie 4 fuer Delete");
            System.out.println("Druecken Sie 5 zum committen");
        } while(!control.run());
    }
}
