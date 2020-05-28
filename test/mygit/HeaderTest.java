package mygit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class HeaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testToStringNotBlobType() {
        Header header = new Header(new Object(), "");
        header.toString();
    }

    @Test
    public void testToStringContent0() {
        Header header = new Header(new Blob(), "");
        assertThat(header.toString(), is("blob 0¥0"));
    }

    @Test
    public void testToString() {
        Header header = new Header(new Blob(), "abcde");
        assertThat(header.toString(), is("blob 5¥0"));
    }
}