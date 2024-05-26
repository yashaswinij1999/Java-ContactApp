
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;
import java.nio.file.Paths;
import java.util.Date;

public final class Logger {

    private static Logger l = null;
    static int count = 0;

    private Logger() {

    }

    public static Logger getInstance() {

        if (l == null) {
            l = new Logger();
            count++;
        }
        System.out.println("no of times logger created is " + count + " no of times");
        return l;

    }

    public void log(String data) {

        // getting current directory
        String currentDirectory = Paths.get("").toAbsolutePath().toString();
        Date dt = new Date();

        new Thread(new Runnable() {

            BufferedWriter bw = null;

            @Override
            public void run() {

                try {
                    bw = new BufferedWriter(new FileWriter(currentDirectory + "/log.txt", true));
                    String str = data + ":" + dt;
                    bw.write(str);
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
        ).start();

    }

}
