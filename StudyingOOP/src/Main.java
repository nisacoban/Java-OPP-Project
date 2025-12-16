//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Hayvan hayvan1=new Kedi();
        System.out.println(hayvan1.beslen());
        //hayvan1.miyav(); bu kod hata verir
        Hayvan hayvan2=new Kaplumbaga();
        Besle besle1=new Besle();
        besle1.besle(hayvan2);
         */
        Hayvan hayvan1 = new Hayvan();
        //Kedi kedi1=hayvan1 derleme zamanı hatası
        Kedi kedi1 = new Kedi();
        kedi1.miyav();
        if (hayvan1 instanceof Kedi){
            Kedi kedi = (Kedi)hayvan1;
        } else if (hayvan1 instanceof Kaplumbaga) {
            Kaplumbaga k1 = (Kaplumbaga)hayvan1;
        }
    }
}