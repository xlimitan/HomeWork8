public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] tree = {'a', 'b', 'c'};

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
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]);
            if (i != tree.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}