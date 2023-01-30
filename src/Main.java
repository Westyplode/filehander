import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter file name");
        String fileName = input.nextLine();
       // Scanner input2 = new Scanner(System.in);
      //  System.out.println("enter name to add to file");
      //  String text = input.nextLine();
     //   Scanner input3 = new Scanner(System.in);
       // System.out.println("append(true) or overwrite(false)();");
       // String temp = input.nextLine();
       // boolean append = Boolean.parseBoolean(temp);
      // FileHandler.writeToFile(fileName, text , true);
        //String line = FileHandler.readLineFromFile(fileName, 5);
        //System.out.println(line);

        System.out.println("Database");
        Database db = new Database("test.txt", 10);
        //System.out.println();
        db.appendRecord("1.ABCDEFGH");
        db.appendRecord("2.ABCDEFGH");
        db.appendRecord("3.ABCDEFGH");
        db.appendRecord("4.ABCDEFGH");
        System.out.println(db.getRecord(2));	 // should be "3.ABCDEFGH"
        System.out.println(db.findRecord("EBCDEFGHIJ")); // false
        System.out.println(db.findRecord("3.ABCDEFGH")); // true
        System.out.println("count = " + db.getRecordCount(fileName)); // 4

    }

}
