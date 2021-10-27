package suchen.dal;

import java.util.ArrayList;
import datenbank.Verbindung;
import suchen.bl.Ware;


public class KeywordMatching implements WarenSuche {
    private Verbindung base; 

    public KeywordMatching(Verbindung _base){
        this.base=_base;
    }
    
    public ArrayList <Ware> sucheWare(String suchbegriff){
        return base.selectWarenName(suchbegriff);
    }

}
