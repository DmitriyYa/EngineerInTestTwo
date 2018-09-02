import org.junit.Assert;
import org.junit.Test;

public class TestUtil {

    @Test
    public void testInDataIsTrue(){
        Assert.assertTrue(Util.inDataIsTrue("собака"));
        Assert.assertTrue(Util.inDataIsTrue("колбаса"));
    }

    @Test
    public void testInDataIsFalse(){
        Assert.assertFalse(Util.inDataIsTrue("qwe"));
    }
}
