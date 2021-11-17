// Interface
interface InterfaceAnimal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
  }
  
  // Pig "implements" the Animal interface
  class InterfacePig implements InterfaceAnimal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
  }