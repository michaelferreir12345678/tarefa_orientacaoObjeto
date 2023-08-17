public class Main {

    public static void main(String args[]){
        cadastrarPessoaFisica("Michael","456456456", "Michael@gmail.com", "45645645");


        cadastrarPessoaJuridica("Michael","456456456", "Michael@gmail.com", "45645645");

    }

    public static PessoaFisica cadastrarPessoaFisica(String nome, String telefone, String email, String cpf){
        PessoaFisica pessoaFisica1 = new PessoaFisica(nome, telefone,email,cpf);
        return pessoaFisica1;
    };

    public static PessoaJuridica cadastrarPessoaJuridica(String nome, String telefone, String email, String cnpj){
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica(nome, telefone,email,cnpj);
        return pessoaJuridica1;
    };
}
