package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Supermarket s=null;
    @BeforeEach
    void setUp() {
        s = new Supermarket();
    }

    @Test
    void testdodajArtikl() {
        Artikl a= new Artikl("test",32,"3");

        assertEquals(true, s.dodajArtikl(a));
    }

    @Test
    void testizbaciArtiklSaKodom() {
        s.dodajArtikl(new Artikl("ff",132, "4"));
        s.dodajArtikl(new Artikl("aa",123, "3"));
        s.dodajArtikl(new Artikl("oo",32,"5"));
        s.izbaciArtiklSaKodom("4");
        assertEquals(3, s.getI());


    }



   /* @Test
    void getArtikli() {
    }*/
}