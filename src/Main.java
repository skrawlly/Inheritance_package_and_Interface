import animals.Animal;
import animals.AnimalBehavior;

import animals.AnimalName;
import birds.Bird;
import birds.Pigeon;
import fishes.Blowfish;
import fishes.Fish;
import mammals.Dog;
import mammals.Mammal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

System.out.println("**************************");
System.out.println("Welcome to Animal kingdom");
System.out.println("**************************");



Fish fish = new Fish("dori",12,12.3,"red and white");
Mammal mammal= new Mammal("tiger",8,55.3,"2nd order");
Bird bird = new Bird("passarinho",2,4.3,"black and brown");

Blowfish blowfish= new Blowfish("blowziin",2,23.2,"red",21);
Pigeon pigeon=new Pigeon("passarim",12,12.4,"red","rabjunn");
Dog dog=new Dog("dogin",3,20 ,"second line","german sheaperd");

System.out.println(dog);
    System.out.println("**************************");

Animal[] animalss={mammal,bird,pigeon,blowfish,fish};
for( Animal animal:animalss){
    animal.eat();
}
    System.out.println("**************************");
    Animal[] animalsArray={mammal,fish,bird,dog,blowfish,pigeon};

    for(Animal a:animalsArray){
        a.move();
    }
    System.out.println("**************************");
    for (Animal a:animalsArray){
        AnimalName.name(a.getName());}

    System.out.println("**************************");

    AnimalBehavior behavior[]={dog,blowfish,pigeon};
    for (AnimalBehavior ab:behavior){
                ab.sleep();

    }







}
