/*
    Interface for all the functions database need
*/

package datenbank;

import java.util.ArrayList;
import suchen.bl.Produktinformation;
import suchen.bl.Ware;
import suchen.dal.WarenRepository;

public interface DataBase {
    
    public void keepconnected();
    public void commit();
    public ArrayList<Ware> selectWaren();
    public ArrayList<Ware> selectWarenName(String name);
    public ArrayList<Ware> selectWareNummer(long nr);
    public ArrayList<Produktinformation> selectProduktInfo(Ware ware);
    public ArrayList<Ware> selectWarenBeschreibung(String beschreibung);
    public void selectRepo(WarenRepository w);
    public void insert(String[] args);
    public void delete(String args);
    public void update(String[] args);

}