import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.*;
/**
 * Created by hemanth on 15/03/2016.
 */
public class ParsersCSV {
    public static void main(String[] args) throws IOException {
        String file = "/Users/hemanth/Documents/Cloudwick/Parsers/src/data.csv";
        String k= parserscsv(file);
    }
    public static String parserscsv(String filename){
        try {
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records;
            records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {
                String Name = record.get(0);
                String email = record.get(1);
                System.out.println("[Name= " + Name + " , email=" + email + "]");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {}

        System.out.println("Done");
        return filename;
    }

}
