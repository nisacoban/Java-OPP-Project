public class KiralikEv extends Ev{
    public KiralikEv(int metrekare) {
        super.metrekare=metrekare;
    }
    public int getFiyat(){
        return metrekare*50;
    }
}