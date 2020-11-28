package num2;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.println((3 * i - 2) + " * " + j + " = " + (3 * i - 2) * j + "\t\t" + (3 * i - 1) + " * " + j + " = " + (3 * i - 1) * j + "\t\t" + (3 * i) + " * " + j + " = " + (3 * i) * j);
            }
            System.out.println();
        }
    }
}
