package domain;

public class Fornecedor extends Pessoa{

    private String cnpj;

    public Fornecedor(String nome, String celular, String email, Endereco endereco, String cnpj) {
        super(nome, celular, email, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
