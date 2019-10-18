package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] art=new Artikl[50];
    int i=0;
    boolean dodajArtikl(Artikl ar){
        if(i<50){
            art[i]=ar;
            i=i+1;
            return true;
        }
        return false;
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
       return art[0]; //sta vraca??
    }
    Artikl getArtikli(){ return art[0];    }   //??
    int dajUkupnuCijenuArtikala(){
        int sum=0;
        for(int n=0; n<i; n++) sum=sum+art[n].getCijena();
        return sum;
    }
}
