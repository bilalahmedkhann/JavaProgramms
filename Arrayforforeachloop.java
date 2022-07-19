import java.util.Scanner;

public class Arrayforforeachloop {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter number for arrays: ");
        Scanner s = new Scanner(System.in);
        for (int i =0 ;i<5;i++){
            a[i]=s.nextInt();
        }
        for(int b : a){
            System.out.println(b+" ");
        }

    }
}
