/**
 * Escreva a descrição da classe Nadador aqui.
 * 
 * @author Pedrou Pouzada & Iuri Bittencourt 
 * @version 1.0
 * @since 01/06/2020 11:14
 */
public class Nadador {
    
    private String nomeNadador;
    private int idadeNadador;
    
     public Nadador() {
   
        }
    
    public Nadador(String nomeNadador, int idadeNadador) {
        this.nomeNadador = nomeNadador;
        this.idadeNadador = idadeNadador;
    }

    public String getNomeNadador() {
        return this.nomeNadador;
    }

    public void setNomeNadador(String nomeNadador) {
        this.nomeNadador = nomeNadador;
    }

    public int getIdadeNadador() {
        return this.idadeNadador;
    }

    public void setIdadeNadador(int idadeNadador) {
        this.idadeNadador = idadeNadador;
    }
    /**
     * @return Retorna o metodo para setar  a idade 
     */
    public String verificarIdadeNadador() {
        if(this.idadeNadador < 8) {
            return "Não pode ser nadador, mínimo oito anos";
        } else if (this.idadeNadador >= 8 && this.idadeNadador <= 10) {
            return "Nadador Infantil";
        } else if (this.idadeNadador >= 11 && this.idadeNadador <= 17) {
            return "Nadador Juvenil";
        } else if (this.idadeNadador >= 18) {
            return "Nadador Adulto";
        } else {
            return "Idade inválida";
        }

    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeNadador
             +  "\nIdade: " + this.idadeNadador
             + "\nNadador: " + verificarIdadeNadador(); 

    }
}