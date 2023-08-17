public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
