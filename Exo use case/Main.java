import java.util.Scanner;
public class Main{
        
        public static void main(String args[]){
        Scanner clavier=new Scanner(System.in);
        Service service=new Service();
        String choix;

        do{
            System.out.println("Faites votre choix");
            System.out.println("1-Ajouter classe");
            System.out.println("2-Lister classe");
            System.out.println("3-Inscrire etudiant dans une classe");
            System.out.println("4-Affecter une classe à un enseignant");
            System.out.println("5-Lister les classes d'un enseignant");
            System.out.println("6-Lister les étudiants d'une classe");
            System.out.println("7-Quitter");
            choix=clavier.nextLine();
            
            
            switch(choix){
                case "1":
                System.out.println("Ajouter classe");
                System.out.println("Entrer le libelle d'une classe");
                String libelle=clavier.nextLine();
                Classe cl=new Classe();
                cl.setLibelle(libelle);
                service.ajouterClasse(cl);
                break;

                case "2":
                System.out.println("+++++**************+++++");
                System.out.println("Lister classe");
                service.listerClasse();
                break;

                case "3":
                System.out.println("+++++**************+++++");
                System.out.println("Inscrire etudiant dans une classe");
                System.out.println("Nouvel etudiant :");

                System.out.println("Prenom="); String prenom=clavier.nextLine();
                System.out.println("Nom="); String nom=clavier.nextLine();
                System.out.println("Encadreur="); String encadreur=clavier.nextLine();
                Etudiant et=new Etudiant();
                et.setPrenom(prenom);
                et.setNom(nom);
                et.setEncadreur(encadreur);
                break;

                case "4":
                System.out.println("+++++**************+++++");
                System.out.println("Affecter une classe à un enseignant");
                service.affectEns();
                break;

                case "5":
                System.out.println("+++++**************+++++");
                System.out.println("Lister les classes d'un enseignant");
                service.listerEns();
                break;
                case "6":
                System.out.println("+++++**************+++++");
                System.out.println("Lister les étudiants d'une classe");
                service.listerEtudiant();
                break;
                
                
            }
        }while(choix!="7");
    } 
}