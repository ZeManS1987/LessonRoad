import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();
        printAnswer(s);
    }
        public static void printAnswer(String s) {
            String answer;
            switch (s) {
                case "Hi":

                    answer = "Hello";
                    break;

                case "Bye":
                    answer = "Good bye";
                    break;

                case "How are you":
                    answer = "How are your doing";
                    break;

                default:
                    answer = "Unknown message";
            }
            log(answer);
        }

    public static void log(String messege){
        System.out.println(messege);
    }
}





