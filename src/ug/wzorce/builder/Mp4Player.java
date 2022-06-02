package ug.wzorce.builder;

public class Mp4Player extends Player{
    public Mp4Player(String name, String source, double quality) {
        super(name, source, quality, "video/mp4");
    }
}
