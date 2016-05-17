/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Interface.JanelaListagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.SQLException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import cadastro.Agenda;
import estoque.Produto;
import java.sql.Statement;
import javax.sql.StatementEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class AgendaDao {

    Agenda p;

    public int getProximoId(Connection con, String sequence) throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select nextval('" + sequence + "')");
        rs.next();
        return rs.getInt(1);
    }

    public void incluir(Agenda ag) {
        try {
            Connection con = Conexao.getConnection();
            try {
                ag.setId(getProximoId(con, "cliente_id_cliente_seq"));
                PreparedStatement pstmt = con.prepareStatement("insert into cliente "
                        + "(id_cliente, nome, cpf) "
                        + "values "
                        + "(?,?,?);"
                        + "insert into contato "
                        + "(id_contato,fone_residencial,fone_celular,fone)"
                        + "values"
                        + "(?,?,?,?)");
                int idx = 1;
                pstmt.setInt(idx++, ag.getId());
                pstmt.setString(idx++, ag.getNome());
                pstmt.setString(idx++, ag.getCpf());
                pstmt.setInt(idx++, ag.getId());
                pstmt.setString(idx++, ag.getTel_resid());
                pstmt.setString(idx++, ag.getTel_cel());
                pstmt.setString(idx++, ag.getFone());
                pstmt.executeUpdate();

            } finally {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList listar() throws SQLException {
        ArrayList dados = new ArrayList();
        Connection con = Conexao.getConnection();

        String comando = "select id_cliente,nome,cpf,fone_residencial,fone_celular,fone from cliente left join contato on id_cliente = id_contato";
        PreparedStatement ps = con.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            p = new Agenda();
            p.setId(Integer.parseInt(rs.getString("id_cliente")));
            p.setNome(rs.getString("nome"));
            p.setCpf(rs.getString("cpf"));
            p.setTel_resid(rs.getString("fone_residencial"));
            p.setTel_cel(rs.getString("fone_celular"));
            p.setFone(rs.getString("fone"));
            dados.add(p);
        }
        return dados;
    }

    public Agenda consultar(String nome) throws SQLException {
        String comando = "select id_cliente,nome,cpf,fone_residencial,fone_celular,fone from cliente left join contato on id_cliente = id_contato where nome = ?";
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(comando);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {

            p = new Agenda();
            p.setId(Integer.parseInt(rs.getString("id_cliente")));
            p.setNome(rs.getString("nome"));
            p.setCpf(rs.getString("cpf"));
            p.setTel_resid(rs.getString("fone_residencial"));
            p.setTel_cel(rs.getString("fone_celular"));
            p.setFone(rs.getString("fone"));

            return p;
        }
        return null;
    }

    public void deletar(int id) throws SQLException {

        String comando = ("DELETE FROM cliente WHERE id_cliente IN (SELECT id_contato FROM contato  WHERE id_contato = ?)");
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(comando);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public void alterar(Agenda ag) {
        try {
            Connection con = Conexao.getConnection();
            try {
                ag.setId(getProximoId(con, "cliente_id_cliente_seq"));
                PreparedStatement pstmt = con.prepareStatement("insert into cliente "
                        + "(id_cliente, nome, cpf) "
                        + "values "
                        + "(?,?,?);"
                        + "insert into contato "
                        + "(id_contato,fone_residencial,fone_celular,fone)"
                        + "values"
                        + "(?,?,?,?)");
                int idx = 1;
                pstmt.setInt(idx++, ag.getId());
                pstmt.setString(idx++, ag.getNome());
                pstmt.setString(idx++, ag.getCpf());
                pstmt.setInt(idx++, ag.getId());
                pstmt.setString(idx++, ag.getTel_resid());
                pstmt.setString(idx++, ag.getTel_cel());
                pstmt.setString(idx++, ag.getFone());
                pstmt.executeUpdate();

            } finally {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
