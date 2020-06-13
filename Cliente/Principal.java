public class Principal {

 public static void main(String args[]) {
    
    System.out.println("\f");
    
    Cliente cliente = new Cliente(1258749862,"Vitor Souza","Engenheiro");
    System.out.println(cliente);
    
    PessoaJuridica pessoaJuridica = new PessoaJuridica("Indústria Mecânica Modelo Ltda",84862247135894L,125874963,9450.58,1587963254,"Mecânica Modelo","Mecânico");
    System.out.println(pessoaJuridica);
    
    PessoaFisica pessoaFisica = new PessoaFisica("Solteiro",89567584215L,"25/04/1998",1236584789,"Ricardo Teixeira","Professor");
    System.out.println(pessoaFisica);
    
    
    }
}