package KatalogVerwalten;

public class CreateView {
    CreateControl control;
    
    public CreateView() {
        //control = new CreateControl(db);
    }
    
    public void run() {   
        System.out.println("Druecken sie 0 um zurück zu gehen");
        System.out.println("Bitte Warenname eingaben:");
        control.setWarenname();
        System.out.println("Bitte Beschreibung eingeben:");
        control.setWarenBeschreibung();
        System.out.println("Bitte Warentyp eingeben:");
        control.setWarenTyp();
        System.out.println("Bitte Preis eingeben:");
        control.setWarenPreis();
        //System.out.println("Bitte RepoNr eingeben:");
        
        control.run(); 
    }

    
}
