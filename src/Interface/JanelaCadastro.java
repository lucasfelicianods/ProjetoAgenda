/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import persistencia.Conexao;
import persistencia.AgendaDao;
import cadastro.Agenda;
import javax.swing.JOptionPane;
import Interface.JanelaListagem;
import com.sun.org.apache.bcel.internal.Constants;
import java.awt.LayoutManager;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Lucas
 */
public class JanelaCadastro extends javax.swing.JPanel {

    /**
     * Creates new form JanelaCadastro
     */
    public JanelaCadastro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnValidarCpf = new javax.swing.JButton();
        txtCpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");

            txtCpf = new javax.swing.JFormattedTextField(cpf);
        }catch(Exception e){
        }
        btnLimpar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContatos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("TELA CADASTRO DE CLIENTE");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("CPF:");

        txtNome.setToolTipText("Informe seu Nome aqui");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("NOME:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/SALVAR.jpg"))); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setToolTipText("Clique para cadastrar os dados");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnValidarCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/confirmar.png"))); // NOI18N
        btnValidarCpf.setText("VALIDAR CPF");
        btnValidarCpf.setToolTipText("Clique para validar o seu CPF");
        btnValidarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarCpfActionPerformed(evt);
            }
        });

        txtCpf.setToolTipText("Informe seu cpf aqui");
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/limpar.png"))); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.setToolTipText("Clique aqui para Limpar os campos");
        btnLimpar.setEnabled(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("DATA:");

        jTableContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Telefone Residencial", "Telefone Celular", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTableContatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(btnValidarCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValidarCpf)
                    .addComponent(jLabel2)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JanelaCadastro(LayoutManager layout) {
        super(layout);
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

     
        Agenda ag = new Agenda();
        AgendaDao obAgenda = new AgendaDao();
        
        ag.setNome(txtNome.getText());
        ag.setCpf(txtCpf.getText());
        ag.setTel_resid(jTableContatos.getValueAt(0,0).toString());
        ag.setTel_cel(jTableContatos.getValueAt(0,1).toString());
        ag.setFone(jTableContatos.getValueAt(0,2).toString());
        obAgenda.incluir(ag);

        JOptionPane.showMessageDialog(null, "Seu cadastro foi efetuado com sucesso");
        txtNome.setText("");
        txtCpf.setText("");
       
        
        //Deletar linha
        ((DefaultTableModel) jTableContatos.getModel()).setNumRows(0);
        jTableContatos.updateUI();
        
        //Adicionar linha
        ((DefaultTableModel) jTableContatos.getModel()).setNumRows(1);
        jTableContatos.updateUI();
     

        
        // jTableContatos.getValueAt(int linha, int coluna);
        
      //  JOptionPane.showMessageDialog(txtNome, ag.getId()+"\n"+"telefone residencial :"+tel_rel+
      //          "telefone Celular"+cel+"\n"+
      //          "telefone"+fone);

    }//GEN-LAST:event_btnCadastrarActionPerformed


    private void btnValidarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarCpfActionPerformed
        // TODO add your handling code here:

        String cpf = txtCpf.getText();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace(".", "");
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        String s1, s2, s3, s4, s5, s6, s7, s8, s9, confere = "";
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, verificador1, verificador2;

        s1 = cpf.substring(0, 1);
        n1 = Integer.parseInt(s1);
        s2 = cpf.substring(1, 2);
        n2 = Integer.parseInt(s2);
        s3 = cpf.substring(2, 3);
        n3 = Integer.parseInt(s3);
        s4 = cpf.substring(3, 4);
        n4 = Integer.parseInt(s4);
        s5 = cpf.substring(4, 5);
        n5 = Integer.parseInt(s5);
        s6 = cpf.substring(5, 6);
        n6 = Integer.parseInt(s6);
        s7 = cpf.substring(6, 7);
        n7 = Integer.parseInt(s7);
        s8 = cpf.substring(7, 8);
        n8 = Integer.parseInt(s8);
        s9 = cpf.substring(8, 9);
        n9 = Integer.parseInt(s9);

        verificador1 = (n1 * 10 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2);

        if ((verificador1 % 11) < 2) {
            verificador1 = 0;
        } else {
            verificador1 = 11 - (verificador1 % 11);
        }

        verificador2 = (n1 * 11 + n2 * 10 + n3 * 9 + n4 * 8 + n5 * 7 + n6 * 6 + n7 * 5 + n8 * 4 + n9 * 3 + verificador1 * 2);

        if ((verificador2 % 11) < 2) {
            verificador2 = 0;
        } else {
            verificador2 = 11 - (verificador2 % 11);
        }

        confere = (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + verificador1 + "" + verificador2);

        if (cpf.equals("00000000000") || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")) {
            JOptionPane.showMessageDialog(null, "CPF INFORMADO COM SEQUÊNCIA E INVALIDO", null, JOptionPane.ERROR_MESSAGE);
            txtCpf.setText("");
            btnCadastrar.setEnabled(false);
            btnLimpar.setEnabled(false);

        } else if (confere.equals(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF VÁLIDO", null, JOptionPane.INFORMATION_MESSAGE);
            btnCadastrar.setEnabled(true);
            btnLimpar.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "CPF INVÁLIDO", null, JOptionPane.ERROR_MESSAGE);
            txtCpf.setText("");
        }


    }//GEN-LAST:event_btnValidarCpfActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:

        txtCpf.setText("");

        txtNome.setText("");
//        jdData.setDate(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
        if (txtCpf.getText() != "") {
            btnValidarCpf.setEnabled(true);
        }
    }//GEN-LAST:event_txtCpfActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JButton btnValidarCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContatos;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
