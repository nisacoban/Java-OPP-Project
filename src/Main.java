import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını girin: ");
        int n= reader.nextInt();
        int[] dizi=new int[n];
        int [] fr = new int[n];//dizideki elemanların frekanlarını depolamak için
        for (int i=0;i< dizi.length;i++) {
            System.out.print((i + 1) + ". elemanını girin: ");
            dizi[i] = reader.nextInt();
        }
        int kontrol = -1;//tekrar aynı elemanın sayılmaması için

        for(int i = 0; i < dizi.length; i++){//diziden öğe seçmek için
            int sayac = 1;
            for(int j = i+1; j < dizi.length; j++){//dizinin geri kalanı ile karşılaştırmak için
                if(dizi[i] == dizi[j]){
                    sayac++;
                    fr[j] = kontrol;//i elemanını değil ondan sonraki elemanı -1 e eşitliyor
                    //bu sayede i değeri -1 eşitlenmiyor ve ekrana yazdırılıyor
                }
            }
            if(fr[i] != kontrol)
                fr[i] = sayac;
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != kontrol)
                System.out.println(dizi[i] + " elemanı-frekansı " + fr[i]);
        }
    }
}