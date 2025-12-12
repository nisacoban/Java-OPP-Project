public class SatilikEv extends Ev{
    public SatilikEv(int metrekare){
        super.metrekare=metrekare;
    }
    public int getFiyat(){
        return metrekare*500;
    }
}