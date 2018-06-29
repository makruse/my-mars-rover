package directions;

public enum Direction {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private String abbreviation;

    Direction(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String toString() {
        return abbreviation;
    }
}

