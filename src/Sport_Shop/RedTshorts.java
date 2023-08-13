package Sport_Shop;

public class RedTshorts extends Tshort {
@Override
    public Coloring coloring () {return  new Red();}

    @Override
    public float price() {
        return 90.5f;
    }
}
