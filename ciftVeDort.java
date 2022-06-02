import java.util.Scanner;

public class ciftVeDort {
    public static void main(String[] args) {
        int n,total=0;
        Scanner in =new Scanner(System.in);

        do{
            System.out.print("Sayi Gir: ");
            n= in.nextInt();
            if(n%4==0){
                total+=n;


            }


        }while (n%2==0);
        System.out.print("4 e Bolunenlerin Toplami :");
        System.out.println(total);
    }
}
