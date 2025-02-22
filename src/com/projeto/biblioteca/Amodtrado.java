/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.projeto.biblioteca;

import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno Matutino
 */
public class Amodtrado extends javax.swing.JFrame {
    private void carregaTabelaUsuarios(){
        UsuarioDAO list = new UsuarioDAO();
        try {
            List<Usuario> usuarios = list.listarUsuarios();
            if (usuarios.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhum usuario encontrado");
                return;
            }
            String[] colunas = {"ID", "Nome", "Email", "Telefone", "Tipo de Usuário"};
        Object[][] dados = new Object[usuarios.size()][5];        
        int i = 0;
        for (Usuario usuario : usuarios) {
            dados[i][0] = usuario.getId();
            dados[i][1] = usuario.getNome();
            dados[i][2] = usuario.getEmail();
            dados[i][3] = usuario.getTelefone();
            dados[i][4] = usuario.getTipo_usuario();
            i++;
        }    
      //define o modelo da tabela
       DefaultTableModel model = new DefaultTableModel(dados, colunas);
      
           tblUsu.setModel(model);    
       
            
            
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());   
        }
    }

    /**
     * Creates new form Amodtrado
     */
    public Amodtrado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnAlterarDados = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtExcluir = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("E-mail");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Tipo de Usuario");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(204, 255, 204));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 51, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID");

        lblResultado.setText("Resultado");

        btnBuscar.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblUsu.setBackground(new java.awt.Color(236, 236, 253));
        tblUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUsu);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("CADASTRINHO");

        btnCadastro.setBackground(new java.awt.Color(204, 204, 255));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastro.setText("PESSOAS CADASTRADAS");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnAlterarDados.setBackground(new java.awt.Color(204, 255, 204));
        btnAlterarDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarDados.setText("Alterar Dados");
        btnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 255, 204));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir Por ID");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUNCIONARIO", "CLIENTE", " " }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnSalvar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)
                                .addGap(63, 63, 63)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtEmail)
                                    .addComponent(txtNome)
                                    .addComponent(comboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterarDados)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                                .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastro)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarDados)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // CHAMA A CLASSE, USER VARIAVAL
        UsuarioDAO userDAO = new UsuarioDAO();
        //cria objeto usuario
        Usuario user = new Usuario();
        user.setNome(txtNome.getText());
        user.setEmail(txtEmail.getText());
        user.setTelefone(txtTelefone.getText());
        user.setTipo_usuario((String)comboTipo.getSelectedItem());
        //agora usar o etodo do usuarioDAO
        try {
            //salvar usuario
            userDAO.criar(user);
            JOptionPane.showMessageDialog(this, "Criado com Sucesso");
            //limpar campos
            txtNome.setText("");
            txtEmail.setText("");
            txtTelefone.setText("");
            comboTipo.setSelectedIndex(0);

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(this, " Erro " + e.getMessage());

        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        UsuarioDAO usua = new UsuarioDAO();
        
        try {
            //obtwm o ID digitado
            int id = Integer.parseInt(txtId.getText());
            //busca o usuario pelo ID
            //chama a classe Usuario e usuario minusculo é uma variavel para saber que estamos falando da classe
            Usuario usuario = usua.buscaUsuarioPorId(id);
            //Busca de usuario
            if (usuario != null) {
                //exibe os dados do usuario
                lblResultado.setText(
                        "ID:" + usuario.getId() + "\n"
                        + "Nome:" + usuario.getNome() + "\n"
                        + "Email" + usuario.getEmail() + "\n"
                        + "Telefone:" + usuario.getTelefone() + "\n"
                        + "Tipo_usuario:" + usuario.getTipo_usuario()
                );
            
        }else{
                System.out.println(" Usuario não encontrado");  
            }
        }catch(SQLException erro) {
                lblResultado.setText("ERRO AO BUSCAR USUARIO    "+ erro.getMessage());
                    
        }catch(NumberFormatException erro) {
                lblResultado.setText("ID invalido");
                
                }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
    UsuarioDAO list = new UsuarioDAO();    
    try {
        // Recupera a lista de usuários do banco de dados
        List<Usuario> usuarios = list.listarUsuarios();
        // Verifica se a lista está vazia
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum usuário encontrado.");
            return;
        }
        // Cria um modelo de tabela
        String[] colunas = {"ID", "Nome", "Email", "Telefone", "Tipo de Usuário"};
        Object[][] dados = new Object[usuarios.size()][5];        
        int i = 0;
        for (Usuario usuario : usuarios) {
            dados[i][0] = usuario.getId();
            dados[i][1] = usuario.getNome();
            dados[i][2] = usuario.getEmail();
            dados[i][3] = usuario.getTelefone();
            dados[i][4] = usuario.getTipo_usuario();
            i++;
        }        
        // Define o modelo de tabela com os dados recuperados
        DefaultTableModel model = new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Permitir a edição de todas as colunas, exceto a coluna de ID
                return column != 0;
            }      };
        tblUsu.setModel(model);        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao listar usuários: " + e.getMessage());
    }  



        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosActionPerformed
UsuarioDAO usuarioDAO = new UsuarioDAO();

        try {
            //Pecorre todas as linhas da tabela
            for(int i = 0; i <tblUsu.getRowCount(); i++){
                //Captura os valores editados da tabela
                int id = Integer.parseInt(tblUsu.getValueAt(i, 0).toString());
                String nome = tblUsu.getValueAt(i, 1).toString();
                String email = tblUsu.getValueAt(i, 2).toString();
                String telefone = tblUsu.getValueAt(i, 3).toString();
                String tipoUsuario = tblUsu.getValueAt(i, 4).toString();
                //CRIAR UM OBJETO COM OS VALORES ATUALIZADOS 
                Usuario usuario = new Usuario();
                usuario.setId(id);
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setTelefone(telefone);
                usuario.setTipo_usuario(tipoUsuario);
                //atualiza o usuario no banco de dados
                usuarioDAO.atualizarUsuario(usuario);                        
            }
            //exibe mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Atualizado! Maravilhosa!");
            //recarrega a tabela com os dados atualizados
            carregaTabelaUsuarios();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Não foi dessa vez gatona!"+e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarDadosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        //Pega o id digitado no campo txtecluir
        String idText = txtExcluir.getText();
        
        if(idText.isEmpty()){
            //verifica se o espaço esta vazio
            JOptionPane.showMessageDialog(this, "O ID não é válido");
        return;
    }
        try {
            //converte o id em inteiro 
            int id = Integer.parseInt(idText);
            //chama o metodo de excluisão do DAO
            usuarioDAO.deletarUsuario(id);
            JOptionPane.showMessageDialog(this, "Excluido gata!");
            //
            txtExcluir.setText("");
            
         } catch (NumberFormatException e) {
        //trata caso o valor inserido não seja um numero valido          
        JOptionPane.showMessageDialog(this, "ID invado!");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ih deu ruim ao excluir!" +e.getMessage());
           
        }
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Amodtrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Amodtrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Amodtrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Amodtrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Amodtrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTable tblUsu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExcluir;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
