
public class Main {
    public static void main(String[] args) {
        int x = Metods.getX();
        int y = Metods.getY();
        int oper = Metods.getOper();
        int result = Metods.calc(Metods.getX(), Metods.getY(), Metods.getOper());
        System.out.println("Результат операции: "+result);

    }
}