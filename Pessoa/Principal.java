public class Principal {

 public static void main(String args[]) {
    
    System.out.println("\f");
    
    Pessoa pessoa = new Pessoa("Pedro Rafael","Pouzada","rafaelteixeirask29@gmail.com","29/06/2001");
    System.out.println(pessoa);
    
    Aluno aluno = new Aluno(10,8,"Pedro Rafael","Pouzada","rafaelteixeirask29@gmail.com","29/06/2001");
    System.out.println(aluno);
    
    Professor professor = new Professor(1258796341,12,7.50,"Carlos Amaral","Silva","carlosamaral@gmail.com","24/03/1997");
    System.out.println(professor);
    
    Funcionario funcionario = new Funcionario(1258963415,2500.00,"Raul Mello","Souza","raulmello@gmail.com","29/02/1992");
    System.out.println(funcionario);
   
    }

}