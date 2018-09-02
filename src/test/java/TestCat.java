import org.junit.Assert;
import org.junit.Test;

public class TestCat {

    private final Cat cat = new Cat();

    @Test
    public void testCatActionSausageFull(){
        cat.setState(State.full.toString());
        Assert.assertEquals(cat.action("колбаса"),1);
    }

    @Test
    public void testCatActionSausageHungry(){
        cat.setState(State.hungry.toString());
        Assert.assertEquals(cat.action("колбаса"),2);
    }

    @Test
    public void testCatActionDogFull(){
        cat.setState(State.full.toString());
        Assert.assertEquals(cat.action("собака"),3);
    }

    @Test
    public void testCatActionDogHungry(){
        cat.setState(State.hungry.toString());
        Assert.assertEquals(cat.action("собака"),4);
    }

    @Test
    public void testCatAction(){
        Assert.assertEquals(cat.action(" "),0);
    }
}
