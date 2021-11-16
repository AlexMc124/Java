public class Main {
    int x = 5;
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);

        Person person = new Person(20, "John", "USA");
        System.out.println(person);


        // Polymorphism
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        // Inner and Outer Classes 
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        // Abstraction 
        AbstractPig myAbstractPig = new AbstractPig(); // Create an Abstract Pig object
        myAbstractPig.animalSound();
        myAbstractPig.sleep();
      }

    
}