import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double z = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        if(scanner.hasNextInt()){
        int n = scanner.nextInt();
        double[] userArray = new double [n];
        System.out.println("Введите данные для массива");
        for(int i = 0; i < n; i++){
           if (scanner.hasNextDouble()) {
            userArray[i] = scanner.nextDouble();
            if(userArray[i] == x || userArray[i] == y || userArray[i] == z){
                System.out.println("Данное значение имеется в константах");
            }
            } else {
            System.out.println("Введите число");
            break;
                }
            }
        } else {
            System.out.println("Введите целое число");
        }

        scanner.close();
    }
}