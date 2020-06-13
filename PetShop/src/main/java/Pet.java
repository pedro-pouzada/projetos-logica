/**
 * @author Pedro
 * @version 1.0
 * @since 07/06/2020 - 18:12
 * @Category Model
 */
public class Pet {

    private String tipoDePet;
    private String nome;
    private int idade;
    private double banho;
    private double tosa;

    public Pet() {

    }

    /**
     *
     * @param tipoDePet
     * @param nome
     * @param idade
     * @param banho
     * @param tosa
     */
    public Pet(String tipoDePet, String nome, int idade, double banho, double tosa) {
        this.tipoDePet = tipoDePet;
        this.nome = nome;
        this.idade = idade;
        this.banho = banho;
        this.tosa = tosa;
    }

    public String getTipoDePet() {
        return tipoDePet;
    }

    public void setTipoDePet(String tipoDePet) {
        this.tipoDePet = tipoDePet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getBanho() {
        return banho;
    }

    public void setBanho(double banho) {
        this.banho = banho;
    }

    public double getTosa() {
        return tosa;
    }

    public void setTosa(double tosa) {
        this.tosa = tosa;
    }

    /**
     * @return retorna o valor do banho
     */
    public double calcularValorBanho() {
        return 75.00;
    }

    /**
     * @return retorna o  valor da tosa
     */
    public double calcularValorTosa() {
        return 40.00;
    }

    /**
     * @return retorna o valor do banho e da tosa
     */
    public double valorBanhoETosa() {
        return 75.00 + 40.00;
    }

    /**
     * @return escolher a opção de banho e tosa
     */
           int valor = 0;
    public String verificarOpcao() {
        switch (valor) {
            case 1:
                return "Valor banho e tosa: " + this.valorBanhoETosa();
            case 2:
                System.exit(0);
            default:
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pet: "
                + "\nTipo De Pet: " + this.tipoDePet
                + "\nNome do Pet: " + this.nome
                + "\nIdade do Pet: " + this.idade
                + "\nEscolha do pacote " + this.verificarOpcao();

    }
}