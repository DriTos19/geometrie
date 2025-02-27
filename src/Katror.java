public class Katror  extends Pyramdie {
    private float baseLength;

    public Katror(int hohe, float baseLength) {
        super(hohe);
        this.baseLength = baseLength;
    }

    @Override
    public float calc_volumen() {
        return (1.0f / 3) * (baseLength * baseLength) * getHohe();
    }

    public float getBaseLength() {
        return baseLength;
    }
}
