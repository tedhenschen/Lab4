/*
Lab 4
Partners: Ted Henschen and Mengying Yu
Date: 9/20/2020
*/


import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    //Create new random object called r
    Random r = new Random();

    //Create a variable named RanomNum  to store the random number
    int randomNum = r.nextInt(50) + 1;

    //print out the randomly generated number
    System.out.println("The Random number is: " + randomNum);

    //Count down from the random number to 0 and print number each time
    for (int count = randomNum; count>=0; count--){
      System.out.println(count);
    }

    //Determine the response outputs
    if (randomNum<25){
       System.out.println("Ahoy Mateys!");
    }
    else if (randomNum>25 && randomNum<42){
      System.out.println("Cannonball!");
    }
    else {
      System.out.println("Blast Off!");
    }


  }
}