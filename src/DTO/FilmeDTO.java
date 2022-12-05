package DTO;

public class FilmeDTO {

    //Atributos 
    private int id_Filme;
    private String nomeFilme;
    private String classificacao;
    private String dataCadastro;
    private String duracao;
    private String sessao;
    private String sala;
    private String genero;
 


    //Construtor
    public FilmeDTO() {

    }

    public FilmeDTO(int id_Filme, String nomeFilme, String classificacao, String dataCadastro, String duracao, String sessao, String sala, String genero) {
        this.id_Filme = id_Filme;
        this.nomeFilme = nomeFilme;
        this.classificacao = classificacao;
        this.dataCadastro = dataCadastro;
        this.duracao = duracao;
        this.sessao = sessao;
        this.sala = sala;
        this.genero = genero;
    }

    //Get e set 
    public int getId_Filme() {
        return id_Filme;
    }

    public void setId_Filme(int id_Filme) {
        this.id_Filme = id_Filme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    
    
}
