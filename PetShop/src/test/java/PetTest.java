/**
 * @Author Pedro
 * @version 1.0
 * @since  07/06/2020 - 19:21
 * @Category Test
 */

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Pet pet = new Pet();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * @test testando o calculo do valor Banho
     */
    @org.junit.jupiter.api.Test
    void tesCalcularValorBanho() {
        assertEquals(75.00,75.00,0.0);
    }
    /**
     * @test testando o calculo do valor Tosa
     */
    @org.junit.jupiter.api.Test
    void testCalcularValorTosa() {
        assertEquals(40.00,40.00,0.0);
    }
    /**
     * @test testando o calculo do valor Banho e tosa
     */
    @org.junit.jupiter.api.Test
    void testValorBanhoETosa() {
        assertEquals(115,115,0.0);
    }
}