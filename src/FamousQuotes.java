import java.util.Scanner;

//public class Main {
    /* WITHOUT TRY/CATCH:
       public static void main(String[] args){

       String[] famousQuotes = new String[10];
       famousQuotes[0] = "I think, therefore I am. (Rene Descartes)";
       famousQuotes[1] = "I may disagree with what you say, but I will defend to death your right to say it. (Evelyn Beatrice Hall)";
       famousQuotes[2] = "Ignorance is bliss.";
       famousQuotes[3] = "A masterpiece is born a masterpiece. (Hyouka)";
       famousQuotes[4] = "Small things make perfection, but perfection is no small thing. (Sir Henry Royce)";
       famousQuotes[5] = "History will be kind to me, for I intend to write it. (Winston Churchill)";
       famousQuotes[6] = "I'm about as intimidating as a butterfly. Dan Howell";
       famousQuotes[7] = "The lampshade on my head is for my bright ideas. I won't be able to convey them until Monday, when my curtain gets out of the dry cleaners  Bauvard, Some Inspiration for the Overenthusiastic";
       famousQuotes[8] = "Act first, explain later. Dan Brown, Digital Fortress ";
       famousQuotes[9] = "People do what they hate for money and use the money to do what they love.";

           Scanner scanner = new Scanner(System.in);
           System.out.print("Select a quote number (1-10): ");
           int userInput = scanner.nextInt();
           scanner.nextLine();

           System.out.println(famousQuotes[userInput - 1]);

           scanner.close();

       }
   }
   /*

     */
    public static class FamousQuotes {
        public static void main(String[] args) {
        String[] quotes = new String[10];
            quotes[0] = "I think, therefore I am. (Rene Descartes)";
            quotes[1] = "I may disagree with what you say, but I will defend to death your right to say it. (Evelyn Beatrice Hall)";
            quotes[2] = "Ignorance is bliss.";
            quotes[3] = "A masterpiece is born a masterpiece. (Hyouka)";
            quotes[4] = "Small things make perfection, but perfection is no small thing. (Sir Henry Royce)";
            quotes[5] = "History will be kind to me, for I intend to write it. (Winston Churchill)";
            quotes[6] = "I'm about as intimidating as a butterfly. Dan Howell";
            quotes[7] = "The lampshade on my head is for my bright ideas. I won't be able to convey them until Monday, when my curtain gets out of the dry cleaners  Bauvard, Some Inspiration for the Overenthusiastic";
            quotes[8] = "Act first, explain later. Dan Brown, Digital Fortress ";
            quotes[9] = "People do what they hate for money and use the money to do what they love.";

            Scanner scanner = new Scanner(System.in);

            System.out.print("Select a quote number (1-10): ");

            try {
                int choice = scanner.nextInt();
                System.out.println(quotes[choice -1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid quote number, Please enter a number between 1-10.");
            }

            scanner.close();

        }



