package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Korpa k=null;
    @BeforeEach
    void setUo(){
        k=new Korpa();
    }
    @Test
    void dodajArtikl() {
        Artikl a=new Artikl("biciklo",1000,"1");
        assertEquals(true,k.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        k.dodajArtikl(new Artikl("ff",132, "4"));
        k.dodajArtikl(new Artikl("aa",123, "3"));
        k.dodajArtikl(new Artikl("oo",32,"5"));
        k.izbaciArtiklSaKodom("4");
        assertEquals(2, k.getI());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        k.dodajArtikl(new Artikl("ff",132, "4"));
        k.dodajArtikl(new Artikl("aa",123, "3"));
        k.dodajArtikl(new Artikl("oo",32,"5"));
        assertEquals(287,k.dajUkupnuCijenuArtikala());
    }
}