package animals;

public interface AnimalName {



  /*  Contains one static method:
    name(String name)
    In your loop, you will call it like:
            AnimalName.name(animal.getName());*/

    static void name(String name)
    {
        System.out.println("The animal name is :"+name);

    }



}
