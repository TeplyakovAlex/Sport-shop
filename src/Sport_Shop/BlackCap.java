package Sport_Shop;

public class BlackCap extends Cap {
@Override
    public Coloring coloring () {return  new Black();}

    @Override
    public float price() {
        return 50.5f;
    }
}
