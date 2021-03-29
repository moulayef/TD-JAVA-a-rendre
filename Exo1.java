import java.util.Scanner;
class Exo1{
    public static void main(String[] args) {
        Scanner clavier= new Scanner(System.in);
        System.out.print("Saisissez un entier : ");
        int nbre=clavier.nextInt();
        if (nbre==0) {
            System.out.println("Cet entier est nul");
        }
        else if (nbre>0){
            System.out.println("Cet entier est positif");
        }
        else{
            System.out.println("Cet entier negatif ");
        }
    }
}