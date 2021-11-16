public class JavaRefreshMethods {
    public static void main(String[] args) {
        myMethod();
        sayHello("Alex");
        sayHello("Steve");
        sayHello("Dobby");
        
        sayHelloNameAndAge("Alex", 24);
        sayHelloNameAndAge("Steve", 22);
        sayHelloNameAndAge("Dobby", 12);
        // OverLoading Methods - multiple methods with the same name but different parameters
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        // Resursion method
        int result = sum(10);
        System.out.println(result);
    }

    private static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
          } else {
            return 0;
          }
    }

    private static void myMethod() {
        System.out.println("Executed My Method");
    }

    static void sayHello(String fname) {
        System.out.println("Hello " + fname);
    }

    static void sayHelloNameAndAge(String fname, int age) {
        System.out.println("Hello " + fname + ". You are " + age);
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }
      
    static double plusMethod(double x, double y) {
        return x + y;
    }

    
}
