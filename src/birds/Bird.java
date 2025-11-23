package birds;
import animals.Animal;
import animals.AnimalMove;

public class Bird extends Animal implements AnimalMove {

    String featherColor;
    public Bird(){};
    public Bird(String name, int age, double weight, String featherColor) {

        super(name, age, weight);
        this.setFeatherColor(featherColor);}

    public Bird(String featherColor) {
        this.featherColor = featherColor;}


    @Override
    public void eat(){
        System.out.println("the bird is Eating");
    }

    @Override
    public void getVoice(){
        System.out.println("speaking");
    }

    public String getFeatherColor() {
        return featherColor;
    }
    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString(){
        return "the name of the animal is "+this.getName()+" and age is "+this.getAge()+" weighting "+getWeight()+"g of feathercolor "+this.getFeatherColor();
    }


    public void move(){
        System.out.println("The "+getClass().getSimpleName()+" is Moving");
    }
}
