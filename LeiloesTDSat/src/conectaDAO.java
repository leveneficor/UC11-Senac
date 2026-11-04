import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    public Connection connectDB() {
        Connection conn = null;
        try {
            // Configuração do driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // URL do banco de dados
            String url = "jdbc:mysql://localhost:3306/uc11?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "mysql";
            
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco: " + e.getMessage());
        }
        return conn;
    }
}