public abstract class Pyramdie {
    private int hohe;
    public Pyramdie(int hohe) {
        this.hohe = hohe;
    }
    public abstract float calc_volumen();
    public int getHohe() {
        return hohe;
    }
}
