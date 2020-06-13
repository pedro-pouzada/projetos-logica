

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TesteNadador.
 *
 * @author  Pedro Pouzada & Iuri Bittencourt
 * @version 1.0
 * @since 01/06/2020 - 11:36
 */
public class TesteNadador {
    Nadador nadador = new Nadador();
   
    /**
     * Construtor default para a classe de teste TesteNadador
     */
    public TesteNadador() {
     nadador.setIdadeNadador(5);
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
     * @test testando a idade do nadador
     */
    @Test
    public void testVerificarIdadeNadador() {
        assertEquals("Não pode ser nadador, mínimo oito anos", nadador.verificarIdadeNadador());
    }
    
    /**
     * @test testando a idade do nadador
     */
    @Test
    public void testVerificarIdadeNadador1() {
        nadador.setIdadeNadador(10);
        assertEquals("Nadador Infantil", nadador.verificarIdadeNadador());
    }
    
    /**
     * @test testando a idade do nadador
     */
    @Test
    public void testVerificarIdadeNadador2() {
        nadador.setIdadeNadador(15);
        assertEquals("Nadador Juvenil", nadador.verificarIdadeNadador());
    }
    
    /**
     * @test testando a idade do nadador
     */
    @Test
    public void testVerificarIdadeNadador3() {
        nadador.setIdadeNadador(18);
        assertEquals("Nadador Adulto", nadador.verificarIdadeNadador());
    }
    
    /**
     * @test testando a idade invalida
     */
     @Test
    public void testVerificarIdadeNadador4() {
        nadador.setIdadeNadador(-8);
        assertEquals("Idade inválida", nadador.verificarIdadeNadador());
    }
    
    
    
    
}
