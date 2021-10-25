package ui.view;
public class MenueView {
    private MenueControl control;
    
    MenueView() {
        control = new MenueControl();
    }

    void run(){
        do{
            System.out.println("--------------------------------------------------------");
            System.out.println("Shop Menue");
            System.out.println("Druecken sie 0 um den Shop zu verlassen");
            System.out.println("Druecken sie 1 um nach Waren zu suchen");
            System.out.println("Druecken sie 2 um zum Warenkorb zu gelangen");
            System.out.println("Druecken sie 3 um zur Kasse zu gehen");
        } while(!control.run());
    }
}
