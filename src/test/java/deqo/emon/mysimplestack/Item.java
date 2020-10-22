package deqo.emon.mysimplestack;

public class Item {
    private int valeur;

    @Override
    public String toString() {
        return "Item{" +
                "valeur=" + valeur +
                '}';
    }

    public Item(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
