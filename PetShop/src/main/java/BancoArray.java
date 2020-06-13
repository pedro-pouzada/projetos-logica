import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author Pedro
 * @version 1.0
 * @since 07/06/2020 - 19:30
 * @Category Model
 */
public class BancoArray implements BancoArrayInterface {

    List<Pet> agenda;

    public BancoArray() {
        agenda = new ArrayList<>();
    }

    @Override
    public void cadastrar(Pet pet) {
      this.agenda.add(pet);
    }

    @Override
    public List<Pet> buscar() {
        return this.agenda;
    }

    @Override
    public void remover(int index) {
        this.agenda.remove(index);
    }

    @Override
    public void alterar(int index, Pet pet) {
        this.agenda.add(index,pet);
    }

    @Override
    public Pet filtrar(Pet pet, int filtro) {
       switch (filtro){
           case 1: //tipoDePet
               for(Pet petAmigo : this.agenda){
                   if(petAmigo.getTipoDePet().contains(pet.getTipoDePet())){
                       return petAmigo;
                   }
               }
               break;
           case 2: //nome
               for(Pet petAmigo : this.agenda){
                   if(petAmigo.getNome().contains(pet.getNome())){
                       return petAmigo;
                   }
               }
               break;
           case 3: //idade
               for(Pet petAmigo : this.agenda){
                   if(petAmigo.getIdade() == pet.getIdade()){
                       return petAmigo;
                   }
               }
               break;
           default:
               return null;
       }
       return null;
    }

    @Override
    public int verificarQuantidade() {
        return this.agenda.size();
    }

    @Override
    public void apagarLista() {
      this.agenda.clear();
    }
}
