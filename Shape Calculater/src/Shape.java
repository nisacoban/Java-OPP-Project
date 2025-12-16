// 1. ABSTRACT CLASS (SOYUT SINIF)
// 'Shape' (Şekil) genel bir kavramdır. Tek başına bir şekil çizemezsin.
abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Soyut Metod: Gövdesi yok!
    // Alt sınıflara "Bunu hesaplamak ZORUNDASIN" diyoruz.
    abstract double calculateArea();

    // Normal Metod: Tüm şekiller rengini söyleyebilir.
    public void showColor() {
        System.out.println("Bu şeklin rengi: " + color);
    }
}