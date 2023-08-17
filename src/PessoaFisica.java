public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String telefone, String email, String cpf){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
