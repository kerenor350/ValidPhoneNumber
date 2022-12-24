import java.util.Scanner;

public class ValidPhoneNumber {
    // עומר ברכה , קרינה קיריאנוב, מתן , אילאי ,יוחאי , קרן אור לבוביץ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println(checkTheNumber(phoneNumber));
    }

    public static String checkTheNumber(String phoneNumber) {
        String finalNum = "";
        if (phoneNumber.length() == 10) {
            String beginNum = phoneNumber.substring(0, 2); //"05"
            if (!beginNum.equals("05")) {
                return finalNum;
            }

            for (int i = 0; i < phoneNumber.length(); i++) {
                char currentChar = phoneNumber.charAt(i);
                if (!Character.isDigit(currentChar)) {
                    return "";
                }
            }

            finalNum =  phoneNumber.substring(0, 3)+ "-" + phoneNumber.substring(3);
            return finalNum;

        } else if (phoneNumber.length() == 11) {
            String beginNum = phoneNumber.substring(0, 2); //"05"
            if (!beginNum.equals("05")) {
                return finalNum;
            }
            if (!(phoneNumber.charAt(3) == '-')) {
                return finalNum;
            }
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (i != 3) {
                    char currentChar = phoneNumber.charAt(i);
                    if (!Character.isDigit(currentChar)) {
                        return finalNum;
                    }
                }
            }
            return phoneNumber;

        } else if (phoneNumber.length() == 12) {
            String beginNum = phoneNumber.substring(0, 4);//9725
            if (!beginNum.equals("9725")) {
                return finalNum;
            }
            for (int i = 0; i < phoneNumber.length(); i++) {
                char currentChar = phoneNumber.charAt(i);
                if (!Character.isDigit(currentChar)) {
                    return finalNum;
                }
            }
            String restNum = phoneNumber.substring(3);
            String start = "05";
            String num = start + restNum;
            finalNum = num.substring(0, 3) + "-" + num.substring(3);
            return finalNum;
        }
        return finalNum;

    }
}