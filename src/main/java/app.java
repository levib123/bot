import java.util.Scanner;
public class app {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Hello what would you like to do today?");
       String response = input.nextLine();
       Bot gameRoom = new Bot();
       Bot therapist = new Bot();
       if(response.equals("Twenty")) {
           gameRoom.twentyQuestions();
       }

       else if(response.equals("Therapy")) {
           therapist.therapyBot();
       }



    }
}



