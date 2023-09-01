class Pessoa {
  // Atributos da "Pessoa"
  String nome, tipoSanguineo;
  int idade;
  char sexo;
  float peso, altura;
  boolean fumante;
  Endereco endereco;
  
  // métodos (comportamentos)
  public void nascer(String nome, String tipoSanguineo, char sexo, float peso, float altura) {
    idade = 0; 
    fumante = false;
    this.nome = nome;
    this.tipoSanguineo = tipoSanguineo;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
  }

  public int fazerAniversario() {
    idade++; //é o mesmo que: idade = idade + 1;
    return idade;
  }
}
