package Sport_Shop;

public abstract class Tshort implements Item {
    @Override
    public String name() {
        return "T-shorts";
    }
    @Override
    public String company () {
        return "Active sports";
    }

    @Override
    public abstract float price();
}
