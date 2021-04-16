public class Etudiant extends Personne{

private String encadreur;
public static int etudiant;
 public Etudiant(String prenom,String nom,String encadreur){
    super( nom, prenom) ;
    etudiant++;
    id=etudiant;

    this.encadreur=encadreur;

 }
 public Etudiant(){
    etudiant++;
    id=etudiant;
}

public String getEncadreur(){

    return encadreur;
}


@Override
public String affiche(){
    return super.affiche() +"Encadreur: "+encadreur;
}

}

