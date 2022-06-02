package ug.wzorce.builder;

public class QuickTimePlayer extends Player {
    public QuickTimePlayer(String name, String source, double quality) {
        super(name, source, quality, "video/quicktime");
    }
}
