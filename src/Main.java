
public class Main {
    public static void main(String[] args) {
        int x = Metods.getX();
        int y = Metods.getY();
        int oper = Metods.getOper();
        int result = Metods.calc(x, y, oper);
        System.out.println("Результат операции: "+result);

    }
}