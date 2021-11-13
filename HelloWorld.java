import java.util.List;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        String comment = "This is a comment";
        System.out.println(comment);
        // Single Line Comment 
        /* Multi Line Comment */

        // Variables follow this syntax: type variableName = value;
        // Here is an example of variable types 
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        long myLong = 15000000000L;
        String myText = "Hello";
        System.out.printf("myNum: %s\nmyFloatNum: %s\nmyLetter: %s\nmyBool: %s\nmyText: %s\nmyLong: %s", myNum, myFloatNum, myLetter, myBool, myText, myLong);


        // many variables can be declared at same time if they are same type 
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);  // prints 56
        // You can also use the type inference to declare variables 
        int a, b, c;
        a = 5;
        b = 6;
        c = 50; 
        System.out.println(a + b + c);

        /* Java Operators
        + Addition
        - Subtraction
        * Multiplication
        / Division
        % Modulus
        ++ Increment
        -- Decrement

        Assignment Operators
        Operator	Example	    Same As	
        =	        x = 5	    x = 5	
        +=	        x += 3	    x = x + 3	
        -=	        x -= 3	    x = x - 3	
        *=	        x *= 3	    x = x * 3	
        /=	        x /= 3	    x = x / 3	
        %=	        x %= 3	    x = x % 3	
        &=	        x &= 3	    x = x & 3	
        |=	        x |= 3	    x = x | 3	
        ^=	        x ^= 3	    x = x ^ 3	
        >>=	x       >>= 3	    x = x >> 3	
        <<=	x       <<= 3	    x = x << 3	


        Comparison Operators                
        Operator    Name                        Example
        ==	        Equal to	                x == y	
        !=	        Not equal	                x != y	
        >	        Greater than	            x > y	
        <	        Less than	                x < y	
        >=	        Greater than or equal to	x >= y	
        <=	        Less than or equal to	    x <= y


        Logical Operators
        Operator	Name			Description													Example	
        && 			Logical and		Returns true if both statements are true					x < 5 &&  x < 10	
        || 			Logical or		Returns true if one of the statements is true				x < 5 || x < 4	
        !			Logical not		Reverse the result, returns false if the result is true		!(x < 5 && x < 10)
        */

        // Strings 
        String myString = "Hello";
        System.out.println(myString);
        // find the length of myString
        System.out.println(myString.length());
        // find the index of the letter 'e'
        System.out.println(myString.indexOf('e'));
        // Print myString in all uppercase
        System.out.println(myString.toUpperCase());
        // Print myString in all lowercase
        System.out.println(myString.toLowerCase());
        String myName = "Alex";
        // concatenate myString and myName
        System.out.println(myString + " " + myName);
        // concatenate myString and myName
        System.out.println(myString.concat(myName));
        /* Special Characters in Strings 
        Code	Result	
        \n	    New Line	
        \r	    Carriage Return	
        \t	    Tab	
        \b	    Backspace	
        \f	    Form Feed */

        // Maths 
        a = 5;
        b = 6;
        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-5));
        System.out.println(Math.random());
        System.out.println(Math.round(5.5));
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.floor(5.5));
        // generate a random number between 0 and 100 and assign it to a variable
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
    }
}

