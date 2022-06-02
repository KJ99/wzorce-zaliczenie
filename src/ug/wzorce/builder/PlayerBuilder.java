package ug.wzorce.builder;

public abstract class PlayerBuilder {
    protected String name;
    protected String source;
    protected double quality;

    public void setName(String name) {
        this.name = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public abstract Player build();
}
