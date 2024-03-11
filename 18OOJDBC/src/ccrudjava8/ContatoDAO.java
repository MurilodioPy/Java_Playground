package ccrudjava8;

import ainicio.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** ANTES DO JAVA7
 Connection conn = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
  try {

  } catch (SQLException ex) {

  } finally {
  try { rs.close(); } catch (Exception e) {}
  try { ps.close(); } catch (Exception e) {}
  try { conn.close(); } catch (Exception e) {}
  }
 */
    
/** APÓS JAVA7
try(Connection con = getConnection(url, username, password, "org.postgresql.Driver");
    PreparedStatement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
) {

//statements
}catch(....){}
*/ 
     
/*
 *boolean execute() 
  Executes the SQL statement in this PreparedStatement object, which may be any kind of SQL statement.

 *ResultSet executeQuery() 
  Executes the SQL query in this PreparedStatement object and returns the ResultSet object generated by the query.
 
 *int executeUpdate()
  Executes the SQL statement in this PreparedStatement object, which must be an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE; or an SQL statement that returns nothing, such as a DDL statement.
 */ 
public class ContatoDAO {
    
    //DESCRIÇÃO
    //adição simples (sem retorno de id ou objeto) java 8
    public Contato adiciona(Contato elemento) {
        String sql = "insert into contatos "
                + "(nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, elemento.getNome());
            stmt.setString(2, elemento.getEmail());
            stmt.setString(3, elemento.getEndereco());
            stmt.setDate(4, java.sql.Date.valueOf(elemento.getDataNascimento()));
            
            stmt.execute();
            
            System.out.println("Elemento inserido com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //na verdade deveria retornar o elemento que foi inserido agora
        return elemento;
    }
    
    //DESCRIÇÃO
    //adição com retorno de id
    public long adicionaERetornaId(Contato elemento) {
        String sql = "insert into contatos "
                + "(nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1, elemento.getNome());
            stmt.setString(2, elemento.getEmail());
            stmt.setString(3, elemento.getEndereco());
            stmt.setDate(4, java.sql.Date.valueOf(elemento.getDataNascimento()));
            
            stmt.execute();
            
            ResultSet rs=stmt.getGeneratedKeys();
            
            int retorno=0;
            if(rs.next()){
                retorno = rs.getInt(1);
            }
            
            System.out.println("O id inserido foi: " + retorno);
            
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //DESCRIÇÃO
    //lista de todos os elementos sem algum critério
    public List<Contato> lista(Contato elemento) {
        String sql = "select * from contatos";

        List<Contato> contatos = new ArrayList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                Date currentDate = rs.getDate("dataNascimento");
                LocalDate dataNascimento = currentDate.toLocalDate();

                Contato contato = new Contato();
                contato.setId(id);
                contato.setNome(nome);
                contato.setEmail(email);
                contato.setEndereco(endereco);
                contato.setDataNascimento(dataNascimento);
                contatos.add(contato);
            }
        } catch (SQLException e) {
             throw new RuntimeException(e);
        }

        // itera no ResultSet
        return contatos;
    }
    
    //DESCRIÇÃO
    //1 - busca por critério java 8
    //2 - alternativa 1 (com método auxiliar)
    //3 - retorna um único elemento
    public Contato buscaPorCriterioAlternativa1(long code) {
        try (Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement ps = createPreparedStatement(connection, code);
            ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                Date currentDate = rs.getDate("dataNascimento");
                LocalDate dataNascimento = currentDate.toLocalDate();

                Contato contato = new Contato();
                contato.setId(id);
                contato.setNome(nome);
                contato.setEmail(email);
                contato.setEndereco(endereco);
                contato.setDataNascimento(dataNascimento);
                
                return contato;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    private PreparedStatement createPreparedStatement(Connection con, long id) throws SQLException {
        String sql = "select * from contatos where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, id);
        return ps;
    }
    
    //DESCRIÇÃO
    //1 - busca por critério java 8
    //2 - alternativa 2 (sem método especial)
    //3 - retorna uma coleção
    public List<Contato> buscaPorCriterioAlternativa2(long code) {
        String sql = "select * from contatos where id = ?";
        List<Contato> contatos = new ArrayList<>();
        try (Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setLong(1, code);
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    Long id = rs.getLong("id");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String endereco = rs.getString("endereco");
                    Date currentDate = rs.getDate("dataNascimento");
                    LocalDate dataNascimento = currentDate.toLocalDate();

                    Contato contato = new Contato();
                    contato.setId(id);
                    contato.setNome(nome);
                    contato.setEmail(email);
                    contato.setEndereco(endereco);
                    contato.setDataNascimento(dataNascimento);
                    contatos.add(contato);
                }
            }
        } catch (SQLException e) {
             throw new RuntimeException(e);
        }
        return contatos;
    }
    
    //DESCRIÇÃO
    //alteração o endereço de um contato que teve o id passado como parâmetro
    public Contato altera(Contato elemento) {
        String sql = "update contatos set endereco = ? where id = ?";

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, elemento.getEndereco());
            stmt.setLong(2, elemento.getId());
            
            stmt.execute();
            
            System.out.println("Elemento alterado com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return elemento;
    }
	
    //DESCRIÇÃO
    //remoção simples pelo id passado por parâmetro
    public Contato exclui(Contato elemento) {
        String sql = "delete from contatos where id = ?";

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setLong(1, elemento.getId());
            
            stmt.execute();
            
            System.out.println("Elemento excluído com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return elemento;
    }
}
