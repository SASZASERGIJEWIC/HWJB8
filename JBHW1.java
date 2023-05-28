public class JBHW1 {
    public static void main(String[] args) {
        printsvn();
    }
    static void printsvn() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
//Напишите программу, которая выводит на экран все числа от 1 до 100, кратные 7.
