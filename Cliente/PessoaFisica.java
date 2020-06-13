public class PessoaFisica extends Cliente {
 
  private String estadoCivil;
  private long CPF;
  private String dataDeNascimento;
  
  public PessoaFisica() {
    super();
   }
   
  public PessoaFisica(String estadoCivil,long CPF,String dataDeNascimento,int codigoDoCliente,String nome,String profissao) {
    this.estadoCivil = estadoCivil;
    this.CPF = CPF;
    this.dataDeNascimento = dataDeNascimento;
    this.codigoDoCliente = codigoDoCliente;
    this.nome = nome;
    this.profissao = profissao;
    } 
    
  public String getEstadoCivil() {
    return this.estadoCivil = estadoCivil;
    }  
    
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    } 
  
  public long getCPF() {
    return this.CPF = CPF;
    }
  
  public void setCPF(long CPF) {
    this.CPF = CPF;
    }  
  
  public String getDataDeNascimento() {
    return this.dataDeNascimento = dataDeNascimento;
    }
    
  public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
    }
    
  @Override
  public String toString() {
    return "\nPessoa Fisica: "
          +"\nEstado Civil: "+this.estadoCivil
          +"\nCPF: "+this.CPF
          +"\nData de Nascimento: "+this.dataDeNascimento
          +"\nCodigo do Cliente: "+this.codigoDoCliente
          +"\nNome: "+this.nome
          +"\nProfissão: "+this.profissao;
    }
  
}