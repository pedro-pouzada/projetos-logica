/**
 * @author Pedro Pouzada & Iuri Bittencourt
 * @version 1.0
 * @since 01/06/2020 - 08:44
 */
public class Trimestre {

    private String mesNascimento;
    
    public Trimestre() {
        
    }
    
     public Trimestre(String mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
     
    public String getMesNascimento() {
       return this.mesNascimento;
       
    }
    
    public void setMesNascimento(String mesNascimento) {
      this.mesNascimento = mesNascimento;
    
    }
    
     /**
      * @return metodo para verificar o trimestre de nascimento
      */
     public String verificarMes() {
         if(this.mesNascimento.equals("Janeiro") || this.mesNascimento.equalsIgnoreCase("Fevereiro") || this.mesNascimento.equalsIgnoreCase("Março") ) {
            return "Você nasceu no primeiro Trimestre";
            
           }  else if (this.mesNascimento.equalsIgnoreCase("Abril") || this.mesNascimento.equalsIgnoreCase("Maio") || this.mesNascimento.equalsIgnoreCase("Junho") ) {
              return "Você nasceu no segundo Trimestre";
      
          }else if (this.mesNascimento.equalsIgnoreCase("Julho") || this.mesNascimento.equalsIgnoreCase("Agosto") || this.mesNascimento.equalsIgnoreCase("Setembro") ) {
               return"Você nasceu no terceiro Trimestre";
      
         }else if (this.mesNascimento.equalsIgnoreCase("Outubro") || this.mesNascimento.equalsIgnoreCase("Novembro") || this.mesNascimento.equalsIgnoreCase("Dezembro") ) {
                   return"Você nasceu no quarto Trimestre" ;
      
          }else 
             return "Mês Inválido";
               
        }
        
        public String toString() {
        return "\nMes inserido: " + this.mesNascimento
               +"\nTrimestre: " + this.verificarMes();
        
        }
   
    }
    


    

