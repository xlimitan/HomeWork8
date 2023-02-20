public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }
        System.out.println();
        double[] two = {1.57, 7.654, 9.986};
        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);
        }
        System.out.println();
        int[] three = {37, 7, 9, 82, 15};
        for (int i = 0; i < three.length; i++) {
            System.out.println(three[i]);
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        System.out.printf(one[0] + ", " + one[1] + ", " + one[2]);
        System.out.println();
        System.out.println();
        double[] two = {1.57, 7.654, 9.986};
        System.out.printf(two[0] + ", " + two[1] + ", " + two[2]);
        System.out.println();
        System.out.println();
        int[] three = {37, 7, 9, 82, 15};
        System.out.printf(three[0] + ", " + three[1] + ", " + three[2] + ", " + three[3] + ", " + three[4]);
    }

    public static void task3() {
        System.out.println();
        System.out.println();
        System.out.println("Задача 3");

    }
}
