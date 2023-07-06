package de.neuefische;

public class Main {

    public static void main(String[] args) {


        //am häufigsten
        int a = 2;
        boolean c = true;
        double d = 1.04;

        //eher seltener
        char b = 'd';
        byte e = 123;
        short f = 12345;
        long g = 34646456456456L;
        float h = 1.085f;

        //komplexen "Datentyp"
        String j = "Hallo"; //verkettung von char´s + liefert vorgefertigte Methoden, die man mit einem .x aufrufen kann

        if (a < 2){
            System.out.println("ist kleiner");
        } else if (a ==2) {
            System.out.println("ist genau zwei");
        }else {
            System.out.println("ist wohl größer!");
        }

        String[] coaches = new String[3]; // indexen : 0,1,2 -> lange schreibweise, Werte können aber auch später nachgereicht werden
        coaches[1] = "Dominic";
        coaches[0] = "Sara";
        System.out.println(coaches[0]);
        System.out.println(coaches[1]);
        System.out.println(coaches[2]);

        String[] coaches2 = {"Sara", "Dominic"}; //kurze Schreibweise, setzt aber voraus, das alle Werte bekannt sind.
        System.out.println(coaches2[0]);

        String someString = "HalloWelt";
        System.out.println(someString.contains("Welt"));

        switch (5) {
            case 5:
                System.out.println("Hallo");
                break;
            case 6:
                System.out.println("Welt");
                break;
            case 7:
                System.out.println("ups");
                break;
            default:
                System.out.println("Nichts gefunden");
        }

                switch (5){
                    case 5 -> System.out.println("Hallo");

                    case 6 ->
                        System.out.println("Welt");

                    case 7 ->
                        System.out.println("ups");

                    default ->
                        System.out.println("Nichts gefunden");
        }
    }
// Sichtbarkeit statisch rückgabeTyp MethodenNamen (Übergabeparameter)
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
            // count = count+1;
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