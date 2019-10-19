package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] art=null;
    private static int el=0;
    Korpa(){
        art=new Artikl[50];
    }
    boolean dodajArtikl(Artikl ar){
        if(el<50){
            this.art[el]=new Artikl(ar.getNaziv(),ar.getCijena(),ar.getKod());
            el=el+1;
            return true;
        }
        return false;
    }
    Artikl izbaciArtiklSaKodom(String kod){
        int n=0;
        Artikl pom=null;
        do{
            if((this.art[n].getKod()).equals(kod)){
                pom=this.art[n];
                for(int f=n; f<el-1; f++){
                    this.art[f]=this.art[f+1];
                }
                el=el-1;
                return pom;
            }
                n++;
        }while(n<el);
       return pom;
    }
    Artikl[] getArtikli(){ return this.art;    }
    int dajUkupnuCijenuArtikala(){
        int sum=0;
        for(int n=0; n<el; n++) sum=sum+art[n].getCijena();
        return sum;
    }
}
