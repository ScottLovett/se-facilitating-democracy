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

    public int getTotalVotes() {

        String SQL = "SELECT count(*) FROM votes";
        int count = 0;
        
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
             rs.next();
             count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int getFirstVote(int candidatenum) {
        String SQL = "SELECT count(*) FROM votes " + "WHERE vote1 = ?";
        int count = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, candidatenum);
            ResultSet rs = pstmt.executeQuery();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int getFirstElimination(int elim, int candidatenum) {
        String SQL = "SELECT count(*) FROM votes " + "WHERE vote1 = elim1 " + "AND vote2 = candidatenum";
        int count = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, elim);
            pstmt.setInt(2, candidatenum);
            ResultSet rs = pstmt.executeQuery();
            count = rs.getInt(2);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }


    public static void main(String[] args) {
        dbAccess app = new dbAccess();
        System.out.println(app.getTotalVotes());
    }
}