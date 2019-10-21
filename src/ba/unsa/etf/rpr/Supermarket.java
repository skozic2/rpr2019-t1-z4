package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] art=null;
    private static int i=0;
    Supermarket(){
        art=new Artikl[1000];
    }
    boolean dodajArtikl(Artikl ar) {
        if (i < 1000) {
            this.art[i] = new Artikl(ar.getNaziv(), ar.getCijena(), ar.getKod());
            i = i + 1;
            return true;
        }
        return false;
    }
    Artikl izbaciArtiklSaKodom(String kod){
        int n=1;
        Artikl pom=null;
        do{
            if((this.art[n].getKod()).equals(kod)){
                pom=this.art[n];
                for(int f=n; f<i-1; f++){
                    this.art[f]=this.art[f+1];
                }
                i=i-1;
                return pom;
            }
                n++;
        }while(n<=i);
        return pom;
    }
    Artikl[] getArtikli(){ return this.art;}

    public static int getI() {
        return i;
    }
}
