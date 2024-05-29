
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactAppModel {

    String currentDirectory = Paths.get("").toAbsolutePath().toString();
    File f = new File(currentDirectory);

    public boolean checkIfFileNameExists(String filename) {

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

    public boolean checkFileExists(String fileName) {

        String fname = fileName + ".txt";

        if (f.isDirectory()) {

            File[] files = f.listFiles();

            for (File file : files) {

                if (file.getName().endsWith(".txt")) {

                    if (file.getName().equals(fname)) {
                        return true;
                    }

                }

            }

        }
        return false;

    }

    public void addContact(ContactBean bean, String fileName) {

        if (f.isDirectory()) {

            File[] files = f.listFiles();
            BufferedWriter bw = null;

            for (File file : files) {

                if (file.getName().equals(fileName + ".txt")) {

                    try {

                        bw = new BufferedWriter(new FileWriter(file, true));
                        bw.write(bean.toString());
                        bw.newLine();

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

    public boolean editContacts(String fileName, String existingWord, String newWord) {

        String line = "";
        ArrayList<String> l = new ArrayList();

        if (f.isDirectory()) {

            File[] files = f.listFiles();
            BufferedReader br = null;
            BufferedWriter bw = null;

            for (File file : files) {

                if (file.getName().endsWith(".txt") && file.getName().equals(fileName + ".txt")) {

                    try {

                        br = new BufferedReader(new FileReader(file));

                        while ((line = br.readLine()) != null) {

                            if (line.contains(existingWord)) {
                                line = line.replace(existingWord, newWord);
                                l.add(line);

                            } else {
                                l.add(line);
                            }

                        }
                        br.close();
                        bw = new BufferedWriter(new FileWriter(file));

                        for (String s : l) {
                            bw.write(s);
                            bw.newLine();

                        }
                        return true;

                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    } finally {

                        try {

                            if (br != null) {
                                br.close();
                            }

                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }
                        try {

                            if (bw != null) {
                                bw.close();
                            }

                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }

                    }

                }

            }

        }
        return false;

    }

    public void listFiles() {

        if (f.isDirectory()) {

            File[] files = f.listFiles();

            for (File file : files) {

                if (file.getName().endsWith(".txt") && !file.getName().equals("log.txt")) {

                    System.out.println(file.getName());

                }

            }

        }

    }

    public void listContacts(String fileName) {

        String line = "";
        if (f.isDirectory()) {

            File[] files = f.listFiles();
            LineNumberReader ln = null;

            for (File file : files) {

                if (file.getName().equals(fileName + ".txt")) {

                    try {
                        ln = new LineNumberReader(new BufferedReader(new FileReader(file)));

                        while ((line = ln.readLine()) != null) {
                            int number = ln.getLineNumber();
                            System.out.println(number + " " + line);

                        }

                    } catch (Exception e) {

                        // TODO: handle exception
                        e.printStackTrace();

                    } finally {

                        try {

                            if (ln != null) {
                                ln.close();
                            }

                        } catch (Exception e) {

                            // TODO: handle exception
                            e.printStackTrace();

                        }

                    }

                }

            }

        }

    }

    public boolean deleteLine(String fileName, String name) {

        String line = "";
        List<String> l = new ArrayList<String>();

        if (f.isDirectory()) {

            File[] files = f.listFiles();
            BufferedReader br = null;
            BufferedWriter bw = null;

            for (File file : files) {

                if (file.getName().equals(fileName + ".txt")) {

                    try {
                        br = new BufferedReader(new FileReader(file));

                        while ((line = br.readLine()) != null) {

                            if (line.contains(name)) {
                                line = line.replaceAll(line, "");
                                l.add(line);
                            } else {
                                l.add(line);
                            }

                        }

                        br.close();
                        bw = new BufferedWriter(new FileWriter(file));
                        for (String s : l) {
                            bw.write(s);
                            bw.newLine();
                        }
                        return true;

                    } catch (Exception e) {

                        // TODO: handle exception
                        e.printStackTrace();

                    } finally {

                        try {

                            if (br != null) {
                                br.close();
                            }

                        } catch (Exception e) {

                            // TODO: handle exception
                            e.printStackTrace();
                        }
                        try {

                            if (bw != null) {
                                bw.close();
                            }

                        } catch (Exception e) {

                            // TODO: handle exception
                            e.printStackTrace();
                        }

                    }

                }

            }

        }
        return false;

    }

    public boolean searchContact(String filename, String name) {

        String line = "";

        if (f.isDirectory()) {

            File[] files = f.listFiles();

            BufferedReader br = null;

            for (File file : files) {

                if (file.getName().endsWith(".txt") && file.getName().equals(filename + ".txt")) {

                    try {
                        br = new BufferedReader(new FileReader(file));

                        while ((line = br.readLine()) != null) {

                            if (line.contains(name)) {
                                return true;
                            }
                        }

                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    } finally {

                        try {

                            if (br != null) {
                                br.close();
                            }

                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }

                    }

                }

            }

        }
        return false;
    }

}

class Test {

    public static void main(String[] args) {

        ContactAppModel m = new ContactAppModel();
        m.searchContact("yashu", "pali");

    }

}
