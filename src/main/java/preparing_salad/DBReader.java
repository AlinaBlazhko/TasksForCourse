package preparing_salad;

import java.sql.*;

public class DBReader {
    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            Connection con = DriverManager.getConnection
                    ("jdbc:derby:junkdb;create=true","app","app");

            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM VEGETABLES");

            while (resultSet.next()){
                System.out.println(resultSet.getString("VEGETABLE"));
            }

//            stmt.executeUpdate("CREATE TABLE VEGETABLES (ID INT PRIMARY KEY, VEGETABLE VARCHAR(12), CALORIES INT)");
//            System.out.println("Created Table");
//
//            stmt.executeUpdate("INSERT INTO VEGETABLES VALUES (1,'TOM', 200),(2,'BILL', 300)");
//            System.out.println("Populated Table");
//
//            System.out.println("Done");


        } catch(SQLException e) {
            System.out.println("SQL exception occured" + e.toString() );
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
//    private static String dbURL = "jdbc:derby://localhost:1527/myDB;create=true;user=me;password=mine";
//    private static String tableName = "restaurants";
//    // jdbc Connection
//    private static Connection conn = null;
//    private static Statement stmt = null;
//
//    public static void main(String[] args) {
//        createConnection();
//        insertRestaurants(5, "LaVals", "Berkeley");
//        selectRestaurants();
//        shutdown();
//    }
//
//    private static void createConnection() {
//        try {
//            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
//            //Get a connection
//            conn = DriverManager.getConnection(dbURL);
//        } catch (Exception except) {
//            except.printStackTrace();
//        }
//    }
//
//    private static void insertRestaurants(int id, String restName, String cityName) {
//        try {
//            stmt = conn.createStatement();
//            stmt.execute("insert into " + tableName + " values (" +
//                    id + ",'" + restName + "','" + cityName + "')");
//            stmt.close();
//        } catch (SQLException sqlExcept) {
//            sqlExcept.printStackTrace();
//        }
//    }
//
//    private static void selectRestaurants() {
//        try {
//            stmt = conn.createStatement();
//            ResultSet results = stmt.executeQuery("select * from " + tableName);
//            ResultSetMetaData rsmd = results.getMetaData();
//            int numberCols = rsmd.getColumnCount();
//            for (int i = 1; i <= numberCols; i++) {
//                //print Column Names
//                System.out.print(rsmd.getColumnLabel(i) + "\t\t");
//            }
//
//            System.out.println("\n-------------------------------------------------");
//
//            while (results.next()) {
//                int id = results.getInt(1);
//                String restName = results.getString(2);
//                String cityName = results.getString(3);
//                System.out.println(id + "\t\t" + restName + "\t\t" + cityName);
//            }
//            results.close();
//            stmt.close();
//        } catch (SQLException sqlExcept) {
//            sqlExcept.printStackTrace();
//        }
//    }
//
//    private static void shutdown() {
//        try {
//            if (stmt != null) {
//                stmt.close();
//            }
//            if (conn != null) {
//                DriverManager.getConnection(dbURL + ";shutdown=true");
//                conn.close();
//            }
//        } catch (SQLException sqlExcept) {
//
//        }
//
//    }

}
