
public class Util {

    public static void menu(int number) {
        System.out.println("..................................");
        System.out.println("............." + number + "................");
        System.out.println("..................................");
    }

    public static boolean validate(String fileName) {
        if (fileName == null || fileName.equals("")) {
            return false;
        }
        if (!Character.isLetter(fileName.charAt(0))) {
            return false;
        }
        if (fileName.trim().equals("")) {
            return false;
        }
        if (fileName.split(" ").length > 1) {
            return false;
        }

        for (int i = 0; i < fileName.length(); i++) {

            if (!Character.isDigit(fileName.charAt(i)) || !Character.isLetter(fileName.charAt(i))) {
                return false;
            }

        }
        return true;
    }

}

class TestUtil {

    public static void main(String[] args) {

        Util.validate("");

    }

}
