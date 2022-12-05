package DAO;

import DTO.VendaDTO;
import java.sql.*;
import java.util.ArrayList;

public class VendaDAO {

    ConectarBD bancoDados = new ConectarBD();
    Connection conectar = bancoDados.bancoDados();

    PreparedStatement preparo = null;

    public void adicionarVendas(VendaDTO venda) {

        try {
            String url = "INSERT INTO venda(ID_FILME, VALOR, QUANTIDADE, VALOR_TOTAL, SESSAO, DATA) VALUES (?,?,?,?,?,?)";

            preparo = conectar.prepareStatement(url);
            preparo.setInt(1, venda.getIdFilme());
            preparo.setDouble(2, venda.getValor());
            preparo.setInt(3, venda.getQuantidade());
            preparo.setDouble(4, venda.getValorTotal());
            preparo.setString(5, venda.getSessao());
            preparo.setString(6, venda.getDataVenda());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro na classe(VENDADAO). Metodo(Adicionar)" + erro);

        }

    }

    public void excluirVendas(VendaDTO venda) {
        try {
            String url = "delete from venda where ID_VENDA=?";

            preparo = conectar.prepareStatement(url);
            preparo.setInt(1, venda.getIdVenda());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            System.out.println("Erro na classe(VENDADAO). Metodo(Excluir Venda)" + erro);

        }

    }

    public ArrayList<VendaDTO> pesquisarVenda() {
        ResultSet rst = null;
        ArrayList<VendaDTO> listaVenda = new ArrayList<>();

        try {

            String url = "select * from venda";
            preparo = conectar.prepareStatement(url);
            rst = preparo.executeQuery();

            while (rst.next()) {

                VendaDTO venda = new VendaDTO();//Obtigatorio estar aqui neste loop, para criar varios objetos 

                venda.setIdVenda(rst.getInt("ID_VENDA"));
                venda.setIdFilme(rst.getInt("ID_FILME"));
                venda.setValor(rst.getDouble("VALOR"));
                venda.setQuantidade(rst.getInt("QUANTIDADE"));
                venda.setValorTotal(rst.getDouble("VALOR_TOTAL"));
                venda.setSessao(rst.getString("SESSAO"));
                venda.setDataVenda(rst.getString("DATA"));

                listaVenda.add(venda);

            }

        } catch (SQLException erro) {
            System.out.println("Erro na classe(VENDADAO). Metodo(Pesquisar Venda)" + erro);

        }

        return listaVenda;

    }

}
