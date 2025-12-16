public class Main {
    public static void main(String[] args) {
        // Polymorphism: Referansımız 'Shape', nesnemiz 'Circle' veya 'Rectangle'
        Shape shape1 = new Circle("Kırmızı", 5.0);
        Shape shape2 = new Rectangle("Mavi", 4.0, 6.0);

        System.out.println("--- Geometrik Hesaplayıcı ---");

        // Daire İşlemleri
        shape1.showColor();
        // %.2f ifadesi virgülden sonra 2 basamak göster demek
        System.out.printf("Daire Alanı: %.2f \n\n", shape1.calculateArea());

        // Dikdörtgen İşlemleri
        shape2.showColor();
        System.out.println("Dikdörtgen Alanı: " + shape2.calculateArea());
    }
}