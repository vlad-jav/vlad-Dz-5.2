public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир! ");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    private static void task7() {
        System.out.println("задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one> two && one>three) {
            System.out.println("Число " + one + " большее из 3х чисел." );
        } else if (two> one && two>three) {
            System.out.println("Число " + two + " большее из 3х чисел." );
        } else {
            System.out.println("Число " + three + " большее из 3х чисел.");
        }








    }

    private static void task6() {
        System.out.println("задача 6");
        int Passengers = 35;
        int wagon = 102;
        int sitDown = 60;
        if (Passengers <= 60) {
            System.out.println("В вагоне свободно " + (wagon - sitDown) + " стоячих места и " + (sitDown-Passengers) + " сидячих");
        } else if (Passengers > 60 && Passengers <= 102) {
            System.out.println("В вагоне свободно " + (wagon - Passengers ) + " стоячих места и заняты все сидячие ");
        } else if (Passengers > 102) {
            System.out.println("Вагон полностью забит");






        }

    }

    private static void task5() {
        System.out.println("задача 5");
        int years = 14;
        if (years < 5 ) {
            System.out.println("Если возраст ребенка равен "+years+ " то ему нельзя кататься на аттракционе" );
        }
        if (years > 5 && years < 14) {
            System.out.println("Если возраст ребенка равен "+ years + " то ему можно  кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (years >= 14 ) {
            System.out.println("Если возраст ребенка равен "+years+ " то ему можно  кататься без сопровождения взрослого." );
        }

    }

    private static void task4() {
        System.out.println("задача 4");
        int years = 40;
        if (years >= 2 && years < 6) {
            System.out.println("Если возраст человека равен "+years+ " то ему нужно ходить  сад ");
        }
        if (years >= 7 && years < 18){
            System.out.println("Если возраст человека равен "+years+ " то ему нужно ходить  школу  ");
        }
        if (years > 18 && years < 24){
            System.out.println("Если возраст человека равен "+years+ " то его место в университете  ");
        }
        if (years > 24){
            System.out.println("Если возраст человека равен "+years+ " то ему пора ходить на работу   ");
        }

    }

    private static void task3() {
        System.out.println("задача 3 ");
        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " +speed+ " придется заплатить штраф" );
        }

        if (speed < 60) {
            System.out.println("Если скорость " +speed+ " можно ездить спокойно");
        }
    }

    private static void task2() {
        System.out.println("задача 2");
        int degrees = 6;
        if (degrees >= 5) {
            System.out.println("На улице градусов" +degrees+ " нужно надеть шапку");
        }

        if (degrees < 5) {
            System.out.println("На улице  градусов "+degrees+ " можно идти без шапки.");
        }
    }

    private static void task1() {
        System.out.println("задача 1");
        int years = 24;
        if (years >= 18) {
            System.out.println("Если возраст человека равен "+ years + "то он совершеннолетний");
        }

        if (years < 18) {
            System.out.println("Если возраст человека равен "+years+ " то он не совершеннолетний ");
        }


    }}
