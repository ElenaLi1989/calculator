
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        System.out.println("Введите пример: ");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine(); // Определяем строку х, которая должна считываться с консоли
        x = x.replace(" ", ""); // Удаляем пробелы из строки если такие есть
        char numb01 = x.charAt(0); // Выделяем первый операнд
        char numb02 = x.charAt(2); // Выделяем второй операнд
        int operator1 = Character.getNumericValue(numb01); // Переводим операнд из типа char в int
        Except except = new Except();
        except.except(operator1); // Вводим иссключения
        int operator2 = Character.getNumericValue(numb02);
        except.except(operator2);
        char operation = x.charAt(1); // Выделяем операцию
        int result = Calculate.operation(operator1, operator2, operation);
        System.out.println("Итого: " + result);


    }
}


