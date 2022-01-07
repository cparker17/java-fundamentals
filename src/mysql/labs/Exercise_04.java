package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

/*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);
         */

import java.sql.*;

public class Exercise_04 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statementFlights = null;
        Statement statementPassengers = null;
        ResultSet resultSetFlights = null;
        ResultSet resultSetPassengers = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost/airline?"
                    + "user=root&password=Tillie!Bear017"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            //sql statement to add to tables
            String createFlight = "INSERT INTO flights (location_id, plane_id, date_time) " +
                    "values(2, 3, '2022-01-07 12:00:00');";
            String createPassenger = "INSERT INTO passengers (passenger_id, first_name, last_name, address, email, meal_id)" +
                    "values(15, 'gregory', 'parker', '3206 patapsco rd', 'mparker@gmail.com', 2);";

            //sql statement to update row in tables
            String updateFlight = "UPDATE flights SET location_id = 1, plane_id = 1 " +
                    "WHERE flight_id = 1;";
            String updatePassenger = "UPDATE passengers SET first_name = 'duke', last_name = 'parker', " +
                    "address = '2506 caves rd', email = 'duke@hotmail.com', meal_id = 1 " +
                    "WHERE passenger_id = 1;";

            //sql statement to delete a row in tables
            String deleteFlight = "DELETE FROM flights WHERE flight_id = 3;";
            String deletePassenger = "DELETE FROM passengers WHERE passenger_id = 3;";

            //sql statement to query tables
            String queryFlights = "SELECT * FROM airline.flights;";
            String queryPassengers = "SELECT * FROM airline.passengers;";

            connection = DriverManager.getConnection(connectionString);
            statementFlights = connection.createStatement();
            statementPassengers = connection.createStatement();

            //create new rows in tables
            createFlight(statementFlights, createFlight);
            createPassenger(statementPassengers, createPassenger);

            //update a row in each table
            updateFlight(statementFlights, updateFlight);
            updatePassenger(statementPassengers, updatePassenger);

            //delete a row in each table
            //deleteFlight(statementFlights, deleteFlight);
            //deletePassenger(statementPassengers, deletePassenger);

            //obtain resultSet of tables
            resultSetFlights = queryFlights(statementFlights, queryFlights);
            resultSetPassengers = queryPassenger(statementPassengers, queryPassengers);

            // print out Flights query
            while (resultSetFlights.next()) {
                //get row values
                int id = resultSetFlights.getInt("flight_id");
                int location_id = resultSetFlights.getInt("location_id");
                int plane_id = resultSetFlights.getInt("plane_id");
                String date_time = resultSetFlights.getString("date_time");
                //print out row values
                System.out.println("Flight #" + id);
                System.out.println("location_id #" +  location_id);
                System.out.println("plane_id #" + plane_id);
                System.out.println("date_time: " + date_time);
            }

            // print out Passengers query
            while (resultSetPassengers.next()) {
                // get row values
                int id = resultSetPassengers.getInt("passenger_id");
                String first_name = resultSetPassengers.getString("first_name");
                String last_name = resultSetPassengers.getString("last_name");
                String address = resultSetPassengers.getString("address");
                String email = resultSetPassengers.getString("email");
                int meal = resultSetPassengers.getInt("meal_id");
                // print out row values
                System.out.println("Passenger #" + id);
                System.out.println("First Name: " + first_name);
                System.out.println("Last Name: " + last_name);
                System.out.println("Address: " + address);
                System.out.println("Email: " + email);
                System.out.println("Meal Preference #: " + meal);
            }


        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statementFlights.close();
                statementPassengers.close();
                resultSetFlights.close();
                resultSetPassengers.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createFlight(Statement statement, String s) throws SQLException{
        statement.execute(s);
    }

    public static ResultSet queryFlights(Statement statement, String queryFlights) throws SQLException {
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(queryFlights);

        return resultSet;
    }

    public static void updateFlight(Statement statement, String s) throws SQLException {
        statement.execute(s);
    }

    public static void deleteFlight(Statement statement, String s) throws SQLException {
        statement.execute(s);
    }

    public static void createPassenger(Statement statement, String s) throws SQLException {
        statement.execute(s);
    }

    public static ResultSet queryPassenger(Statement statement, String queryPassenger) throws SQLException {
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(queryPassenger);

        return resultSet;
    }

    public static void updatePassenger(Statement statement, String s) throws SQLException {
        statement.execute(s);
    }

    public static void deletePassenger(Statement statement, String s) throws SQLException {
        statement.execute(s);
    }
}
