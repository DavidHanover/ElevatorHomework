/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElevatorHomework;

import java.util.Scanner;



/**
 *
 * @author DavidHanover
 */
public class ElevatorHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // initialize elevator floors as required by the assignment
        int Elev1 = 1;
        int Elev2 = 3;
        int Elev3 = 5;
        int Elev4 = 9;
        // two boolean variables used in checking whether the user entered a valid floor
         boolean validFloor;
         boolean validFloor1;
         
         //variable to be entered by the user telling what floor they are on
         int floor=0;
         // difference variables used in calculating the closest elevator to the user
         int difference1=0;
         int difference2=0;
         int difference3=0;
         int difference4=0;
         // variable to be entered by the user telling what floor they wish to go to
         int destination=0;
         //infinite loop to assure that none of the elevators reset and the 
         //question is asked to the user again
         while(true){
         //loop used to check whether the user inputs a valid starting floor
             do{
       
             // Create Scanner
            Scanner whichFloor = new Scanner(System.in);
            // Ask for input and what floor you are on
            System.out.print("What floor are you on?  ");
            // create variable "floor" that user inputs
             floor = whichFloor.nextInt();
            // determine that the user's input is a valid floor in the building
            if (floor < 1 || floor > 9){
                // if invalid, print error messages
                System.out.println("Impossible!  There are nine floors in this building!");
                System.out.println("Try again to recall which floor you are on.");
                // tell system that floor is invalid
                validFloor = false;
                // otherwise tell system the floor WAS valid 
            }else{validFloor = true;}
         // if floor selected was INVALID, then loop code and recieve new input     
        }while(validFloor == false);
        // sequence of if statemnts determining the distance of
        // every single elevator from the user's floor
         if (Elev1<floor){difference1=floor-Elev1;}
         if (Elev1>floor){difference1=Elev1-floor;}
         if (Elev1==floor){difference1=0;}
         
         if (Elev2<floor){difference2=floor-Elev2;}
         if (Elev2>floor){difference2=Elev2-floor;}
         if (Elev2==floor){difference2=0;}
         
         if (Elev3<floor){difference3=floor-Elev3;}
         if (Elev3>floor){difference3=Elev3-floor;}
         if (Elev3==floor){difference3=0;}
         
         if (Elev4<floor){difference4=floor-Elev4;}
         if (Elev4>floor){difference4=Elev4-floor;}
         if (Elev4==floor){difference4=0;}
         // series of calculations to find the shortest distance possible from
         //the user
         int differenceA = (Math.min(difference1, difference2));
         int differenceB = (Math.min(difference3, difference4));
         int differenceC = (Math.min(differenceA, differenceB));
         //infinite loop used just to be able to utilize break loops
         //so that the program stops as soon as it finds the first, closest
         //elevator
        while(true) {
            //if statement telling the program that if the shortest distance
            //is the same as the distance of elevator one, to choose that
            //elevator
         if (differenceC == difference1){
             //print statement informing the user that elevator one is coming
        System.out.println("Elevator One is coming for you. Currently on floor..."); 
        //if statements leading to for loops that print what floor the 
        //elevator is passing on
        if(floor>Elev1){for( ;floor>Elev1;Elev1++){System.out.println(Elev1);}}
        if(floor<Elev1){for( ;floor<Elev1;Elev1--){System.out.println(Elev1);}}
        if(floor==Elev1){System.out.println(Elev1);}
        //do while loop used to give the user infinite chances to input 
        //a valid destination floor
        //also; creates a scanner object and prompts the user the enter
        //their desired floor
        //and finally displays an error message if an invalid floor is chosen
        //all by utilizing the boolean value "validFloor1"
        
        do {Scanner Elev1WhereTo = new Scanner(System.in);
        System.out.print("Which floor are you going to?  ");
        destination = Elev1WhereTo.nextInt();
        if (destination < 1 || destination > 9){
            //error messages printed
        System.out.println("Impossible!  There are only nine floors in this building.");
        System.out.println("Try again to recall which floor you were headed to.");
        //user input is declared invalid
        validFloor1=false;}
        //if input is not invalid, it is declared valid
        else{validFloor1=true;}}
        //user is prompted again if the input was invalid
        while(validFloor1==false);
        //with valid input, elevator leaves.  system prints what floors are 
        //being passed
        System.out.println("On the way to floor " + destination + ". Currently at floor...");
        //if elevator is beneath destination, elevator climbs 
        if (destination>Elev1){for( ;destination>Elev1; Elev1++){System.out.println(Elev1);}}
        //if it is above destination, elvator drops
        if (destination<Elev1){for( ;destination<Elev1; Elev1--){System.out.println(Elev1);}}
        //when destination is reached, or if elevator is already there, doors open
        if (destination==Elev1){System.out.println("Elevator One's door opens on floor " + destination);}
        //break is inserted so that in the instance of two elevators being equidistant, 
        //loop doesn't repeat.  it only repeats once
        break;
        
            }
         //if the shortest distance was not elevator one, the same code repeats for elevator two
        if (differenceC == difference2){
        System.out.println("Elevator Two is coming for you. Currently on floor...");    
        if(floor>Elev2){for( ;floor>Elev2;Elev2++){System.out.println(Elev2);}}
        if(floor<Elev2){for( ;floor<Elev2;Elev2--){System.out.println(Elev2);}}
        if(floor==Elev2){System.out.println(Elev2);}
        do {Scanner Elev1WhereTo = new Scanner(System.in);
        System.out.print("Which floor are you going to?  ");
        destination = Elev1WhereTo.nextInt();
        if (destination < 1 || destination > 9){
        System.out.println("Impossible!  There are only nine floors in this building.");
        System.out.println("Try again to recall which floor you were headed to.");
        validFloor1=false;}
        else{validFloor1=true;}}
        while(validFloor1==false);
        System.out.println("On the way to floor " + destination + ". Currently at floor...");
        if (destination>Elev2){for( ;destination>Elev2; Elev2++){System.out.println(Elev2);}}
        if (destination<Elev2){for( ;destination<Elev2; Elev2--){System.out.println(Elev2);}}
        if (destination==Elev2){System.out.println("Elevator Two's door opens on floor " + destination);}
        
        break;
            }
        
        //same code repeats for elevator three, assuming two was not selected
        
        if (differenceC == difference3){
        System.out.println("Elevator Three is coming for you. Currently on floor...");    
        if(floor>Elev3){for( ;floor>Elev3;Elev3++){System.out.println(Elev3);}}
        if(floor<Elev3){for( ;floor<Elev3;Elev3--){System.out.println(Elev3);}}
        if(floor==Elev3){System.out.println(Elev3);}
        do {Scanner Elev1WhereTo = new Scanner(System.in);
        System.out.print("Which floor are you going to?  ");
        destination = Elev1WhereTo.nextInt();
        if (destination < 1 || destination > 9){
        System.out.println("Impossible!  There are only nine floors in this building.");
        System.out.println("Try again to recall which floor you were headed to.");
        validFloor1=false;}
        else{validFloor1=true;}}
        while(validFloor1==false);
        System.out.println("On the way to floor " + destination + ". Currently at floor...");
        if (destination>Elev3){for( ;destination>Elev3; Elev3++){System.out.println(Elev3);}}
        if (destination<Elev3){for( ;destination<Elev3; Elev3--){System.out.println(Elev3);}}
        if (destination==Elev3){System.out.println("Elevator Three's door opens on floor " + destination);}
        
        break;
            }
        
        //if non of the other elevators were selected, elevator four is selected
        //code explained above in elevator one block is repeated
        
        
        if (differenceC == difference4){
        System.out.println("Elevator Four is coming for you. Currently on floor...");    
        if(floor>Elev4){for( ;floor>Elev4;Elev4++){System.out.println(Elev4);}}
        if(floor<Elev4){for( ;floor<Elev4;Elev4--){System.out.println(Elev4);}}
        if(floor==Elev4){System.out.println(Elev4);}
        do {Scanner Elev1WhereTo = new Scanner(System.in);
        System.out.print("Which floor are you going to?  ");
        destination = Elev1WhereTo.nextInt();
        if (destination < 1 || destination > 9){
        System.out.println("Impossible!  There are only nine floors in this building.");
        System.out.println("Try again to recall which floor you were headed to.");
        validFloor1=false;}
        else{validFloor1=true;}}
        while(validFloor1==false);
        System.out.println("On the way to floor " + destination + ". Currently at floor...");
        if (destination>Elev4){for( ;destination>Elev4; Elev4++){System.out.println(Elev4);}}
        if (destination<Elev4){for( ;destination<Elev4; Elev4--){System.out.println(Elev4);}}
        if (destination==Elev4){System.out.println("Elevator Four's door opens on floor " + destination);}
        
        break;
            }
        }
        }
     }
        
                 
         
         
   
}
         
   
    

