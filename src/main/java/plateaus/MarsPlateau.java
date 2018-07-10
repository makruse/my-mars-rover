package plateaus;

public class MarsPlateau {

    private final int upperX;
    private final int upperY;

    private final int lowerX = 0;
    private final int lowerY = 0;

    private MarsPlateau(int upperX, int upperY) {
        this.upperX = upperX;
        this.upperY = upperY;
    }

    //make it singleton? --> thread-safety?
    public static MarsPlateau getPlateau(int upperX, int upperY) {
        return new MarsPlateau(upperX, upperY);
    }

    //check boundaries
}



