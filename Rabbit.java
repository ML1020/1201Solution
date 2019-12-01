import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = BirthRabbit(n);
        System.out.println(m);
    }

    private static int BirthRabbit(int n) {
        if (n > 2){
            return BirthRabbit(n-1)+BirthRabbit(n-2);
        }else if (n < 3){
            return 1;
        }
        return 0;
    }
}
