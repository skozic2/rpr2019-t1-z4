package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] art=new Artikl[1000];
    int i=0;
    void dodajArtikl(Artikl ar) {
        if (i < 1000) {
            art[i] = ar;
            i = i + 1;
        }
    }
    Artikl izbaciArtiklSaKodom(String kod){
        int n=0;
        do{
            if((art[n].getKod()).equals(kod)){
                art[n]=null;
                i=i-1;
                break;
            }
                n++;
        }while(true);
        return art[n]; //sta vraca??
    }
    Artikl getArtikli(){ return art[0];}
}
