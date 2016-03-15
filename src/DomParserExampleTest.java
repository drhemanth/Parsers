/**
 * Created by hemanth on 15/03/2016.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParserExampleTest {
    @Test
    public void Parser01() throws IOException, SAXException, ParserConfigurationException {
        DomParserExample f= new DomParserExample();
        String file = f.parsers("/Users/hemanth/Documents/Cloudwick/Parsers/src/data.xml");
        //assertEquals(1,result);
        assertNotNull(file);
    }
    @Test
    public void Parser02() throws IOException, SAXException, ParserConfigurationException {
        String givenfile = "/Users/hemanth/Documents/Cloudwick/Parsers/src/data.xml";
        DomParserExample f= new DomParserExample();
        String file = f.parsers(givenfile);
        assertEquals(givenfile,file);
    }

}
