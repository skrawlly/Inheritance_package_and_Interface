package fishes;
import animals.Animal;
import animals.AnimalMove;


public class Fish extends Animal implements AnimalMove {


    String scaleColor;

    public Fish(){}
    public Fish(String name, int age, double weight, String scaleColor) {

        super(name, age, weight);
        this.setScaleColor(scaleColor);}

    public Fish(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void  eat(){
        System.out.println(" the fish is Eating");
    }

    @Override
    public void getVoice(){
        System.out.println(" the fish is speaking");
    }

    public String getScaleColor() {
        return scaleColor;
    }
    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }



    @Override
    public String toString(){
        return "the name of the animal is "+this.getName()+" and age is "+this.getAge()+" weighting "+getWeight()+"g of scalecolor  "+this.getScaleColor();
    }


    public void move(){
        System.out.println("The "+getClass().getSimpleName()+" is Moving");
    }
}
