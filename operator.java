import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter following numbers: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int r = (a>b)?(a>c?a:c):(b>a?b:c);
        System.out.println(r+ " is the biggest number of all");
    }
}
