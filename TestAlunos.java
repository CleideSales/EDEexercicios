package src.ifma.lista01;

public class TestAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        Aluno aluno1 = new Aluno(3, "Maisa");
        Aluno aluno2 = new Aluno(1, "Cecilia");
        Aluno aluno3 = new Aluno(2, "Guilherme");

        cadastro.adicionarNoFinal(aluno1);
        cadastro.adicionarNoInicio(aluno2);
        cadastro.adicionarNoFinal(aluno3);

        System.out.println("Lista de alunos após adições:");
        cadastro.listarAlunos();

        cadastro.removerNoInicio();
        System.out.println("Lista de alunos após remoção no início:");
        cadastro.listarAlunos();

        cadastro.removerNoFinal();
        System.out.println("Lista de alunos após remoção no final:");
        cadastro.listarAlunos();

        cadastro.adicionarNoFinal(new Aluno(4, "Fran"));
        cadastro.adicionarNoFinal(new Aluno(5, "Cleide"));

        System.out.println("Lista de alunos após novas adições:");
        cadastro.listarAlunos();

        cadastro.ordenarVetor();
        System.out.println("Lista de alunos após ordenação:");
        cadastro.listarAlunos();

        try {
            String nomeRemovido = cadastro.removerComIndice(1);
            System.out.println("Aluno removido com índice 1: " + nomeRemovido);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lista final de alunos:");
        cadastro.listarAlunos();
    }
}