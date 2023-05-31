import java.util.Scanner;

 class Metods {
    static Scanner scanner = new Scanner(System.in);
         static int getX(){
            System.out.println("input x: ");
            int x = scanner.nextInt();
            return x;
        }

         static int getY(){
            System.out.println("input y:");
            int y = scanner.nextInt();
            return y;
        }

         static int getOper() {
            System.out.println("select operation: ");
            char oper = scanner.next().charAt(0);
            return oper;
        }


    public static int calc(getX(), getY(), getOper()){
        int result;
        switch (oper){
            case '+':
                result = x+y;
                break;
            case '-':
                result = x-y;
                break;
            case '*':
                result = x*y;
                break;
            case '/':
                result = x/y;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(x, y, getOper());

            }
            return result;
        }}