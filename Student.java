import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        /*Details include:
         * student names
         * student id noa
         * student email
         */

        String[] studentDetails = new String[3];

        System.out.println("Enter your: \nFull names.\nID No.\nSchool Email");
        
        //Read User Input
        int i = 0;
        for( i = 0; i < studentDetails.length; i++) {
            String detail = myObj.nextLine();

            if (detail.equalsIgnoreCase("exit")) {
                break;
            }
            else {
                studentDetails[i] = detail;
            }
        }

        //Display UserInput
        System.out.println("\nStudent Details: ");
        for (String s: studentDetails){
            System.out.println(s);
        }
}
}
