package DAO;

import java.sql.*;
import DTO.UsuarioDTO;
import java.util.ArrayList;

public class UsuarioDAO {

    ConectarBD bancoDados = new ConectarBD();
    Connection conectar = bancoDados.bancoDados();
    PreparedStatement preparo;
    ResultSet rst = null;

    public ResultSet autenticarUsuario(UsuarioDTO usuario) {
        try {
            String url = "select * from USUARIO where LOGIN=? AND SENHA =?";
            preparo = conectar.prepareCall(url);

            preparo.setString(1, usuario.getLogin());
            preparo.setString(2, usuario.getSenha());

            rst = preparo.executeQuery();
            System.out.println("objeto encontrado");
            return rst;

        } catch (SQLException erro) {
            System.out.println("Erro!! Classe(UsuarioDAO) Metodo(AutenticarUsuario)" + erro.getMessage());
            return null;
        }

    }

    public void adicionarUsuario(UsuarioDTO usuario) {

        try {
            String url = "INSERT INTO usuario(NOME, LOGIN, SENHA, TELEFONE, ENDERECO, CARGO) VALUES (?,?,?,?,?,?)";

            preparo = conectar.prepareStatement(url);
            preparo.setString(1, usuario.getNome());
            preparo.setString(2, usuario.getLogin());
            preparo.setString(3, usuario.getSenha());
            preparo.setString(4, usuario.getTelefone());
            preparo.setString(5, usuario.getEndereco());
            preparo.setString(6, usuario.getCargo());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro classe(USUARIODAO) Metodo(ADICIONAR) " + erro.getMessage());
        }

    }

    public ArrayList<UsuarioDTO> pesquisarUsuario() {
        ResultSet rst = null;
        ArrayList<UsuarioDTO> listaUsuario = new ArrayList<>();
        try {
            String url = "select * from usuario";

            preparo = conectar.prepareStatement(url);

            rst = preparo.executeQuery();

            while (rst.next()) {

                UsuarioDTO usuario = new UsuarioDTO();//Obtigatorio estar aqui neste loop, para criar varios objetos 

                usuario.setId(rst.getInt("ID"));
                usuario.setNome(rst.getString("NOME"));
                usuario.setLogin(rst.getString("LOGIN"));
                usuario.setSenha(rst.getString("SENHA"));
                usuario.setTelefone(rst.getString("TELEFONE"));
                usuario.setEndereco(rst.getString("ENDERECO"));
                usuario.setCargo(rst.getString("CARGO"));

                listaUsuario.add(usuario);

            }
        } catch (SQLException erro) {
            System.out.println("Erro classe(USUARIODAO) Metodo(PesquisarUsuario) " + erro.getMessage());
        }
        return listaUsuario;
    }

    public void ecluirUsuario(UsuarioDTO usuario) {

        try {
            String url = "delete from usuario where id = ?";

            preparo = conectar.prepareStatement(url);
            preparo.setInt(1, usuario.getId());
            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro classe(USUARIODAO) Metodo(EXCLUIR) " + erro.getMessage());
        }

    }

    public void alterarUsuario(UsuarioDTO usuario) {

        try {
            String url = "UPDATE usuario SET NOME=?, LOGIN= ?, SENHA=?, TELEFONE=?, ENDERECO=?, CARGO=? WHERE ID =?";

            preparo = conectar.prepareStatement(url);
            preparo.setString(1, usuario.getNome());
            preparo.setString(2, usuario.getLogin());
            preparo.setString(3, usuario.getSenha());
            preparo.setString(4, usuario.getTelefone());
            preparo.setString(5, usuario.getEndereco());
            preparo.setString(6, usuario.getCargo());
            preparo.setInt(7, usuario.getId());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro classe(UsuarioDAO) Metodo(Alterar) " + erro.getMessage());
        }

    }

}
