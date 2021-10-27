package suchen.bl;

import java.util.ArrayList;

public class Ware {
    private int warennummer;
    private String name;
    private String beschreibung;
    private String typ;
    private double geld;
    private int repo;
    private ArrayList<Produktinformation> produktinformationen = new ArrayList<Produktinformation>();
  
    public Ware(int _warennummer, String _name,  String _beschreibung, 
            String _typ, double _geld, int _repo){
        this.warennummer = _warennummer;
        this.name = _name;
        this.geld = (_geld);
        this.beschreibung = _beschreibung;
        this.repo = _repo;
        this.typ = _typ;
    }
    
    public long getWarennummer() {
        return warennummer;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return geld;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getTyp() {
        return typ;
    }

    public int getRepo() {
        return repo;
    }
 
    @Override
    public String toString() {
        return "Ware [beschreibung=" + beschreibung + ", geld=" + geld + ", name=" + name + ", repo=" + repo + ", typ="
                + typ + ", warennummer=" + warennummer + "]";
    }

    public ArrayList<Produktinformation> getProduktinformationen() {
        return this.produktinformationen;
    }
    
    public void setProduktinformationen(ArrayList<Produktinformation> produktinformationen) {
        this.produktinformationen = produktinformationen;
    }

    public void setWarennummer(int warennummer) {
        this.warennummer = warennummer;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGeld(double geld) {
        this.geld = geld;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public void setRepo(int repo) {
        this.repo = repo;
    }

}
