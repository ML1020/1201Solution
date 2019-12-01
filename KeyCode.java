import java.util.Scanner;

public class KeyCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            for (int i = 0;i < s.length();i++){
                char c = s.charAt(i);
                //如果大于E就减5；若小于E就加21
                if (s.charAt(i) >= 'A'){
                    if (s.charAt(i) > 'E'){
                        c = (char)(s.charAt(i) - 5);
                    }else {
                        c = (char)(s.charAt(i) + 21);
                    }
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
