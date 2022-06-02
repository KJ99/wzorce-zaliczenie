package ug.wzorce.builder;

public class QuickTimePlayerBuilder extends PlayerBuilder {
    @Override
    public Player build() {
        return new QuickTimePlayer(this.name, this.source, this.quality);
    }
}
