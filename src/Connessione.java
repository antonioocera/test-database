import java.sql.*;
public class Connessione {

    public Connessione() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Automobili";
            String u = "root";
            String p = null;
            conn = DriverManager.getConnection(url, u, p);
            stmt = conn.createStatement();
            System.out.println("Connessione avvenuta con successo");

            String sql = "INSERT INTO utenti (marchio, modello, cilindrata, alimentazione, chilometraggio) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Fiat");
            statement.setString(2, "500");
            statement.setString(3, "1.1");
            statement.setString(4, "Benzina");
            statement.setString(5, "87.574");
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Dati inseriti correttamente");
            }
            conn.close();
        } catch (Exception ex) {
            System.out.println("Errore: " + ex.getMessage());
        }
    }
}