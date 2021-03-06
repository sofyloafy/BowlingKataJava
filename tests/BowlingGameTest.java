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

    void setRolls(int frames, int pins){
        for (int i = 0; i < frames; i++){
            bowling.roll(pins);
        }
    }

    void set2Rolls(int frames, int pin1, int pin2){
        for (int i = 0; i < frames; i++){
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

    @Test
    public void OnesBonusTest(){
        setRolls(10, 1);
        bowling.roll(10);
        setRolls(8,1);
        assertEquals(30, bowling.score());
    }

    @Test
    public void FullBonusTest(){
        setRolls(12, 10);
        assertEquals(300, bowling.score());
    }

    @Test
    public void FullHalfBonusTest1(){
        set2Rolls(10, 3, 7);
        bowling.roll(10);
        assertEquals(137, bowling.score());
    }

    @Test
    public void RealTest() {
        int[] rolls = {0,10,5,5,3,2,10,10,3,7,7,1,4,2,9,1,8,2,5};
        setArrayRolls(rolls);
        assertEquals(140, bowling.score());
    }
}

