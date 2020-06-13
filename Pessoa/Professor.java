public class Professor extends Pessoa {

 private int numeroDeRegistro;
 private double numeroDeHorasTrabalhadas;
 private double valorHora;
 
 
 public Professor() {
    super();
    }
    
 public Professor(int numeroDeRegistro, double numeroDeHorasTrabalhadas, double valorHora,String nome, String sobrenome,String email,String dataDeNascimento) {
    this.numeroDeRegistro = numeroDeRegistro;
    this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    this.valorHora = valorHora;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.email = email;
    this.dataDeNascimento = dataDeNascimento; 
    }   
    
 public double calcularSalarioBruto() {
    return this.numeroDeHorasTrabalhadas * this.valorHora;
    
    } 
    
 public double calcularFGTS() {
    return this.calcularSalarioBruto() * 0.08;
    }   
    
    
 @Override
 public String toString() {
   return "\nProfessor"
         +"\nNúmero de Registro: "+this.numeroDeRegistro
         +"\nHoras Trabalhadas: "+this.numeroDeHorasTrabalhadas
         +"\nValor Hora: "+this.valorHora
         +"\nNome: "+this.nome
         +"\nSobrenome: "+this.sobrenome
         +"\nE-mail: "+this.email
         +"\nData de Nascimento: "+this.dataDeNascimento
         +"\nSalário Bruto: "+this.calcularSalarioBruto()
         +"\nFGTS: "+this.calcularFGTS();
    
    }

}