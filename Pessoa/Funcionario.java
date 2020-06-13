public class Funcionario extends Pessoa{

private int numeroDeRegistro;
private double salarioFixo;

public Funcionario(){
  super();
}

public Funcionario(int numeroDeRegistro, double salarioFixo,String nome,String sobrenome,String email,String dataDeNascimento){
 this.numeroDeRegistro = numeroDeRegistro;
 this.salarioFixo = salarioFixo;
 this.nome = nome;
 this.sobrenome = sobrenome;
 this.email = email;
 this.dataDeNascimento = dataDeNascimento;
  }

public double calcularFGTS(){
 return this.salarioFixo * 0.08;
  } 


  
@Override
public String toString(){
 return "\nFuncionário"
        +"\nNúmero De Registro: "+this.numeroDeRegistro
        +"\nSalário Fixo: "+this.salarioFixo
        +"\nNome: "+this.nome
        +"\nSobrenome: "+this.sobrenome
        +"\nE-mail: "+this.email
        +"\nData De Nascimento: "+this.dataDeNascimento
        +"\nFGTS: "+this.calcularFGTS();

  }
}