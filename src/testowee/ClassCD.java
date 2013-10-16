package testowee;

public class ClassCD {
    private String title;
    private double price;
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public String getInfo() {
        return title + " " + price;
    }
    @Override
    public String toString() {
        String nl = System.getProperty("line.separator");
        return getClass().getSimpleName() + "title: " + title + nl + "price: " + price;
    }
}
