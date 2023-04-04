

public class Except{
    public void except (int operand) {
        if (operand> 10 | operand < 1) try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        if (operand % 1 != 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
        }

    }
}
