package animals;
import animals.AnimalMove;

public  abstract class Animal implements AnimalMove {

    /// Each class is a separate file in one package.The animals.Animal class has name, age, and weight fields, and eat() and
    /// getVoice() abstract methods.

    private  String  name;
    private int age;
    private double weight;

    public Animal() {}

    public Animal(String name, int age, double weight) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);}


    public Animal(String name)
    {this.name=name;}

   public abstract void  eat();
   public  abstract void  getVoice();

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }
     public void setAge(int age) {
         this.age = age;
     }
     public double getWeight() {
         return weight;
     }
     public void setWeight(double weight) {
         this.weight = weight;
     }



    public void move(){
        System.out.println("The animal is Moving");
    }
}
