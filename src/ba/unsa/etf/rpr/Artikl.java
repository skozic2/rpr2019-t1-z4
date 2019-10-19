package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;
    Artikl(String ime, int cij, String k){
        naziv=ime;
        cijena=cij;
        kod=k;
    }
    String getKod(){ return this.kod; }
    int getCijena(){ return this.cijena; }
    String getNaziv(){ return this.naziv; }

    }
