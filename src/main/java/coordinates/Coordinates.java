package coordinates;

public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void increaseXByOne(){
        this.x += 1;
    }

    public void increaseYByOne() {
        this.y += 1;
    }

    public void decreaseXByOne() {
        this.x -= 1;
    }

    public void decreaseYByOne() {
        this.y -= 1;
    }
}

