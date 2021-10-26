package KatalogVerwalten;

public class UpdateView {
    UpdateControl control;

    public UpdateView() {
        //control = new UpdateControl(db);
    }

    public void run() {
        System.out.println("Druecken sie 0 um zurück zu gehen");
        System.out.println("Bitte zu aendernde WarenNummer eingeben:");
        control.setWarenNummer();
        System.out.println("Bitte Warenname eingeben:");
        control.setWarenname();
        System.out.println("Bitte Beschreibung eingeben:");
        control.setWarenBeschreibung();
        System.out.println("Bitte Warentyp eingeben:");
        control.setWarenTyp();
        System.out.println("Bitte Preis eingeben:");
        control.setWarenPreis();
        control.run(); 
    }
}
