import java.util.Scanner;

public class Main {
    public static void StringLength() throws LengthException { // метод для проверки длины строки
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        if (str.length() < 1000) {
            throw new LengthException();
        }
    }

    public static void main(String[] args) {
        try {
            StringLength();
        } catch (LengthException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
