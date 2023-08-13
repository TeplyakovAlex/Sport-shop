package Sport_Shop;

public class WhiteCap extends Cap {
@Override
    public Coloring coloring () {return  new White();}

    @Override
    public float price() {
        return 80.5f;
    }
}
