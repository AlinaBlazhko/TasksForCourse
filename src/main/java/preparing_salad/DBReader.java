package preparing_salad;

import preparing_salad.vegetable.*;

import java.sql.*;
import java.util.*;

public class DBReader {

    public static void main(String[] args) {
        readDB();
    }

    public static List<Ingridient> readDB(){
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
        for (Ingridient in: ingridients) {
            System.out.println(in.getName() + " " + in.getWeight());
        }
        return ingridients;
    }
}
