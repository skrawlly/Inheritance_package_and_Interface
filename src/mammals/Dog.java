package mammals;
import animals.AnimalBehavior;
import animals.AnimalMove;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {

    String breed;
    public Dog(){}

    public Dog(String name, int age, double weight, String order, String breed) {

        super(name, age, weight, order);
        this.setBreed(breed);}

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat()
    {
        System.out.println("dog is eating ");

    }

    @Override
    public void getVoice()
    {
        System.out.println("dog speak");
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString(){
        return "the name of the animal is "+this.getName()+" and age is "+this.getAge()+" weighting "+getWeight()+"kg  of order "+this.getOrder()+" where the breed is "+this.getBreed();
    }

    @Override
    public void sleep()
    {
        System.out.println("dog is sleeping ");
    }

    @Override
    public void move(){
        System.out.println("The dog is running");
    }

}
