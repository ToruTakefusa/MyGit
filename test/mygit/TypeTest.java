package mygit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class TypeTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testToStringBlob() {
        Type type = new Type(new Blob());
        assertThat(type.toString(), is("blob"));
    }

    @Test
    public void testToStringNotBlob() {
        Object object = new Object();
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("obj is not legal argument. The object's type is " +
                object.getClass().getSimpleName());
        Type type = new Type(object);
    }
}