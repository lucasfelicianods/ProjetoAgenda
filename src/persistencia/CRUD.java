
package persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import cadastro.Agenda;

public interface CRUD {
   // public void incluir(Contato objeto)throws SQLException;
    public ArrayList listar() throws SQLException;
    public void excluir(String nome) throws SQLException;
    public Agenda consultar(String nome) throws SQLException;
    public void alterar(String nome) throws SQLException;
}
