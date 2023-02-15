
// import java.util.Scanner;
import java.util.ArrayList;

// Trainingsschema //
class Trainingsschema {
    private String klant;
    private String trainer;
    private ArrayList<Oefening> oefeningen = new ArrayList<>();

    // Constructors *#* Chaining on line 18 *#*
    public Trainingsschema(String klant) {
        this.klant = klant;
    }

    public Trainingsschema(String klant, String trainer) {
        this(klant);
        this.trainer = trainer;
    }
// Private void in Java is a keyword that is used in a method declaration to specify that the method is accessible only within the declared class 
// and not from any other class. This is an access modifier that can be applied to methods, variables, and constructors, 
// making them only accessible within the declared class.

    private void printOefening(String naam, String spierGroep, Integer aantalSets, Integer herhalingen,
            Integer rustTijd) {
        System.out.println("Oefening voor " + spierGroep + ":" +
                " herhaal " + aantalSets + " keer " +
                "(rust tussendoor " + rustTijd + " seconden) " +
                herhalingen +
                " " + naam);
    }

    // This method adds a certain exercise to the ArrayList
    public void voegOefeningToe(Oefening oefening) {
        oefeningen.add(oefening);
    }

    public void printSchema()
    {
        System.out.println("Schema: " + klant);

        if (trainer != null) // Als de klant geen trainer heeft...
        {
            System.out.println("Trainer: " + this.trainer);
        }

        for (int i = 0; i < this.oefeningen.size(); i++) {
            this.printOefening(this.oefeningen.get(i).getNaam(), this.oefeningen.get(i).getSpierGroep(),
                    this.oefeningen.get(i).getAantalSets(), this.oefeningen.get(i).getHerhalingen(),
                    this.oefeningen.get(i).getRustTijd());

        // De for loop zorgt ervoor dat elk object in de array, een printOefening print.
        // This.[positie in array, wordt naam van oefening].getterfunctie
        }
    }
}

// Oefening //
class Oefening {

    // private variables
    private String naam;
    private String spierGroep;
    private int aantalSets;
    private int herhalingen;
    private int rustTijd;

    public Oefening(String naam, String spierGroep, int aantalSets, int herhalingen, int rustTijd) {
        this.naam = naam;
        this.spierGroep = spierGroep;
        this.aantalSets = aantalSets;
        this.herhalingen = herhalingen;
        this.rustTijd = rustTijd;
    }

    // Getters
    public String getNaam() {
        return this.naam;
    }

    public String getSpierGroep() {
        return this.spierGroep;
    }

    public int getAantalSets() {
        return this.aantalSets;
    }

    public int getHerhalingen() {
        return this.herhalingen;
    }

    public int getRustTijd() {
        return this.rustTijd;
    }
}

// Main //
public class Main {
    public static void main(String[] args)
	{
        // Oefeningen Arnold Schwarzenegger en Kim Kardashian
        Oefening pushUps = new Oefening("Push-ups", "Armen", 3, 3, 30);
        Oefening sitUps = new Oefening("Sit-ups", "Buik", 3, 4, 30);
        Oefening squats = new Oefening("Squats", "Benen", 2, 5, 30);
        Oefening superMans = new Oefening("Supermans", "Rug", 3, 3, 15);
        Oefening chestDips = new Oefening("Chest-dips", "Borst", 3, 3, 30); 

        // Nieuw schema Arnold Schwarzenegger
        Trainingsschema ArnoldSchwarzenegger = new Trainingsschema("Arnold Schwarzenegger");

        // Gevulde schema Arnold Schwarzenegger
        ArnoldSchwarzenegger.voegOefeningToe(pushUps);
        ArnoldSchwarzenegger.voegOefeningToe(sitUps);
        ArnoldSchwarzenegger.voegOefeningToe(squats);
        ArnoldSchwarzenegger.voegOefeningToe(superMans);
        ArnoldSchwarzenegger.voegOefeningToe(chestDips);

        // Print schema Arnold Schwarzenegger
        ArnoldSchwarzenegger.printSchema();
        System.out.println(""); //LET OP witregel!

        
        // Nieuw schema Kim Kardashian
        Trainingsschema KimKardashian = new Trainingsschema("Kim Kardashian", "Daphne Jongejans");

        // Gevulde schema Kim Kardashian
        KimKardashian.voegOefeningToe(sitUps);
        KimKardashian.voegOefeningToe(superMans);

        // Print schema Kim Kardashian
        KimKardashian.printSchema();


	}
}