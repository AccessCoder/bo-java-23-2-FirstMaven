package de.neuefische;

public class Main {

    public static void main(String[] args) {
//        countTo100WithWhile();
        countTo100WithFor();
    }

    public static int add (int a, int b){
        return a+b;
    }

    public static boolean checkIfGreaterThan100(int x){
        return x>100;
    }



    /**User gibt Alter ein und nach einer Prüfung werden folgende Werte zurückgegeben
     * unter 14 = Kind
     * zwischen 14 und 16 = Minderjährig
     * zwischen 16 und 18 = Jugendlich
     * 18+ = Erwachsen
     */

    public static String checkAge(int age) {
        if (age < 16 && age > 13){
            return "Minderjährig";
        } else if (age < 18 && age > 15) {
            return "Jugendlich";
        } else if (age >= 18) {
            return "Erwachsen";
        }
        return "Kind";
    }

    public static void countTo100WithWhile(){
        int count = 0;
        while (count < 100){
            count++;
            System.out.println(count);
        }
    }

    public static void countTo100WithFor(){
        for (int i = 1;i<=100;i++){
            System.out.println(i);
        }
    }


//    public static int getFaculty(int number) {
//        int faculty = 1; //!0
//        for (int i = 1;i<=number; i++){
//            faculty*=i;
//        }
//        return faculty;
//    }

    public static int getFaculty(int number) {
        int faculty = 1; //!0
        while (number>1){
            faculty*=number;
            number--;
        }
        return faculty;
    }
}