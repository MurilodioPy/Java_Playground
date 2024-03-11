package ainicio;

import java.sql.Connection;
import java.sql.SQLException;

public class BTestaConexao {
	public static void main(String[] args) /*throws nao obrigatorio*/{
	ConnectionFactory c = new ConnectionFactory();
        Connection connection = c.getConnection();
        System.out.println("sucesso");
            
            /*
            try (Connection connection = new ConnectionFactory().getConnection()) {
                System.out.println("Conexão aberta!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
		*/
	}
}
