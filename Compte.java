public class Compte{
    private float solde;

    //Méthodes
        //Constructeurs par défaut
        public Compte(){
            
        }
    //Constructeur surchargé
    public Compte(float solde){
        this.solde=solde;
    }

    //getters
    public float getSolde(){
        return solde;
    }

    //setter
    public void setSolde(float solde){
        this.solde=solde;
    }

    //méthode dépot
    public void depot(float mt){
        solde+=mt;
    }

}

}