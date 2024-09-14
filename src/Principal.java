public class Principal {
    public static void main(String[] args) {
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setCpf("123.456.789-00");
        pessoa1.setIdade(30);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setCpf("987.654.321-00");
        pessoa2.setIdade(25);

        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualizando informações da pessoa1
        pessoa1.setNome("João Silva");
        pessoa1.setIdade(31);
        gerenciador.atualizarPessoa1(pessoa1);

        gerenciador.exibirPessoa1();
    }
}