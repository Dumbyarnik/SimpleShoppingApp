package suchen.dal;

import java.util.ArrayList;
import suchen.bl.Ware;

public interface WarenSuche {
    public ArrayList <Ware> sucheWare(String suchbegriff);
    
}
