public class CompteCheque extends Compte{
    private int frais;

    //Constructeur par défaut
    public CompteCheque(){
        super();
    }

    //Constructeur surchargé
    public CompteCheque(float solde, int frais){
        super(solde);
        this.frais=frais;
    }

    //Getters
    public int getFrais(){
        return frais;
    }

    //Setters
    public void setFrais(int frais){
        this.frais=frais;
    }

    @Override
    public void depot(float mt){
        solde+=mt-frais;
    }

    public void retrait(float mt){
        sodle-=mt+frais;
    }

    public void virement(float mt){

    }
}