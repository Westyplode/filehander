import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayListFile {
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
}
