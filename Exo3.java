import java.util.Scanner;
class Exo3{
    public static void main(String[] args) {
        Scanner rang= new Scanner(System.in);
        System.out.print("Entrer le 1er entier : ");
        int ent1=rang.nextInt();
        System.out.print("Entrer le 2e entier: ");
        int ent2=rang.nextInt();
        System.out.print("Entrer le 3e entier: ");
        int ent3=rang.nextInt();
        if (ent1>ent2 && ent1>ent3 && ent2>ent3) {
            System.out.println(ent1+ "," +ent2 +"," + ent3);
        }
        else if (ent2>ent1 && ent2>ent3 && ent1>ent3) {
            System.out.println(ent2 + "," + ent1 + "," +ent3);
        }
        else{
            System.out.println(ent2 + "," + ent3 + "," + ent1);

        }

    }
}