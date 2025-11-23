package fishes;
import animals.AnimalBehavior;
import animals.AnimalMove;

public class Blowfish extends Fish implements AnimalBehavior , AnimalMove {

   private int diameter;

   public Blowfish() {}
    public Blowfish(String name, int age, double weight, String scaleColor, int diameter) {

        super(name, age, weight, scaleColor);
        this.setDiameter(diameter);

    }
    public Blowfish(int diameter) {
       this.diameter = diameter;
    }

    @Override
    public void eat()
    {
        System.out.println("the Blowfish is  eating ");
    }

    @Override
    public void getVoice()
    {
        System.out.println("Blowfish speak");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString(){
        return "the name of the animal is "+this.getName()+" and age is "+this.getAge()+" weighting "+getWeight()+" g of diameter "+this.getDiameter();
    }


    @Override
    public void sleep()
    {
        System.out.println("blowfish is sleeping ");
    }


    @Override
    public void move(){
        System.out.println("The blowfish is swimming");
    }
}
