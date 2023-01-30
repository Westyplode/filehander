import java.io.*;
import java.util.Arrays;

public class FileHandler {
    public static void readFromFile(String fileName) {
        // read and print out the contents of a text file
        // using all the exception handling best practices

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String readLineFromFile(String fileName, int lineNumber) {
        // read and print out the contents of a text file
        // then picks line number and reads it
        String line = null;
        try  {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            int lineNum = lineNumber;
            for (int i=0; i<lineNum; i++){
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
    public static void writeToFile(String fileName, String text, boolean append) {
        // write text to fileName, overwriting (append = false) or appending (append = true)
        try (
                FileWriter fw = new FileWriter(fileName, append);
                PrintWriter pw = new PrintWriter(fw)
        ) {
            pw.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static char randomRead (String fileName, int startPos) {
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")){
            rf.seek(startPos);
            char letter = (char)rf.read();
            return letter;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public static void appendLine(String fileName, String data) {
        // write text to end of the file
        boolean append = true;
        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(data);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readLineAt(String fileName, int start) {
        // grab the line from position "start" in the file
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(start);
            return rf.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void writeLineAt(String fileName, String data, int start) {
        // overwrite a line from position "start" in the file
        // doesn't check that the start position is actually
        // the beginning of the file. This will not behave well
        // unless every line is the same length
    }

    public static int countLines(String fileName) {
        // return the number of lines in the file
        return 0;
    }



}
