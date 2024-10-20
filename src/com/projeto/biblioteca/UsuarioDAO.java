//usuarioDAO é apenas para mexer na tabela
package com.projeto.biblioteca;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO{
   private Connection connection;
   
    public UsuarioDAO() {
    this.connection = new ConnectionFactory().conectaBD();
}
    //minusculo é o nome da variavel, maiusculo é classe
    public void criar (Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios (nome, email, telefone, tipo_usuario) VALUES(?,?,?,?)";
        PreparedStatement stmt =null;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString( 1, usuario.getNome());
            stmt.setString( 2, usuario.getEmail());
            stmt.setString( 3, usuario.getTelefone());
             stmt.setString( 4, usuario.getTipo_usuario());
             
            stmt.executeUpdate();
            System.out.println("Usuario criando com sucesso");
            //COLOCA SQL para verificar o banco de dados
        } catch (SQLException e) {
            System.out.println("Erro ao criar usuario"+e.getMessage());
        }finally{
            if(stmt !=null)stmt.close();
        }
    }

        //lista de usuario
            public List<Usuario> listarUsuarios() throws SQLException {
        String sql = "SELECT * FROM usuarios";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuários: " + e.getMessage());
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
        }
        return usuarios;
    }

//Busca pelo id
        public Usuario buscaUsuarioPorId (int id) throws SQLException{
            // de acordo com o banco de dados
            String sql = "SELECT *FROM usuarios WHERE id = ?";
            PreparedStatement stmt = null;
            ResultSet rs = null;
            Usuario usuario = null;
            
            try {
             stmt = connection.prepareStatement(sql);
             stmt.setInt(1, id);
             rs= stmt.executeQuery();
             
             if(rs.next()) {
                 usuario = new Usuario();
                 usuario.setId(rs.getInt("id"));
                 usuario.setNome(rs.getString("nome"));
                 usuario.setEmail(rs.getString("email"));
                 usuario.setTelefone(rs.getString("telefone"));
                 usuario.setTipo_usuario(rs.getString("tipo usuario"));
                 
             }
             
             
             
             
            } catch (Exception e) {
                System.out.println("Erro ao Buscar"+e.getMessage());
                
            }finally{
                if (rs !=null) rs.close();
                 if (rs !=null) stmt.close();
            }
            return usuario;
        }
//atualizar um usuario
        public void atualizarUsuario(Usuario usuario) throws SQLException{
                String sql = "UPDATE usuarios SET nome = ?, email = ?, telefone =?, tipo_usuario = ? WHERE id= ?";
                PreparedStatement stmt = null;
                try {
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getEmail());
                stmt.setString(3, usuario.getTelefone());
                stmt.setString(4, usuario.getTipo_usuario());
                stmt.setInt(5, usuario.getId());
                
                stmt.executeUpdate();
                    System.out.println("Usuario atualizado com sucesso");
                    
            } catch (SQLException e) {
                    System.out.println("Usuario atualizado" + e.getMessage());
            } finally {
                    if(stmt !=null) stmt.close();
       
           
                    
        }            
                
    }
 // MEDOTO PARA DELETAR
     public void deletarUsuario(int id) throws SQLException{     
         String sql = " DELETE FROM usuarios WHERE id=?";
        PreparedStatement  stmt = null;
        
         try {
             stmt = connection.prepareStatement(sql);
             stmt.setInt(1, id);
             stmt.executeUpdate();
             System.out.println("Usuario deletado com sucesso");
             
         } catch (SQLException e) {
             System.out.println("Usuario deu erro: " +e.getMessage());             
         } finally {
             if (stmt !=null) stmt.close();
         }
     }
        
        //METODO PARA FECHAR CONEXÃO
     public void fecharConexao () throws SQLException{
         if(connection !=null && ! connection.isClosed()) {
             connection.close();
         }
     }
     
        
}
