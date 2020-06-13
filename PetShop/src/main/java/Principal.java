import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author Pedro
 * @version 1.0
 * @since 07/06/2020 - 19:46
 * @Category View
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BancoArray agenda = new BancoArray();

        Pet pet = null;


        int opcao = 0;

        do {
            System.out.println("1-Cadastrar\n2-Ver Lista\n3-Remover\n4-Alterar\n5-Filtrar\n6-Verificar Quantidade\n7-Apagar\n100-Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    pet = new Pet();
                    System.out.println("Digite o Nome do seu Pet");
                    pet.setNome(scanner.next());

                    System.out.println("Digite a Idade do seu Pet");
                    pet.setIdade(scanner.nextInt());

                    System.out.println("Digite o Tipo do Pet");
                    pet.setTipoDePet(scanner.next());

                    System.out.println("Deseja comprar o pacote de banho e tosa?\n1-Sim\n2-Não");
                    pet.valor = scanner.nextInt();

                    agenda.cadastrar(pet);
                    System.out.println("Pet cadastrado com sucesso");

                    break;
                case 2:
                    if(agenda.verificarQuantidade() != 0){
                        agenda.buscar().forEach(System.out::println);
                    }else{
                        System.out.println("Não há pets");
                    }
                    break;
                case 3:
                    System.out.println("Digite uma posição que deseja excluir: ");
                    int index = scanner.nextInt();
                    agenda.remover(index);
                    System.out.println("Pet apagado com sucesso ");
                    break;
                case 4:
                    break;
                case 5:
                    int opcaoFiltro = 0;
                    System.out.println("Como deseja filtrar\n1-Pelo tipo do pet\n2-Pelo Nome do pet\n3-Pela idade do pet");
                    opcaoFiltro = scanner.nextInt();
                    switch (opcaoFiltro) {
                        case 1:
                        System.out.println("Digite o tipo de Pet que deseja filtrar");
                        pet.setTipoDePet(scanner.next());
                        pet = agenda.filtrar(pet, 1);
                        System.out.println(pet != null ? pet : "Pet não encontrado");
                             break;

                         case 2:
                    System.out.println("Digite o Nome Pet que deseja filtrar");
                    pet.setNome(scanner.next());
                    pet = agenda.filtrar(pet,2);
                    System.out.println(pet != null ? pet:"Pet não encontrado");
                            break;
                        case 3:
                    System.out.println("Digite a idade do Pet que deseja filtrar");
                    pet.setIdade(scanner.nextInt());
                    pet = agenda.filtrar(pet,3);
                    System.out.println(pet != null ? pet:"Pet não encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Há "+ agenda.verificarQuantidade() + " Pet(s)");
                    break;
                case 7:
                    agenda.apagarLista();
                    System.out.println("Lista Limpa");
                    break;
                case 100:
                    System.exit(0);
                    break;


            }

        }while(opcao !=100);
    }
}
