package mammals;
import animals.Animal;
import animals.AnimalMove;


public class Mammal extends Animal implements AnimalMove {


    private String order;

    public Mammal() {}

   public Mammal( String name, int age, double weight, String order) {
       super(name, age, weight);
       this.setOrder(order);}

    public Mammal(String order) {
        this.order = order;}



    @Override
   public void eat(){
        System.out.println("The mammal is Eating");
    }

    @Override
    public void getVoice(){
        System.out.println("speaking");
    }


    public String getOrder() {
       return order;
    }
    public void setOrder(String order) {
       this.order = order;
    }



    @Override
    public String toString(){
        return "the name of the animal is "+this.getName()+" and age is "+this.getAge()+" weighting "+getWeight()+"g of order "+this.getOrder();
    }


    public void move(){
        System.out.println("The "+getClass().getSimpleName()+" is Moving");
    }


}
