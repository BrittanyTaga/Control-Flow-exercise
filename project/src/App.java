import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //calling the methods
        printNumbers();
        printLowerCase();
        printUpperCase(); 
        
        //getting the name
        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        String userEnteredName = scan.nextLine();
        System.out.println("Hello " + userEnteredName);
        
        //entering a string
        System.out.println("Enter a string: ");
        String someString = scan.next();
        
        //loop
        System.out.println("Do you wish to continue to the interactive portion?");
        String promptYOrN = scan.nextLine();
        



        //restarting the game
        while(Continue){
        switch (promptYOrN) {
        case "yes":
        case "y":
            System.out.println("What is the name of your favorite pet?");
            String petName = scan.nextLine();
            System.out.println("What is the age of your favorite pet?");
            int petAge = scan.nextInt();
            System.out.println("What is your lucky number?");
            int luckyNum = scan.nextInt();
            System.out.println(
                "What is your favorite quarterback's jersey number? If you do not care what's your favorite number?");
            int jerseyNum = scan.nextInt();
            System.out.println("What is two-digit model year of your car?");
            int modelYear = scan.nextInt();
            System.out.println("What is the first name of your favorite actor or actress? ");
            String actorName = scan.nextLine();
            System.out.println("Enter a random number between 1 and 50.");
            int randomNum = scan.nextInt();
            
        Random random = new Random();
        int random1 = random.nextInt(100);
        int random2 = random.nextInt(100);
        int random3 = random.nextInt(100);
        
        //creating magic ball
        int magicBall = jerseyNum*jerseyNum;
        if(magicBall>75){
            magicBall = magicBall - 75;
        }else{
            magicBall = magicBall;
        }

        int charThree = (int) petName.charAt(2);
        if(charThree>75){
            charThree = charThree - 75;
        }else{
            charThree = charThree;
        }

        int carNum = modelYear + luckyNum;
        int sub = randomNum - random2;

        int act = (int) actorName.charAt(0);
        int last = (int) actorName.charAt(actorName.length());
        int ye = 42;

            System.out.println("Lottery Numbers" + charThree + ", " + carNum + ", " + 
            sub + ", " + act + ", " + last + "Magic Ball: " + magicBall);
            break;
        default:
            System.out.println("Program quitting. Please return later to complete the survey.");
            break;
        }
        scan.close();
        
    }
}

    public static void printNumbers()
    {
      // TODO: print valid numeric input
      for(int i = 48; i <= 57; i++){

        System.out.println(i);

      }
    }
  
    public static void printLowerCase()
    {
      // TODO: print valid lowercase alphabetic input
      for(int i = 97; i <= 122; i++){
          System.out.println(i);
      }
    }
  
    public static void printUpperCase()
    {
      // TODO: print valid uppercase alphabetic input
      for(int i = 65; i <= 90; i++){
          System.out.println(i);
      }
    }

   


}
