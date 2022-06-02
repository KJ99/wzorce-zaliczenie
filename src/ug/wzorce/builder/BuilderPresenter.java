package ug.wzorce.builder;

public class BuilderPresenter {
    public void present() {
        System.out.println("2. Budowniczy");

        PlayerBuilder builder = new MP4PlayerBuilder();
        builder.setName("Video Mp4");
        builder.setSource("file:///video");
        builder.setQuality(121);

        Player player = builder.build();
        System.out.println(player);

        builder = new QuickTimePlayerBuilder();
        builder.setName("Video Quick Time");
        builder.setSource("file:///video");
        builder.setQuality(121);

        player = builder.build();
        System.out.println(player);
    }
}
