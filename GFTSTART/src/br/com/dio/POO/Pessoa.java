package br.com.dio.POO;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private int RG;


    public Pessoa() {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.RG = RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", RG=" + RG +
                '}';
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }
}
