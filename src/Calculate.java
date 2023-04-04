public class Calculate {
    public static int operation(int operator1, int operator2, char operation) {

        int result = 0;
        if (operation == '+') {
            result = operator1 + operator2;
        } else if (operation == '-') {
            result = operator1 - operator2;
        } else if (operation == '*') {
            result = operator1 * operator2;
        } else if (operation == '/') {
            result = operator1 / operator2;
        } else {
            System.out.println("Ошибка");
         }
        return result;

    }
}
