package jfx.FacilitatingDemocracy;

import java.sql.*;

public class dbAccess {
    private final String url = "jdbc:postgresql://localhost/democracy";
    private final String user = "postgres";
    private final String password = "postgres";

// attempt to connect with postgres server

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void getUsers() {

        String SQL = "SELECT Name, studentnum FROM users";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            // display user information
            displayUsers(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void displayUsers(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("name") + "\t"
                    + rs.getString("studentnum"));
        }
    }

    public static void main(String[] args) {
        dbAccess app = new dbAccess();
        app.getUsers();
    }
}