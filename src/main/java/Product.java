public class Product {
    //data members
    private String name;
    private static Double price;
    private String category;
    private static int quantity;
    private char size;
    private String author;
    private String color;

    //constructors
    public Product(String name, Double price, String category, int quantity, char size, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }

    public Product(String name, Double price, String category, int quantity, String author) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
    }

    public Product(String name, Double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        Product.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //methods
    public static boolean buy(){
        int quant = getQuantity();
        if ( quant > 0){
            quant--;
            return true;
        } else
            return false;
    }


    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", size=" + size +
                ", author='" + author + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
