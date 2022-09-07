public class Property {


    final private int width;
    final private int length;
    final private int price;

    public Property(int width, int length, int price) {
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Property{" +
                "width=" + width +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
