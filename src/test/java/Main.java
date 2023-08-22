import org.junit.*;

public class Main {
    @Test
    public void testA1() {
        System.out.println("vienas batas");
    }
    @Before
    public void testA2() {
        System.out.println("du batai");
    }
    @After
    public void testA3(){
        System.out.println("trys batai");
    }
    @BeforeClass
        public static void testA4(){
        System.out.println("keturi batai");
        }
        @AfterClass
            public static void testA5(){

            System.out.println("penki batai"); }
}
