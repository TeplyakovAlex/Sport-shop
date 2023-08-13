package Sport_Shop;

public class BlueTshorts extends Tshort {
@Override
    public Coloring coloring () {return  new Blue();}

    @Override
    public float price() {
        return 180.5f;
    }
}
