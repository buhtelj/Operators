package com.virtualprojectslab;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;

        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;

        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;

        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result %  3; //remainder - ostanek dobimo s %

        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;

        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2; //result = result + 2
        System.out.println("Result is now " + result);

        result *= 10; //result = result * 10
        System.out.println("Result is now " + result);

        result -= 10; //result = result - 10
        System.out.println("Result is now " + result);

        result /= 10; //result = result / 10
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of theere tests is true");

        int newvalue = 50;
        if (newvalue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false; //assign value to wasCar if iscar == true return true, otherwise return false
        if(wasCar)
        System.out.println("wasCar is true");

        double mySmallTestDouble = 20d;
        double myBigTestDouble = 80;
        double myTestresult = (mySmallTestDouble + myBigTestDouble) * 25;
        System.out.println(myTestresult);
        double myTestReminder = myTestresult % 40;
        System.out.println(myTestReminder);

        if(myTestReminder <= 20)
            System.out.println("Total was over the limit");

        // goto java operator precedence table page


        /*

        ==
        !=
        >
        <
        >=
        <=
        && and
        || or
        ?:      Ternary (shorthand for if-then-else statement)
        */


    }
}
