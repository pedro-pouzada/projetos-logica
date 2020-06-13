public class Pessoa {
 
 protected String nome;
 protected String sobrenome;
 protected String email;
 protected String dataDeNascimento;

 public Pessoa() {
  
    }
    
 public Pessoa(String nome, String sobrenome, String email, String dataDeNascimento) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.email = email;
    this.dataDeNascimento = dataDeNascimento;
    
    }
 
 public String getNome() {
    return this.nome = nome;
    }
 
 public void setNome(String nome) {
    this.nome = nome;
    }
    
 public String getSobrenome() {
    return this.sobrenome = sobrenome;
    }
 
 public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
    }
    
 public String getEmail() {
    return this.email = email;
    }
 
 public void setEmail(String email) {
    this.email = email;
    }  
 
 public String getDataDeNascimento() {
    return this.dataDeNascimento = dataDeNascimento;
    }
 
 public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
    }   
    
@Override
 public String toString() {
    return "\nNome: "+this.nome
          +"\nSobrenome: "+this.sobrenome
          +"\nE-mail: "+this.email
          +"\nData De Nascimento: "+this.dataDeNascimento;
 }
    
}