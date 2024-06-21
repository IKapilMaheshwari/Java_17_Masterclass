/*
Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.



EXAMPLES OF INPUT/OUTPUT:

printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"

printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"

printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"



TIPS:

Be extra careful about spaces in the printed message.

Use the remainder operator

1 hour = 60 minutes

1 day = 24 hours

1 year = 365 days

NOTES

The printYearsAndDays method needs to be defined as public static ​like we have been doing so far in the course.

Do not add main method to solution code.

The solution will not be accepted if there are extra spaces



  
All changes saved
|
Line 11, Column 2
Test Cases
Failed: 0, Passed: 14 of 14 tests
Evaluate.testGroupedNestedTestClasses
Evaluate$A_MethodDeclarationTest.declarations
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Evaluate$PrintYearsDaysParamsTest.printYearsAndDaysParams
Your code passed this test
Coding Exercise*/
public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
            return;
        }
        long YY = minutes/60/24/365;
        long ZZ = (minutes/60/24)%365;
        System.out.println(minutes + " min = " + YY + " y and "+ ZZ +" d");
    }
}