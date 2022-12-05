package DAO;

import DTO.FilmeDTO;
import java.sql.*;
import java.util.ArrayList;

public class FilmeDAO {

    ConectarBD bancoDados = new ConectarBD();
    Connection conectar = bancoDados.bancoDados();
    PreparedStatement preparo = null;

    public void adicionarFilme(FilmeDTO filme) {

        try {
            String url = "INSERT INTO `filme`(`NOME_FILME`, `CLASSIFICACAO`, `DURACAO`, `DATA_CADASTRO`, `SESSAO`, `SALA`, `GENERO`) VALUES (?,?,?,?,?,?,?)";

            preparo = conectar.prepareStatement(url);
            preparo.setString(1, filme.getNomeFilme());
            preparo.setString(2, filme.getClassificacao());
            preparo.setString(3, filme.getDuracao());
            preparo.setString(4, filme.getDataCadastro());
            preparo.setString(5, filme.getSessao());
            preparo.setString(6, filme.getSala());
            preparo.setString(7, filme.getGenero());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro classe(FILMEDAO) Metodo(ADICIONAR) " + erro.getMessage());
        }

    }

    public ArrayList<FilmeDTO> pesquisarFilme() {
        ResultSet rst = null;
        ArrayList<FilmeDTO> listaFilme = new ArrayList<>();
        try {
            String url = "select * from filme";

            preparo = conectar.prepareStatement(url);
           
            rst = preparo.executeQuery();

            while (rst.next()) {

                FilmeDTO filme = new FilmeDTO();//Obtigatorio estar aqui neste loop, para criar varios objetos 

                filme.setId_Filme(rst.getInt("ID"));
                filme.setNomeFilme(rst.getString("NOME_FILME"));
                filme.setClassificacao(rst.getString("CLASSIFICACAO"));
                filme.setDuracao(rst.getString("DURACAO"));
                filme.setDataCadastro(rst.getString("DATA_CADASTRO"));
                filme.setSessao(rst.getString("SESSAO"));
                filme.setSala(rst.getString("SALA"));
                filme.setGenero(rst.getString("GENERO"));

                listaFilme.add(filme);

            }
        } catch (SQLException erro) {
            System.out.println("Erro classe(FILMEDAO) Metodo(PesquisarFilme) " + erro.getMessage());
        }
        return listaFilme;
    }

    
       public void ecluirFilme(FilmeDTO filme) {

        try {
            String url = "delete from filme where id = ?";

            preparo = conectar.prepareStatement(url);
            preparo.setInt(1, filme.getId_Filme());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro classe(FILMEDAO) Metodo(EXCLUIR) " + erro.getMessage());
        }

    }
       
       public void alterarFilme(FilmeDTO filme){
       
               try {
            String url = "UPDATE filme SET NOME_FILME=?, CLASSIFICACAO=?,DURACAO=?, DATA_CADASTRO=?, SESSAO = ?, SALA = ?, GENERO=? WHERE ID = ?";

            preparo = conectar.prepareStatement(url);
            preparo.setString(1, filme.getNomeFilme());
            preparo.setString(2, filme.getClassificacao());
            preparo.setString(3, filme.getDuracao());
            preparo.setString(4, filme.getDataCadastro());
            preparo.setString(5, filme.getSessao());
            preparo.setString(6, filme.getSala());
            preparo.setString(7, filme.getGenero());
            preparo.setInt(8, filme.getId_Filme());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro classe(FILMEDAO) Metodo(Alterar) " + erro.getMessage());
        }

           
           
           
       }
    
    
    
}
