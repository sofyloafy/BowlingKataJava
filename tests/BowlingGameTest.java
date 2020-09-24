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

    void setRolls(int n, int pin){
        for (int i = 0; i < n; i++){
            bowling.roll(pin);
        }
    }

    void set2Rolls(int n, int pin1, int pin2){
        for (int i = 0; i < n; i++){
            bowling.roll(pin1);
            bowling.roll(pin2);
        }
    }

    void setArrayRolls(int[] n) {
        for (int i = 0; i < n.length; i++){
            bowling.roll(n[i]);
        }
    }

    @Test
    public void OnesTest() {
        setRolls(20, 1);
        assertEquals(20, bowling.score());
    }

//    @Test
//    public void OnesBonusTest(){
//        setRolls(10, 1);
//        bowling.roll(10);
//        setRolls(8,1);
//        assertEquals(30, bowling.score());
//    }
}
