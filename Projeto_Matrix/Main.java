class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.nascer("Bucefalo Gomes", "O+", 'M', 0.5f, 0.3f);

    Endereco end = new Endereco();
    end.logradouro = "Rua das Ruas";
    end.numero = 665;
    end.bairro = "Liberdade";
    end.cep = 12345123;
    end.cidade = "Bragança Paulista";
    end.estado = "São Paulo";
    end.pais = "Brasil";
    
    Pessoa p2 = new Pessoa();
    p2.nome = "Papa Romeo";
    p2.idade = 70;
    p2.tipoSanguineo = "AB-";
    p2.sexo = 'D';
    p2.altura = 1.90f;
    p2.peso = 120;
    p2.fumante = true;
    p2.endereco = end;

    //mostrando os dados das pessoas....
    System.out.println("-----Pessoa 1------");
    System.out.println("\tNome: " + p1.nome);
    System.out.println("\tIdade: " + p1.idade);
    System.out.println("\tSexo: " + p1.sexo);
    System.out.println("\tTipo Sanguíneo: " + p1.tipoSanguineo);
    System.out.println("\tAltura: " + p1.altura);
    System.out.println("\tPeso: " + p1.peso);
    System.out.println("\tFuma: " + (p1.fumante ? "Sim" : "Não"));

    p1.fazerAniversario();
    System.out.println("!!!! ôba, festinha!!!!");
    System.out.println("Agora o " + p1.nome + " tem " + p1.idade + " aninho(s)!");    

    System.out.println("-----Endereço da Pessoa 2-----");
    System.out.println("\tLogradouro:" + p2.endereco.logradouro);
    System.out.println("\tLogradouro:" + p2.endereco.logradouro);
    //...

  }
}