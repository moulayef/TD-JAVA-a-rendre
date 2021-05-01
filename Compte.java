public class Compte{
    private float solde;
    public int mt;
    //Méthodes
        //Constructeurs par défaut
        public Compte(){
            
        }
    //Constructeur surchargé
    public Compte(float solde, int mt){
        this.solde=solde;
        this.mt=mt;
    }

    //getters
    public float getSolde(){
        return solde;
    }

    public int getMt(){
        return mt;
    }
    //setter
    public void setSolde(float solde){
        this.solde=solde;
    }

    public void setMt(int mt){
        this.mt = mt;
    }

    //méthode dépot
    public int depot(){
        return solde;
    }

}
