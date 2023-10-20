public class LengthException extends Exception {
    String message;
    // Конструктор для класса исключения
    public LengthException() {
        this.message = "Строка слишком маленькая)))";
    }

    @Override
    public String getMessage() { //геттер для получение сообщения об ошибке
        return message;
    }
}
