public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1-2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        char[] three = {'a', 'b', 'c'};

        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 3");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        char[] three = {'a', 'b', 'c'};

        for (int i  = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i  = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i  = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 4");

    }
}