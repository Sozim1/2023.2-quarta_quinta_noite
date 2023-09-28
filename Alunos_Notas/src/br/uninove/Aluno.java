package br.uninove;

public class Aluno {

    private int matricula;
    private String nome;
    private float n1;
    private float n2;
    private float n3;
    private float media;
    
    
    //Construtor
    public Aluno(){ } // construtor implicito (vazio)
    
    //construtor com atributos (sobrecarregamos o método construtor)
    public Aluno(int matricula, String nome, float n1, float n2, float n3) {
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.nome = nome;
        this.media = (n1 + n2 + n3) / 3;
    }
  
    
    // o encapsulamento envolve três passos:
    // - private nos atributos
    // - um get para cada atributo -> me dá
    // - um set para cada atributo -> tó

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public float calculaMedia() {
        media = (n1 + n2 + n3) / 3;
        return media;
    }

}
