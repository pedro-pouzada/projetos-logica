public class Aluno extends Pessoa {

  private double nota1;
  private double nota2;
    
  public Aluno() {
    super();
    }
   
  public Aluno(double nota1,double nota2,String nome,String sobrenome,String email,String dataDeNascimento) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.email = email;
    this.dataDeNascimento = dataDeNascimento;
    }  
    
  public double getNota1() {
    return this.nota1 = nota1;
    }
    
  public void setNota1(double nota1) {
     this.nota1 = nota1;
    }
    
  public double getNota2() {
    return this.nota2 = nota2;
    }
    
  public void setNota2(double nota2) {
     this.nota2 = nota2;
    }  
    
  public double calcularMediaAritmetica() {
    return (nota1 + nota2) / 2; 
    
    }  
  
    
    
  @Override
  public String toString() {
    return "\nAluno"
           +"\nNota1: "+this.nota1
           +"\nNota2: "+this.nota2
           +"\nMédia Aritimetica: "+this.calcularMediaAritmetica()
           +"\nNome: "+this.nome
          +"\nSobrenome: "+this.sobrenome
          +"\nE-mail: "+this.email
          +"\nData De Nascimento: "+this.dataDeNascimento;
    }
}