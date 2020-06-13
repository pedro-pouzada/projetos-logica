public class PessoaJuridica extends Cliente {
  private String razaoSocial;
  private long CNPJ;
  private int inscricaoEstadual;
  private double capitalInicial;
    
    
  public PessoaJuridica() {
    super();
  }
  
  public PessoaJuridica(String razaoSocial,long CNPJ,int inscricaoEstadual,double capitalInicial,int codigoDoCliente,String nome,String profissao) {
    this.razaoSocial = razaoSocial;
    this.CNPJ = CNPJ;
    this.inscricaoEstadual = inscricaoEstadual;
    this.capitalInicial = capitalInicial;
    this.codigoDoCliente = codigoDoCliente;
    this.nome = nome;
    this.profissao = profissao;
    }
    
  public String getRazaoSocial() {
    return this.razaoSocial = razaoSocial;
    }
  
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    }
    
  public long getCNPJ() {
    return this.CNPJ = CNPJ;
    }
    
  public void setCNPJ(long CNPJ) {
    this.CNPJ = CNPJ;
    }  
    
  public int getIncricaoEstadual() {
    return this.inscricaoEstadual = inscricaoEstadual;
    }  
  
  public void setInscricaoEstadual(int inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual; 
    } 
  
  public double getCapitalInicial() {
    return this.capitalInicial = capitalInicial;
    }
    
  public void setCapitalInicial(double capitalInicial) { 
    this.capitalInicial = capitalInicial;
    }  
    
  @Override
  public String toString() {
    return "\nPessoa Juridica"
           +"\nRazão Social: "+this.razaoSocial
           +"\nCNPJ: "+this.CNPJ
           +"\nInscrição Estadual: "+this.inscricaoEstadual
           +"\nCapital Inicial: "+this.capitalInicial
           +"\nCodigo do Cliente: "+this.codigoDoCliente
           +"\nNome: "+this.nome
           +"\nProfissão: "+this.profissao;
    }
  
  
}