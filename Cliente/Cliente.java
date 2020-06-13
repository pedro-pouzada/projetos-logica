public class Cliente {

 protected int codigoDoCliente;
 protected String nome ;
 protected String profissao;
 
 public Cliente() {
 
    }
 
 public Cliente(int codigoDoCliente,String nome,String profissao) {
    this.codigoDoCliente = codigoDoCliente;
    this.nome = nome;
    this.profissao = profissao;
    }
    
 public int getCodigoDoCliente() {
    return this.codigoDoCliente = codigoDoCliente;
    }
    
 public void setCodigoDoCliente(int codigoDoCliente) {
    this.codigoDoCliente = codigoDoCliente;
    } 
    
 public String getNome() {
    return this.nome = nome;
    }
    
 public void setNome(String nome) {
    this.nome = nome;
    }
    
 public String getProfissao() {
    return this.profissao = profissao;
    }
    
 public void setProfissao(String profissao) {
    this.profissao = profissao;   
    }
    
 @Override
 public String toString() {
    return "Cliente"
           +"\nCodigo do cliente: "+this.codigoDoCliente
           +"\nNome do cliente: "+this.nome
           +"\nProfissão: "+this.profissao;
    
    }
 
 
 

}