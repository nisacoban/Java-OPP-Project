//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KiralikEv kiralikEv=new KiralikEv(200);
        SatilikEv satilikEv=new SatilikEv(400);
        System.out.println("Kiralik ev"+kiralikEv.getFiyat());
        System.out.println("Satilik ev"+satilikEv.getFiyat());
    }
}