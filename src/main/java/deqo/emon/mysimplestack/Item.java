package deqo.emon.mysimplestack;

public class Item {
    private int valeur;

    public Item(int valeur) {
        if (valeur >=0){
            this.valeur = valeur;
        }
        else{
            System.out.println("valeur négative interdite, initialisation par défaut à 0");
            this.valeur = 0;
        }
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
