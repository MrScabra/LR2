public class Main {
    public static void main(String[] args) {
        // Оголошення змінних
        short s1 = -5;
        double d1 = -31.9;
        boolean b;
        long l;

        // Привласнення значень змінним
        l = (long) d1; // Привласнення значення змінної d1 зі змінної l
        d1 = Math.random() * 200 - 100; // Привласнення випадкового значення в діапазоні від -100 до 100 змінній d1
        b = false; // Привласнення значення false змінній b

        // Об'явлення та ініціалізація змінних d2 та добутку s1 та s2
        double d2 = 0.0; // Об'явлення змінної d2
        int s2 = s1 * s1; // Обчислення добутку s1 та s2

        System.out.println("s1: " + s1);
        System.out.println("d1: " + d1);
        System.out.println("b: " + b);
        System.out.println("l: " + l);
        System.out.println("s2: " + s2);
        System.out.println("d2: " + d2);
    }
}