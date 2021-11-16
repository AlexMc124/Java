public class Person {
    int age;
    String name;
    String address;

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    //getter age method
    public int getAge() {
        return age;
    }

    //setter age method
    public void setAge(int age) {
        this.age = age;
    }

    //getter name method
    public String getName() {
        return name;
    }

    //setter name method
    public void setName(String name) {
        this.name = name;
    }

    //getter address method
    public String getAddress() {
        return address;
    }

    //setter address method
    public void setAddress(String address) {
        this.address = address;
    }

    //toString method
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(20, "John", "USA");
        System.out.println(person);
        
        Person person1 = new Person(20, "John", "USA");
        Person person2 = new Person(30, "Alex", "UK");
        Person person3 = new Person(40, "Mike", "Canada");

        //method to print all the details of the person
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

    }
}
