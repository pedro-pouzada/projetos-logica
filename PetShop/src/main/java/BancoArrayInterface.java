import java.util.List;

/**
 * @author Pedro
 * @version 1.0
 * @since   07/06/2020 - 19:23
 * @Category Interface
 */
public interface BancoArrayInterface {

    public void cadastrar(Pet pet);
    public List<Pet>buscar();
    public void remover(int index);
    public void alterar(int index, Pet pet);
    public Pet filtrar(Pet pet, int filtro);
    public int verificarQuantidade();
    public void apagarLista();

}
