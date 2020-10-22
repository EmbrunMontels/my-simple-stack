package deqo.emon.mysimplestack;

public class Item {
    private int valeur;
    private String name;

    public Item(int valeur, String name) {
        this.name = name;
        if (valeur >=0){
            this.valeur = valeur;
        }
        else{
            System.out.println("valeur négative interdite, initialisation par défaut à 0");
            this.valeur = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
