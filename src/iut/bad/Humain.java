package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return nom + " " + prenom + " a " + age + " ans.";
    }

    public void details() {
        System.out.println(this.toString());
    }

}

