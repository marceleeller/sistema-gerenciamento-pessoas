public class GerenciadorDePessoas {
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    public void cadastrarPessoa1(Pessoa pessoa) {
        if (this.pessoa1 == null) {
            this.pessoa1 = pessoa;
            System.out.println("Pessoa 1 cadastrada com sucesso.");
        } else {
            System.out.println("Pessoa 1 já está cadastrada.");
        }
    }

    public void cadastrarPessoa2(Pessoa pessoa) {
        if (this.pessoa2 == null) {
            this.pessoa2 = pessoa;
            System.out.println("Pessoa 2 cadastrada com sucesso.");
        } else {
            System.out.println("Pessoa 2 já está cadastrada.");
        }
    }

    public void atualizarPessoa1(Pessoa pessoa) {
        if (this.pessoa1 != null) {
            this.pessoa1 = pessoa;
            System.out.println("Pessoa 1 atualizada com sucesso.");
        } else {
            System.out.println("Pessoa 1 não está cadastrada.");
        }
    }

    public void atualizarPessoa2(Pessoa pessoa) {
        if (this.pessoa2 != null) {
            this.pessoa2 = pessoa;
            System.out.println("Pessoa 2 atualizada com sucesso.");
        } else {
            System.out.println("Pessoa 2 não está cadastrada.");
        }
    }

    public void exibirPessoa1() {
        if (pessoa1 != null) {
            System.out.println("Pessoa 1: " + pessoa1.getNome() + ", CPF: " + pessoa1.getCpf() + ", Idade: " + pessoa1.getIdade());
        } else {
            System.out.println("Pessoa 1 não cadastrada.");
        }
    }

    public void exibirPessoa2() {
        if (pessoa2 != null) {
            System.out.println("Pessoa 2: " + pessoa2.getNome() + ", CPF: " + pessoa2.getCpf() + ", Idade: " + pessoa2.getIdade());
        } else {
            System.out.println("Pessoa 2 não cadastrada.");
        }
    }
}