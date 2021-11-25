package FacilitatingDemocracy;

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

    public int getFirstPastThePost(int candidatenum) {
        String SQL = "SELECT count(*) FROM votes " + "WHERE fptpvote = ?";
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
        String SQL = "SELECT count(*) FROM votes " + "WHERE vote1 = ? " + "AND vote2 = ?";
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

    public long insertUser(String name, int studentnum) { // inserts user nto database, returns primary key #
        String SQL = "INSERT INTO users (name,studentnum) "
                + "VALUES(?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, studentnum);

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }

    public long insertVote(int vote1, int vote2, int vote3, int vote4, int vote5, int studentnum) { // inserts vote nto database, returns primary key #, student num should be same as user
        String SQL = "INSERT INTO votes (vote1,vote2,vote3,vote4,vote5,userid) "
                + "VALUES(?,?,?,?,?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setInt(1, vote1);
            pstmt.setInt(2, vote2);
            pstmt.setInt(3, vote3);
            pstmt.setInt(4, vote4);
            pstmt.setInt(5, vote5);
            pstmt.setInt(6, studentnum);

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
}