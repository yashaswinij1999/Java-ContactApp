
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;

public class ContactAppModel {

    String currentDirectory = Paths.get("").toAbsolutePath().toString();

    public boolean checkIfFileNameExists(String filename) {

        File f = new File(currentDirectory);

        if (Util.validate(filename)) {

            if (f.isDirectory()) {

                File[] files = f.listFiles();
                BufferedWriter bw = null;

                for (File file : files) {

                    if (file.getName().equals(filename + ".txt")) {
                        System.out.println("file already exists");
                        return false;

                    } else {

                        try {
                            bw = new BufferedWriter(new FileWriter(filename + ".txt"));

                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                            e.getMessage();
                        } finally {

                            try {
                                if (bw != null) {
                                    bw.close();
                                }
                            } catch (Exception e) {
                                // TODO: handle exception
                                e.printStackTrace();
                                e.getMessage();
                            }

                        }

                    }

                }

            }

        }
        return true;

    }

    public void addContact(String name, String email, String phonenumber, String fileName) {

        
    

    }

}
