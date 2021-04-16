public class Enseignant extends Personne{


private String grade;
public static int nbEns;

    public Enseignant(){
        nbEns++;
        id=nbEns;
    }
    public Enseignant(String prenom,String nom,String grade){
        super( nom, prenom) ;
        nbEns++;
        id=nbEns;
        this.grade=grade;

    }

    public String getGrade(){
    
        return grade;
    }
    
    public void setGrade(String grade){
    
        this.grade=grade;
    }
    @Override
    public String affiche(){
    return super.affiche() +"Grade: "+grade;
    }
}






