package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getKod() {
        Artikl a=new Artikl("kafa",7,"1");
        assertEquals("1",a.getKod());
    }

    @Test
    void getCijena() {
        Artikl a=new Artikl("kafa",7,"1");
        assertEquals(7,a.getCijena());
    }

    @Test
    void getNaziv() {
        Artikl a=new Artikl("kafa",7,"1");
        assertEquals("kafa",a.getNaziv());
    }
}