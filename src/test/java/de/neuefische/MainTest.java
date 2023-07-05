package de.neuefische;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void whenAdd_with5and6_thenExpect11() {
        //GIVEN
        int a = 5;
        int b = 6;
        int solution = 11;

        //WHEN
        int actual = Main.add(a,b);

        //THEN
        assertEquals(solution,actual);
    }


}