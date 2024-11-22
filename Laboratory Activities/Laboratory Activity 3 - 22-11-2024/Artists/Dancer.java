enum DanceStyle {
    BALLET,
    HIPHOP,
    JAZZ,
    CONTEMPORARY
}

public class Dancer extends Artist {
    private DanceStyle style;

    public Dancer(String name, String nationality, int age, String specialty, DanceStyle style) {
        super(name, nationality, age, specialty);
        this.style = style;
    }

    public DanceStyle getStyle() {
        return style;
    }

    public void setStyle(DanceStyle style) {
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dancer's Info: ");
        super.displayInfo();
        System.out.println("Dance Style: " + style);
    }
}
