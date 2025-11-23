package birds;
import animals.AnimalBehavior;
import animals.AnimalMove;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    String species;

    public Pigeon() {}
    public Pigeon(String name, int age, double weight, String featherColor, String species) {

        super(name, age, weight, featherColor);
        this.setSpecies(species);}

    public Pigeon(String species) {
        this.species = species;
    }


    @Override
    public void eat()
    {
        System.out.println("the Pigeon is eating ");

    }

    @Override
    public void getVoice()
    {
        System.out.println("Pigeon speak");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString(){
        return "the name of the animal is "+this.getName()+" and age is "+this.getAge()+" weighting "+getWeight()+"g of specie "+this.getSpecies();
    }


    @Override
    public void sleep()
    {
        System.out.println("pigeon is sleeping ");
    }

    @Override
    public void move(){
        System.out.println("The pigeon is flying");
    }
}
