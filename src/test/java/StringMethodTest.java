import org.junit.Test;
import org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class StringMethodTest {

    @Test
    public void split() throws Exception{
        String str = "010-1234-5678";
        String[] splitStr = str.split("-");
        assertThat(splitStr[0],is("010"));
        assertThat(splitStr[1],is("1234"));
        assertThat(splitStr[2],is("5678"));
    }

    @Test
    public void compareTo() throws Exception{
        String str = "abcde";
        assertThat(str.compareTo("aaaaaaaa"), is(8));
    }
}
