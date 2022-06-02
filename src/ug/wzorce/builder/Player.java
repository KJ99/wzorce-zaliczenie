package ug.wzorce.builder;

public abstract class Player {
    protected final String name;
    protected final String source;
    protected final double quality;
    protected final String type;

    public Player(String name, String source, double quality, String type) {
        this.name = name;
        this.source = source;
        this.quality = quality;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public double getQuality() {
        return quality;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "" + getClass().getName() + "{" +
                "name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", quality=" + quality +
                ", type='" + type + '\'' +
                '}';
    }
}
