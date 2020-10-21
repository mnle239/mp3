package jenkins.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.jvnet.hudson.test.Issue;

public class IdFromFileNameTest {

    @Test
    public void testIdFromFile1() throws Exception {
    	IdStrategy.CaseSensitive id = new IdStrategy.CaseSensitive();
	String result = "";
        result = id.idFromFilename("$0070");
        assertTrue(result.equals("p"));
    }

    @Test
    public void testIdFromFile2() throws Exception {
        IdStrategy.CaseSensitive id = new IdStrategy.CaseSensitive();
        String result = "";
        result = id.idFromFilename("a$00");
        assertTrue(result.equals("a"));
    }

}
