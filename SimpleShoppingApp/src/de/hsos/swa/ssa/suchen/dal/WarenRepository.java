package suchen.dal;

import java.util.ArrayList;
import suchen.bl.Katalog;
import suchen.bl.Produktinformation;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;
//import datenbank.DataBase;
import datenbank.Verbindung;

public class WarenRepository implements Katalog {
    private static Verbindung base = new Verbindung();
    private ArrayList<Integer> warenreponr;
    private ArrayList<String> warenreponame;
    private ArrayList<String> warenrepo_beschreibung;

    private WarenSuche suchAlgorithmus;
    public WarenRepository() {
        suchAlgorithmus = new KeywordMatching(base);
    }

    public void legeSuchalgorihtmusFest(SuchAlgorithmus algo) {
        if (algo == SuchAlgorithmus.SemanticMatching) {
            suchAlgorithmus = new SemanticMatching(base);
        } else {
            suchAlgorithmus = new KeywordMatching(base);
        }
    }

/*
    public WarenRepository(Verbindung _base) {
        this.base = _base;
        this.warenreponr = new ArrayList<>();
        this.warenreponame = new ArrayList<>();
        this.warenrepo_beschreibung = new ArrayList<>();
        selectRepo(this);

        suchAlgorithmus = new KeywordMatching(); // toDo?! arrayList?! return WareDTO?!
    }*/

    WarenSuche algorithm=new KeywordMatching(base);
    public static void selectRepo(WarenRepository w) {
        base.selectRepo(w);
    }
    public ArrayList<Ware> suchen(String suchbegriff){
        return suchAlgorithmus.sucheWare(suchbegriff);
    }

    public ArrayList<Ware> suchen(long warenNummer){
        return base.selectWareNummer(warenNummer);
    }
    public ArrayList<Produktinformation> gebeProduktinformation(Ware ware){
        ArrayList<Produktinformation> a = base.selectProduktInfo(ware);
            System.out.println("Produktinformation: " + a.toString());    
        return a;


    }   


    @Override
    public String toString() {
        return  ", warenrepo_beschreibung=" + warenrepo_beschreibung + ", warenreponame=" + warenreponame + ", warenreponr=" + warenreponr + "]";
    }

    public ArrayList<Integer> getWarenreponr() {
        return warenreponr;
    }

    public void setWarenreponr(Integer warenreponr) {
        this.warenreponr.add(warenreponr);
    }

    public ArrayList<String> getWarenreponame() {
        return warenreponame;
    }

    public void setWarenreponame(String warenreponame) {
        this.warenreponame.add(warenreponame);
    }

    public ArrayList<String> getWarenrepo_beschreibung() {
        return warenrepo_beschreibung;
    }

    public void setWarenrepo_beschreibung(String warenrepo_beschreibung) {
        this.warenrepo_beschreibung.add(warenrepo_beschreibung);
    }

    public WarenSuche getSuchAlgorithmus() {
        return suchAlgorithmus;
    }

    public void legeSuchalgorihtmusFest(WarenSuche suchAlgorithmus) {
        this.suchAlgorithmus = suchAlgorithmus;
    }


  

}
