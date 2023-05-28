public class JBHW2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Числа делящиеся на 3 и 5: " + sum);
        }
    }
    //Напишите программу, которая вычисляет сумму всех чисел от 1 до 50, которые делятся на 3 и 5 одновременно.