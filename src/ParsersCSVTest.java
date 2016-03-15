/**
 * Created by hemanth on 15/03/2016.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
public class ParsersCSVTest {
    @Test
    public void testInput(){
        ParsersCSV parser = new ParsersCSV();
        String fileName = "/Users/hemanth/Documents/Cloudwick/Parsers/src/data.csv";
        String test = parser.parserscsv(fileName);
        assertNotNull(test);
    }

    @Test
    public void testFormat(){
        String fileName = "/Users/hemanth/Documents/Cloudwick/Parsers/src/data.csv";
        ParsersCSV parser = new ParsersCSV();
        String str = parser.parserscsv(fileName);
        assertEquals(fileName, str);

    }

    
}