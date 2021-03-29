import java.util.Scanner;
class Exo2{
    public static void main(String[] args) {
        Scanner comp= new Scanner(System.in);
        System.out.print("Entrer le 1er entier: ");

        int ent1=comp.nextInt();
        System.out.print("Entrer le 2e entier: ");
        int ent2=comp.nextInt();
        if (ent1==ent2) {
            System.out.println("Les deux entiers sont pareils");
        }
        else if (ent1 > ent2) {
            System.out.println(ent1+ " est plus grand que " +ent2);
        }
        else{
            System.out.println(ent2+ " est plus grand que " +ent1);
        }
    }
}