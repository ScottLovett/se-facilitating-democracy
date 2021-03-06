package FacilitatingDemocracy;

import java.sql.*;

public class dbAccess {

// attempt to connect with postgres server

    public Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://localhost/democracy";
            String user = "postgres";
            String password = "postgres";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public int getFirstVote(int candidatenum) {
        String SQL = "SELECT count(*) FROM votes " + "WHERE vote1 = ?";
        int count = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, candidatenum);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
        return count;
    }

    public int getFirstPastThePost(int candidatenum) {
        String SQL = "SELECT count(*) FROM votes " + "WHERE fptpvote = ?";
        int count = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, candidatenum);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
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
            rs.next();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
        return count;
    }

    public int getSecondElimination(int elim, int elim2, int candidatenum) {
        String SQL = "SELECT count(*) FROM votes " + "WHERE ((vote1 = ? AND vote2 = ?) " +"OR (vote1 = ? AND vote2 = ?))" + "AND ( vote2 = ? OR vote3 = ?)";
        int count = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, elim);
            pstmt.setInt(2, elim2); //permutation 1,2

            pstmt.setInt(4, elim); // permutation 2,1
            pstmt.setInt(3, elim2);

            pstmt.setInt(5, candidatenum);
            pstmt.setInt(6, candidatenum);

            ResultSet rs = pstmt.executeQuery();
            rs.next();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
        return count;
    }

    public int getSecondEliminationstv(int elim, int elim2, int candidatenum) {
        String SQL = "SELECT count(*) FROM votes " + "WHERE ((vote1 = ? AND vote5 = ?) " +"OR (vote1 = ? AND vote5 = ?))" + "AND ( vote5 = ?)";
        int count = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, elim);
            pstmt.setInt(2, elim2); //permutation 1,2

            pstmt.setInt(4, elim); // permutation 2,1
            pstmt.setInt(3, elim2);

            pstmt.setInt(5, candidatenum);

            ResultSet rs = pstmt.executeQuery();
            rs.next();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
        return count;
    }

    public int getThirdElimination(int elim, int elim2, int elim3, int candidatenum) {
        int count =0;

        String SQL = "SELECT count(*) FROM votes " + "WHERE ((vote1 = ? AND vote2 = ? AND vote3 = ?) " + //1,2,3
                                                     "OR (vote1 = ? AND vote2 = ? AND vote3 = ?)" + //1,3,2
                                                     "OR (vote1 = ? AND vote2 = ? AND vote3 = ?)" +//2,1,3
                                                     "OR (vote1 = ? AND vote2 = ? AND vote3 = ?)" +//2,3,1
                                                     "OR (vote1 = ? AND vote2 = ? AND vote3 = ?)" +//3,1,2
                                                     "OR (vote1 = ? AND vote2 = ? AND vote3 = ?))" + //3,2,1
                                                     "AND ( vote2 = ? OR vote3 = ? OR vote4 = ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, elim);
            pstmt.setInt(2, elim2); //permutation 1,2,3
            pstmt.setInt(3, elim3);

            pstmt.setInt(4, elim); // permutation 1,3,2
            pstmt.setInt(6, elim2);
            pstmt.setInt(5, elim3);

            pstmt.setInt(8, elim); // permutation 2,1,3
            pstmt.setInt(7, elim2);
            pstmt.setInt(9, elim3);

            pstmt.setInt(12, elim); // permutation 2,3,1
            pstmt.setInt(10, elim2);
            pstmt.setInt(11, elim3);


            pstmt.setInt(14, elim); // permutation 3,1,2
            pstmt.setInt(15, elim2);
            pstmt.setInt(13, elim3);


            pstmt.setInt(18, elim); // permutation 3,2,1
            pstmt.setInt(17, elim2);
            pstmt.setInt(16, elim3);


            pstmt.setInt(19, candidatenum);
            pstmt.setInt(20, candidatenum);
            pstmt.setInt(21, candidatenum);

            ResultSet rs = pstmt.executeQuery();
            rs.next();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
        return count;
    }

    public int getThirdEliminationstv(int elim, int elim2, int elim3, int candidatenum) {
        int count =0;

        String SQL = "SELECT count(*) FROM votes " + "WHERE ((vote1 = ? AND vote5 = ? ) " + //1,2
                "OR (vote1 = ? AND vote5 = ? )" + //1,3
                "OR (vote1 = ? AND vote5 = ? )" +//2,1
                "OR (vote1 = ? AND vote5 = ? )" +//2,3
                "OR (vote1 = ? AND vote5 = ? )" +//3,1
                "OR (vote1 = ? AND vote5 = ? ))" + //3,2
                "AND ( vote5 = ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, elim);
            pstmt.setInt(2, elim2); //permutation 1,2

            pstmt.setInt(3, elim); // permutation 1,3
            pstmt.setInt(4, elim3);

            pstmt.setInt(6, elim); // permutation 2,1
            pstmt.setInt(5, elim2);

            pstmt.setInt(7, elim2);// permutation 2,3
            pstmt.setInt(8, elim3);

            pstmt.setInt(10, elim); // permutation 3,1
            pstmt.setInt(9, elim3);

            pstmt.setInt(12, elim2); // permutation 3,2
            pstmt.setInt(11, elim3);

            pstmt.setInt(13, candidatenum);

            ResultSet rs = pstmt.executeQuery();
            rs.next();
            count = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
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
        System.out.println(id);
        return id;
    }

    public long insertVote(int vote1, int vote2, int vote3, int vote4, int vote5, int votefptp, int studentnum) { // inserts vote nto database, returns primary key #, student num should be same as user
        String SQL = "INSERT INTO votes (vote1,vote2,vote3,vote4,vote5,fptpvote,userid) "
                + "VALUES(?,?,?,?,?,?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setInt(1, vote1);
            pstmt.setInt(2, vote2);
            pstmt.setInt(3, vote3);
            pstmt.setInt(4, vote4);
            pstmt.setInt(5, vote5);
            pstmt.setInt(6, votefptp);
            pstmt.setInt(7, studentnum);

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
        System.out.println(id);
        return id;
    }
}