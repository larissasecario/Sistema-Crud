package DTO;

public class UsuarioDTO {

    //Atributos 
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String endereco;
    private String cargo;

    //Construtor
    public UsuarioDTO() {

    }

    public UsuarioDTO(int id, String nome, String login, String senha, String telefone, String endereco, String cargo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    //Get e set 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
