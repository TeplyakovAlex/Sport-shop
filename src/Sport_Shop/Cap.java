package Sport_Shop;

public abstract class Cap implements Item {
    @Override
    public String name() {
        return "Cap";
    }
    @Override
    public String company () {
        return "Smart caps";
    }

    @Override
    public abstract float price();
}
