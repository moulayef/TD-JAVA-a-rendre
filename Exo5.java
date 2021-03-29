import java.util.Scanner;
class Exo5{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Entrer le chiffre correspondant au mois : ");
        int mois= number.nextInt(); 
        System.out.print("Entrer l'annee : ");
        int annee=number.nextInt(); 
        switch (mois){
            case 2:
                if(annee%4==0 && annee%100!=0 || annee%400==0 ){
                    System.out.println("Le nbre de Jours du mois " +mois+ " dans l'annee " +annee+ " est de : 29jours");
                }else{
                    System.out.println("Le nbre de Jours du mois " +mois+ " dans l'annee " +annee+ " est de : 28jours");
                }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Le nbre de Jours du mois " +mois+ " dans l'anne " +annee+ " est de : 30jours");
                 break;
            default:
                System.out.println("Le nbre de Jours du mois " +mois+ " dans l'anne " +annee+ " est de : 31jours");
                break;
        } 
    }
}       