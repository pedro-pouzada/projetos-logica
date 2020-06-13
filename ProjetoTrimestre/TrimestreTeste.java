import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * A classe de teste TrimestreTeste.
 *
 * @author  Pedro Pouzada & Iuri Bittencourt
 * @version 1.0
 * @since 01/06/2020 - 09:19
 */
public class TrimestreTeste {
     Trimestre trimestre = new Trimestre();
     
     
    /**
     * Construtor default para a classe de teste TrimestreTeste
     */
    public TrimestreTeste() {
    
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
    
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    
    }
    
    /**
     * @test Testando o mes 1
     */
    @Test
    public void testVerificarMes() {
     trimestre.setMesNascimento("Janeiro");  
     assertEquals("Você nasceu no primeiro Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 2
     */
     @Test
    public void testVerificarMes2() {
     trimestre.setMesNascimento("Fevereiro");
     assertEquals("Você nasceu no primeiro Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 3
     */
      @Test
    public void testVerificarMes3() {
     trimestre.setMesNascimento("Março");
     assertEquals("Você nasceu no primeiro Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 4
     */
      @Test
    public void testVerificarMes4() {
     trimestre.setMesNascimento("Abril");
     assertEquals("Você nasceu no segundo Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 5
     */
      @Test
    public void testVerificarMes5() {
     trimestre.setMesNascimento("Maio");
     assertEquals("Você nasceu no segundo Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 6
     */
      @Test
    public void testVerificarMes6() {
     trimestre.setMesNascimento("Junho");
     assertEquals("Você nasceu no segundo Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 7
     */
      @Test
    public void testVerificarMes7() {
     trimestre.setMesNascimento("Julho");
     assertEquals("Você nasceu no terceiro Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 8
     */
      @Test
    public void testVerificarMes8() {
     trimestre.setMesNascimento("Agosto");
     assertEquals("Você nasceu no terceiro Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 9
     */
      @Test
    public void testVerificarMes9() {
     trimestre.setMesNascimento("Setembro");
     assertEquals("Você nasceu no terceiro Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 10
     */
      @Test
    public void testVerificarMes10() {
     trimestre.setMesNascimento("Outubro");
     assertEquals("Você nasceu no quarto Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 11
     */
      @Test
    public void testVerificarMes11() {
     trimestre.setMesNascimento("Novembro");
     assertEquals("Você nasceu no quarto Trimestre", trimestre.verificarMes());
    }
    
    /**
     * @test Testando o mes 12
     */
      @Test
    public void testVerificarMes12() {
     trimestre.setMesNascimento("Dezembro");
     assertEquals("Você nasceu no quarto Trimestre", trimestre.verificarMes());
    }
}
