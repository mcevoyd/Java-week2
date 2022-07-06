package uk.ac.serc.customers.darren;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args )
    {
        String databaseName = "cf-training-db-server";
        String url = databaseName + ".database.windows.net";
        String database = "northwind";
        String user = "cf_readonly_login";
        String password = "BDtrp7ajxtzoMpF4WN4rGDrfIDAc0xIy";
        String connectionUrl = "jdbc:sqlserver://" + url + ":1433;databaseName=" 
        + database + ";user="+ user + ";password=" + password +";";

        ArrayList <String> customers = new ArrayList<String>();
    
        System.out.println(connectionUrl);

        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("-- Connected to the database. --");

                String sql = "SELECT * FROM Customers;";
                try (Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {

                        // customers.add(new Customer(resultSet.getString("CustomerID",
                        // resultSet.getString("CompanyName"),
                        // resultSet.getString("ContactName")));

                        customers.add(resultSet.getString("CustomerID") 
                        + " | " + resultSet.getString("CompanyName") + " | " 
                        + resultSet.getString("ContactName"));


                        // System.out.println(resultSet.getString("CustomerID") 
                        // + " | " + resultSet.getString("CompanyName") + " | " 
                        // + resultSet.getString("ContactName"));

                        for (int x =0; x < customers.size(); x++){
                            System.out.print(customers);
                            System.out.println("");
                        }
                    }
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

    }
}
