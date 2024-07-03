
public class Util {

    public static void menu(int number) {
        System.out.println("..................................");
        System.out.println("..........menu " + number + "................");
        System.out.println("..................................");
    }

    public static boolean validate(String fileName) {
        if (fileName == null || fileName.equals("")) {
            System.out.println("filename cannot be null");
            return false;
        }
        if (!Character.isLetter(fileName.charAt(0))) {
            System.out.println("filename cannot start with number");
            return false;
        }
        if (fileName.trim().equals("")) {
            System.out.println("filename cannot be empty string");
            return false;
        }
        if (fileName.split(" ").length > 1) {
            System.out.println("filename cannot contain two words");
            return false;
        }

        for (int i = 1; i < fileName.length(); i++) {

            char c = fileName.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                return false;
            }

        }
        return true;
    }

    public static boolean validateEmail(String email) {

        if (email == null || email.equals("")) {
            System.out.println("email cannot be null");
            return false;
        }

        if (email.trim().equals("")) {
            System.out.println("enter valid email");
            return false;
        }
        return true;
    }

    public static boolean validatePhonenumber(String phonenumber) {

        if (phonenumber == null || phonenumber.equals("")) {
            System.out.println("phonenumber cannot be null");
            return false;
        }

        if (phonenumber.trim().equals("")) {
            System.out.println("enter valid phonenumber");
            return false;
        }
        if (phonenumber.length() > 10 || phonenumber.length() < 10) {
            return false;
        }
        return true;
    }

}

class TestUtil {

    public static void main(String[] args) {

        System.out.println(Util.validate("rama"));

    }

}
