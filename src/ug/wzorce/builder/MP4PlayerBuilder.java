package ug.wzorce.builder;

public class MP4PlayerBuilder extends PlayerBuilder {
    @Override
    public Player build() {
        return new Mp4Player(this.name, this.source, this.quality);
    }
}
