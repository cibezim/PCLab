package pclab;

class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return width + "x" + height;
    }
}