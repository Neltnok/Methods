// Create a program that allows users to select from one of four options of shapes that they would like
// to get the area for. Accept the input from the user, and provide the results.

// Create 4 separate methods, and call the method based on the menu choice.
// (Suggested approach, menu - switch case calling the method)
// To find the area of plane shapes look at the tutorial here: http://www.mathsisfun.com/area.html

// Pseudo code in source
// create a menu for the user to select 1 of 4 geometric objects
// based on the selection query the user for the necessary attributes to calculate the area of the selected object
// calculate the area and display the results.



package com.company;

import java.util.Scanner;

public class Main {

    // create an object of type scanner

    static  Scanner scanner = new Scanner(System.in);

// method: circleArea
// requirements: Query the user to enter the diameter of the circle in inches
// results: Calculates the area of a circle based on the user input and display
// the results to the user

private static void circleArea(){
    // create an integer variable to hold the diameter of the circle
    double diameter = 0;
    // create a double variable to hold the answer
    double area;


    // query the user for the diameter of the circle in inches
    System.out.print("Enter the diameter of the circle in inches ");

    // get the users input
    diameter = scanner.nextDouble();

    // calculate the area of the circle
    area = diameter/2 * diameter/2 * Math.PI;

    // display the result to the user
    System.out.println("A circle of diameter " + diameter + " has an area of " + area + " square inches" );

}
//*****************************************************************************

// method: squareArea
// requirements: Query the user to enter the length of one side of the square in inches
// results:  Calculates the area of the square based on the user input an display
// the results to the user

private static void squareArea() {

    // create an integer variable to hold the user input for one side of the square
    double side = 0;
    // create an integer variable to hold the result
    double result = 0;

    // query the user to enter the length of one side of the square in inches
    System.out.print("Enter the length of one side of the square in inches ");

    // get the users input
    side = scanner.nextDouble();

    // calculate the area
    result = side * side;
    // display the result
    System.out.println("A square having a side of " + side + " inches has an area of " + result + " square inches");

}
//******************************************************************************


// method: rightTriangleArea
// requirements: Query the user to enter the base and height of the right triangle in inches
// results: Calculates the area of the right triangle based on the user input and display
// the results to the user
private static void rightTriangleArea(){

    // declare variables for the base, height and result
    double  base = 0;
    double  height = 0;
    double  result = 0;

    // query the user for the length of the base in inches
    System.out.print("Please enter the length of the base of the triangle in inches ");
    base = scanner.nextDouble();

    // query the user for the height of the triangle in inches
    System.out.print("Please enter the length of the height of the triangle in inches ");
    height = scanner.nextDouble();

    // calculate the result
    result = 0.5 * base * height;

    System.out.println("A triangle of base " + base + "inches and a height of " + height + " inches has an area" +
            " of " + result + " square inches");


}

//********************************************************************************

// method: equilateralTriangleArea
// requirements: Query the user to enter the length of one side of the triangle in inches
// Query the user to enter the height of the triangle in inches
// results: Calculates the area of the equilateral triangle having the attributes entered and
// display the results to the user.

private static void equilateralTriangleArea() {

    // create variables to hold the user input and result
    double side;
    double result;

    // query the user to enter the length of one side of the triangle in inches
    System.out.print("Enter the length of one side of the triangle in inches ");
    side = scanner.nextDouble();

    // calculate the result
    result = (Math.sqrt(3.0)/4) * side * side;

    System.out.println("An equilateral triangle having sides of " + side + "inches is " + result + " square inches");

}

//***********************************************************************************




    public static void main(String[] args) {


    int userSelection = 0;
    Scanner scanin = new Scanner(System.in);

    // Query the user to select a geometric shape for the area
        System.out.println("Please select one of the following for area calculation");
        System.out.println("1 .. Square Object");
        System.out.println("2 .. Circle Object");
        System.out.println("3 .. Right Triangle Object");
        System.out.println("4 .. Equilateral Triangle Object");

        // get the users selection
        userSelection = scanin.nextInt();



        // parse the user selection to call the equivalent method to calculate the area of the
        // selected object

        switch(userSelection) {
            case    1:
                squareArea();
                break;

            case   2:
                circleArea();
                break;

            case   3:
                rightTriangleArea();
                break;

            case  4:
                equilateralTriangleArea();
                break;

// need the default to catch user input other than 1 .. 4
            default:
                System.out.println("You must choose 1, 2, 3 or 4");
                System.out.println("Please rerun the program to try again");
                break;
        }



    }
}
