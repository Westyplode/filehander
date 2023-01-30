import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Database {

    private String filename;
    private int rowWidth;

    public Database(String filename, int rowWidth) {
        this.filename = filename;
        this.rowWidth = rowWidth;
    }

    // add a new record to the end of the database
    public void appendRecord(String data) {
        // TODO: Pad the data to the correct record width
        // TODO: Report an error if the data is too long for the record
        FileHandler.appendLine(filename, data);
    }

    // delete the record at the specified row
    public void deleteRecord(int rowNumber) {
        // TODO: replace this placeholder code
    }

    // return the record at the specified row
    public String getRecord(int rowNumber) {
        return ""; // TODO: replace this placeholder code
    }

    // return the number of records in the database
    public int getRecordCount(String fileName) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                System.out.println(line);
                count = count + 1;
                return count;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // search for a record matching data
    // return true if found
    public boolean findRecord(String data) {
        return false; // TODO: replace this placeholder code
    }

}
