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

    /**User gibt Alter ein und nach einer Prüfung werden folgende Werte zurückgegeben
     * unter 14 = Kind
     * zwischen 14 und 16 = Minderjährig
     * zwischen 16 und 18 = Jugendlich
     * 18+ = Erwachsen
     */

    @Test
    void whenCheckAge_with10_thenExpectKind(){
        assertEquals("Kind", Main.checkAge(10));
    }

    @Test
    void whenCheckAge_with14_thenExpectMinderjährig(){
        //GIVEN
        int age = 14;
        //WHEN
        String actual = Main.checkAge(age);
        //THEN
        assertEquals("Minderjährig", actual);
    }

    @Test
    void whenCheckAge_with16_thenExpectJugendlich(){
        //GIVEN
        int age = 16;
        //WHEN
        String actual = Main.checkAge(age);
        //THEN
        assertEquals("Jugendlich", actual);
    }

    @Test
    void whenCheckAge_with18_thenExpectErwachsen(){
        //GIVEN
        int age = 18;
        //WHEN
        String actual = Main.checkAge(age);
        //THEN
        assertEquals("Erwachsen", actual);
    }

    @Test
    void whenCheckAge_withMinus1_thenExpectErwachsen(){
        //GIVEN
        int age = -1;
        //WHEN
        String actual = Main.checkAge(age);
        //THEN
        assertEquals("Kind", actual);
    }

    @Test
    void whenGetFaculty_with3_thenExpect6(){
        //GIVEN
        int number = 3;
        int expected = 6;
        //WHEN
        int actual = Main.getFaculty(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void whenGetFaculty_with5_thenExpect120(){
        //GIVEN
        int number = 5;
        int expected = 120;
        //WHEN
        int actual = Main.getFaculty(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void whenGetFaculty_with10_thenExpect3628800(){
        //GIVEN
        int number = 10;
        int expected = 3628800;
        //WHEN
        int actual = Main.getFaculty(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void whenGetFaculty_with0_thenExpect1(){
        //GIVEN
        int number = 0;
        int expected = 1;
        //WHEN
        int actual = Main.getFaculty(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void whenGetFaculty_withMinus5_thenExpect1(){
        //GIVEN
        int number = -5;
        int expected = 1;
        //WHEN
        int actual = Main.getFaculty(number);
        //THEN
        assertEquals(expected, actual);
    }

}