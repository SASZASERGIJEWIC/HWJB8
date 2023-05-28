public class JBHW3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма точных квадратов: " + sum);
        }
    }
//Напишите программу, которая вычисляет сумму всех чисел от 1 до 1000, которые являются точными квадратами.
//-точный квадрат - квадрат целого числа (4, 9, 16, 25 и тд)