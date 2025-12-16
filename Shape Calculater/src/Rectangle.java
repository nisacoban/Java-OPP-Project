// 3. ALT SINIF - DİKDÖRTGEN (RECTANGLE)
class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Dikdörtgenin alanı: En * Boy
    @Override
    double calculateArea() {
        return width * height;
    }
}
