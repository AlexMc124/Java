import java.util.List;

class JavaRefresh {
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

        // If Statements
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }  
        // short hand if statement
        // variable = (condition) ? expressionTrue :  expressionFalse;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // Switch Statements
        /* switch(expression) {
                case x:
                    // code block
                    break;
                case y:
                    // code block
                    break;
                default:
                    // code block
                } 
        */
        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }
        // Outputs "Thursday" (day 4)

        // While Loops 
        // while (condition) {
        //     // code block to be executed
        //   }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Loop Finished!\n");
        // do while loops
        // do {
        //     // code block to be executed
        //   } while (condition);
        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        } while (i2 < 5);
        System.out.println("Do While Loop Finished!\n");

        // for loops
        // for (statement 1; statement 2; statement 3) {
        //     // code block to be executed
        // }

        for (int i3 = 0; i3 < 5; i3++) {
             System.out.println(i3);
        }
        System.out.println("For Loop Done!\n");
        // For-Each Loop
        // There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        // for (type variableName : arrayName) {
        //   // code block to be executed
        // }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i4 : cars) {
            System.out.println(i4);
        }
        System.out.println("For-Each Loop Done!\n");
        

        // Break statements 
        int i5 = 0;
        while (i5 < 10) {
            System.out.println(i5);
            i5++;
            if (i5 == 4) {
                break; // this will stop the loop when i5 reaches 4
            }
        }
        System.out.println("Break Statement Finished\n");
        // Continue Example
        int i6 = 0;
        while (i6 < 10) {
          if (i6 == 4) {
            i6++;
            continue;
          }
          System.out.println(i6);
          i6++;
        }
        System.out.println("Continue Statement Finished\n");
        
        // Arrays 
        // Syntax 
        // String[] cars2; // make an array variable
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"}; // add variables of defined data type to it
        int[] myNums = {10, 20, 30, 40};
        System.out.println(cars2[0]);
        System.out.println(myNums[3]);
        // update 
        cars2[0] = "Opel";
        System.out.println(cars2[0]);
        // length 
        System.out.println(cars.length + "\n");
        // loop over array 
        // For loop 
        for (int j = 0; j < cars.length; j++) {
            System.out.println(cars[j]);
        }
        // For each 
        for (String j : cars) {
            System.out.println(j);
        }
        // Multidimentional Arrays 
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int e = myNumbers[1][2];
        System.out.println(e);
        for (int w = 0; w < myNumbers.length; ++w) {
            for(int j = 0; j < myNumbers[w].length; ++j) {
              System.out.println(myNumbers[w][j]);
            }
          }
    }
}

