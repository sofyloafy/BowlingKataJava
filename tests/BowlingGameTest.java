import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    public BowlingGameTest(){
    }
    Bowling bowling;

    @BeforeClass
    public static void setUpClass(){

    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Before
    public void setUp(){
        bowling = new Bowling();
    }

    @After
    public void tearDown(){
    }

    @Test
    public void NullTest(){
        bowling.roll(0);
        assertEquals(0, bowling.score());
    }
}
