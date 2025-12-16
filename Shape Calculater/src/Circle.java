// 2. ALT SINIF - DAİRE (CIRCLE)
class Circle extends Shape {
    double radius; // Yarıçap

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Dairenin alanı: Pi * r * r
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}