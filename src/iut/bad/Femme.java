package iut.bad;

public class Femme extends Humain {
    private String nom;
    private String prenom;
    private int age;

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    
    public static void main(String[] args) {
        Homme h = new Homme("Rakoto", "Jean", 30);
        Femme f = new Femme("Rasoa", "Marie", 28);

        h.ami(f);
    }

}
