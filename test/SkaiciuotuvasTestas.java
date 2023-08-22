import org.junit.*;

public class SkaiciuotuvasTestas {
    @Test
    public void testSudetis(){
        Skaiciuotuvas s = new Skaiciuotuvas();

        Assert.assertEquals("Testuoju skaiciuotuvo sudeti", 15, s.suma(10,5));
    }

}
