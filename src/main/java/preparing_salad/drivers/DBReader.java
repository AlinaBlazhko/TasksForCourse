package preparing_salad.drivers;

import preparing_salad.Ingridient;
import preparing_salad.vegetable.*;

import java.sql.*;
import java.util.*;

public class DBReader implements Reader{


//        try {
//            Connection con = DriverManager.getConnection
//                    ("jdbc:derby:junkdb;create=true","app","app");
//
//            Statement stmt = con.createStatement();
//
//            stmt.executeUpdate("CREATE TABLE VEGETABLES (ID INT PRIMARY KEY, VEGETABLE VARCHAR(12), WEIGHT INT)");
//            System.out.println("Created Table");
//
//            stmt.executeUpdate("INSERT INTO VEGETABLES VALUES (1,'potato', 300),(2,'cucumber', 200),(3,'onion', 40)");
//            System.out.println("Populated Table");
//
//            System.out.println("Done");
//
//        } catch(SQLException e) {
//            System.out.println("SQL exception occured" + e.toString() );
//        }



    @Override
    public List<Ingridient> read() {
        List<Ingridient> ingridients = new ArrayList<Ingridient>();
        ResultSet resultSet = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            Connection con = DriverManager.getConnection
                    ("jdbc:derby:junkdb;create=true","app","app");

            Statement stmt = con.createStatement();
            resultSet = stmt.executeQuery("SELECT * FROM VEGETABLES");



        } catch(SQLException e) {
            System.out.println("SQL exception occured" + e.toString() );
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while (resultSet.next()){
                switch (resultSet.getString("VEGETABLE")){
                    case "carrot": ingridients.add(new Ingridient(new Carrot(), resultSet.getInt("WEIGHT")));
                        break;
                    case "cucumber": ingridients.add(new Ingridient(new Cucumber(), resultSet.getInt("WEIGHT")));
                        break;
                    case "onion": ingridients.add(new Ingridient(new Onion(), resultSet.getInt("WEIGHT")));
                        break;
                    case "potato": ingridients.add(new Ingridient(new Potato(), resultSet.getInt("WEIGHT")));
                        break;
                    case "pumpkin": ingridients.add(new Ingridient(new Pumpkin(), resultSet.getInt("WEIGHT")));
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Your order: ");
        for (Ingridient in: ingridients) {
            System.out.println(in.getName() + " " + in.getWeight());
        }
        return ingridients;
    }
}
