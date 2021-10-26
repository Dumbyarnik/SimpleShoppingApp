package datenbank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import suchen.bl.Produktinformation;
import suchen.bl.Ware;
import suchen.dal.WarenRepository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
Connecting to: jdbc:mysql://localhost:3306/simpleshop?user=root&password=test&serverTimezone=UTC
java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/simpleshop?user=root&password=test&serverTimezone=UTC
 */

public class Verbindung implements DataBase {

    //private static String CONN = "jdbc:mysql://localhost:3306/SimpleShop"; // hier bitte link zur Datenbank eingeben

    // Logins
    static final String USER = "root"; // hier User
    static final String PASS = "root"; // hier Passwort
    static Connection dbc;

    private static Connection connect() throws SQLException {
        String connectStr = "jdbc:mysql://localhost:3306/SimpleShop?user=root&password=root&serverTimezone=UTC";
        System.out.println("Connecting to: " + connectStr);
        return DriverManager.getConnection(connectStr);
        //return DriverManager.getConnection(CONN, USER, PASS);
    }

    public void keepconnected() {
        try {
            dbc = connect();
        } catch (SQLException se) {
            System.out.println(se);
        }
    }

    public void commit()
    {
        try {
            dbc.commit();
        } catch (SQLException se) {
            System.out.println(se);
        }
    }


    public void selectWaren() {
        try {
            Statement stmt = dbc.createStatement();
            ResultSet result = stmt.executeQuery("select * from simpleshop.ware");
            while (result.next()) {
                for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
                    System.out.println(result.getMetaData().getColumnName(i) + ": " + result.getObject(i));
                }
                System.out.println("");
            }
        } catch (SQLException se) {
            System.out.println(se);

        }
    }

    public ArrayList<Ware> selectWarenName(String name) {
        Ware w = null;
        try {
            ArrayList<Ware> aw = new ArrayList<>();
            // ArrayList<Ware> waren = new ArrayList<>();
            Statement stmt = dbc.createStatement();
            int i = 1;

            ResultSet result = stmt.executeQuery("select * from simpleshop.ware where warenname= '" + name + "'");

            while (result.next()) {
                /*
                 * for(int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
                 * System.out.println("Column Name: " + result.getMetaData().getColumnName(i) +
                 * " Value: " +result.getObject(i)); }
                 */

               // w = new Ware((long) result.getObject(i), (String) result.getObject(i + 1),(String) result.getObject(i + 2), (String) result.getObject(i + 3));


                String bg = (String)result.getObject(i+4);
                double d = Double.parseDouble(bg);//.doubleValue();
                System.out.println("Suche Warenname: " + name);
                w = new Ware((int)result.getObject(i), (String)result.getObject(i+1), (String)result.getObject(i+2), (String)result.getObject(i+3), d, (int)result.getObject(i+6));
                aw.add(w);          

                System.out.println("Warenname: " + name);
                System.out.println("beschreibung: " + w.getBeschreibung());
            }
            
            System.out.println("");
            return aw;
        } catch (SQLException se) {
            System.out.println(se);
        }
        return null;
    }


    public ArrayList<Ware> selectWareNummer(long nr) {
        try {
           Ware w = null;
           ArrayList<Ware> aw = new ArrayList<>();
           Statement stmt = dbc.createStatement();
           int i = 1;
           ResultSet result = stmt.executeQuery("SELECT * from simpleshop.ware where warennr = '" + nr + "'");
           while(result.next()) {
              String bg = (String)result.getObject(i+4);
              double d = Double.parseDouble(bg);
              System.out.println("Suche Warennr: " + nr);
              w = new Ware((int)result.getObject(i), (String)result.getObject(i+1), (String)result.getObject(i+2), (String)result.getObject(i+3), d, (int)result.getObject(i+6));
              aw.add(w);
              System.out.println("");
              return aw;          
           }
           System.out.println("");
           return null;
        } catch (SQLException se) {
           System.out.println(se);
        }
        return null;
    }

    /*
    public static void selectProduktInfo(Ware ware) {
        try (Connection dbc = connect()) {
            Produktinformation w;
            Statement stmt = dbc.createStatement();
            ResultSet result = stmt.executeQuery(
                    "select * from simpleshop.produktinformation where ware_warennr= '" + ware.getWarennummer() + "'");
            int i = 1;
            while (result.next()) {

                // w= new Ware((int)result.getObject(i), (String)result.getObject(i+1),
                // (String)result.getObject(i+2), (String)result.getObject(i+3),
                // (int)result.getObject(i+4));
                // System.out.println("WarenInfo: ", w.info);
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
*/

    public ArrayList<Produktinformation> selectProduktInfo(Ware ware) {
        try {
           Produktinformation p = null;
           ArrayList<Produktinformation> aw = new ArrayList<>();
           System.out.println("");
           Statement stmt = dbc.createStatement();
           int i = 1;
           ResultSet result = stmt.executeQuery("SELECT * from simpleshop.produktinformation where ware_warennr = '" + ware.getWarennummer()+ "'");
           while(result.next()) {
              System.out.println("Suche Produktinformation warennr: " + ware.getWarennummer());
              // Produktinformation(int _id, String  _neueBezeichnung, int _ware_nr)
              p = new Produktinformation((int)result.getObject(i), (String)result.getObject(i+1), (int)result.getObject(i+2));
              aw.add(p);          
           }
           System.out.println("");
           return aw;
        } catch (SQLException se) {
           System.out.println(se);
        }
        return null;
     }
  

     public ArrayList<Ware> selectWarenBeschreibung(String beschreibung) {

        try {
           Ware w = null;
           ArrayList<Ware> aw = new ArrayList<>();
           System.out.println("");
           Statement stmt = dbc.createStatement();
           int i = 1;
           ResultSet result = stmt.executeQuery("SELECT * from simpleshop.ware where ware_beschreibung = '" + beschreibung + "'");
           while(result.next()) {
              //System.out.println("Suche Produktbeschreibung warennr: " + beschreibung);
              // Produktinformation(int _id, String  _neueBezeichnung, int _ware_nr)
              w = new Ware((int)result.getObject(i), (String)result.getObject(i+1), (String)result.getObject(i+2), (String)result.getObject(i+3), (double)result.getObject(i+4), (int)result.getObject(i+6));
              aw.add(w);
              System.out.println("");
              return aw;                  
           }
           System.out.println("");
           return aw;
        } catch (SQLException se) {
           System.out.println(se);
        }
        return null;
     }
  

  
     public void selectRepo(WarenRepository w) {
        try {
  
           System.out.println("");
           Statement stmt = dbc.createStatement();
           int i = 1;
           ResultSet result = stmt.executeQuery("SELECT * from simpleshop.warenrepository ");
           while(result.next()) {
              System.out.println("selectRepo");
             // public WarenRepository(int _warenreponr, String _warenreponame, String _warenrepo_beschreibung){
                w.setWarenreponr((Integer)result.getObject(i));
                w.setWarenreponame((String)result.getObject(i+1));
                w.setWarenrepo_beschreibung((String)result.getObject(i+2));
  
           }
           System.out.println("");
        } catch (SQLException se) {
           System.out.println(se);
        }
     }


    /*
    public static void select(String arg) {
        try (Connection dbc = connect()) {
            Statement stmt = dbc.createStatement();
            // ResultSet result = stmt.executeQuery("SELECT ware_warennr from
            // simpleshop.warenrepository JOIN simpleshop.ware ON
            // warenrepository.ware_warennr = ware.warennr WHERE ware.warenname =
            // '"+arg+"'");
            ResultSet result = stmt.executeQuery(
                    "select * from simpleshop.warenrepository w1, simpleshop.ware w2 where w1.ware_warennr = w2.warennr");
            // ResultSet result = stmt.executeQuery("SELECT * from simpleshop.user");
            while (result.next()) {
                for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
                    System.out.println(
                            "Column Name: " + result.getMetaData().getColumnName(i) + " Value: " + result.getObject(i));
                }

                System.out.println();
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    */

    public void insert(String[] args) {
        System.out.println("insert");
        try {
            dbc.setAutoCommit(false);
            PreparedStatement ppStmt = dbc.prepareStatement("INSERT INTO simpleshop.ware VALUES (?,?,?,?,?,?,?)");
            ppStmt.setString(1, null); //because autoincrement
            ppStmt.setString(2, args[1]); //name
            ppStmt.setString(3, args[2]); //beschreibung
            ppStmt.setString(4, args[3]); //typ
            ppStmt.setString(5, args[4]); //preis
            ppStmt.setString(6, "EUR"); //einheit - the one and only
            ppStmt.setString(7, args[6]); //RepoNr
            ppStmt.execute();

            /*
            PreparedStatement ppStmt2 = dbc.prepareStatement("INSERT INTO simpleshop.produktinformation VALUES (?,?,?)");
            ppStmt2.setString(1, args[1]);
            ppStmt2.setString(2, args[8]);
            ppStmt2.setString(3, args[9]);*/
        } catch (SQLException se) {
            System.out.println(se);
        }
    }

    public void delete(String args) {
        System.out.println("delete");
        try {
            dbc.setAutoCommit(false);
            PreparedStatement ppStmt = dbc.prepareStatement("DELETE FROM simpleshop.ware  WHERE warennr = ?");
            ppStmt.setString(1, args);
            ppStmt.execute();
        } catch (SQLException se) {
            System.out.println(se);
        }
    }

    public void update(String[] args) {
 

        // Second SQL UPDATE Query to update record.
       // String query2 = "Update MyTable2 Set FirstName='Bradly' where age = '53'";

        // Third SQL SELECT Query to retrieve updated records.

        try {
            dbc.setAutoCommit(false);
            String query1 = "Update simpleshop.ware Set warenname= '"+ args[1] +"' Where warennr = '"+ args[0]+"'";
            Statement stmt = dbc.createStatement();
            stmt.executeUpdate(query1);
            String query2 = "Update simpleshop.ware Set ware_beschreibung= '"+ args[2] +"' Where warennr = '"+ args[0]+"'";
            Statement stmt2 = dbc.createStatement();
            stmt2.executeUpdate(query2);
            String query3 = "Update simpleshop.ware Set ware_typ= '"+ args[3] +"' Where warennr = '"+ args[0]+"'";
            Statement stmt3 = dbc.createStatement();
            stmt3.executeUpdate(query3);
            String query4 = "Update simpleshop.ware Set ware_preis= '"+ args[4] +"' Where warennr = '"+ args[0]+"'";
            Statement stmt4 = dbc.createStatement();
            stmt4.executeUpdate(query4);
            String query5 = "Update simpleshop.ware Set ware_einheit= '"+ "EUR" +"' Where warennr = '"+ args[0]+"'";
            Statement stmt5 = dbc.createStatement();
            stmt5.executeUpdate(query5);
            String query6 = "Update simpleshop.ware Set ware_einheit= '"+ args[6] +"' Where warennr = '"+ args[0]+"'";
            Statement stmt6 = dbc.createStatement();
            stmt6.executeUpdate(query6);
/*
            Statement stmt = dbc.createStatement();
            int count = stmt.executeUpdate(ppStmt2);
            System.out.println("Number of rows updated by executing query1 =  " + count);

            // Executing SQL SELECT query using executeQuery() method of Statement object.
            String query99 = "SELECT * FROM simpleshop.ware";
            ResultSet rs = stmt.executeQuery(query99);
            System.out.println("Result of executing query3 to display updated records");
            //System.out.println("ID " + "\t" + "FirstName" + "\t" + "LastName" + "\t" + "Age");

            // looping through the number of row/rows retrieved after executing SELECT
            // query3
            while (rs.next()) {
                System.out.print(rs.getString("warenname") + "\t");
                System.out.print(rs.getString("ware_beschreibung") + "\t" + "\t");
                System.out.print(rs.getString("ware_typ") + "\t" + "\t");
                System.out.println(rs.getString("ware_preis") + "\t");
                System.out.println(rs.getString("ware_einheit") + "\t");
            }*/

        } catch (SQLException se) {
            System.out.println(se);
        }
    }



}