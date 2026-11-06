package visitor;

public class Coordenador implements Pessoa {

    private int matricula;
    private String nome;
    private Curso curso;

    public Coordenador(int matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCurso() {
        return this.curso.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCoordenador(this);
    }

}
