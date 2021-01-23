public class Text_new {
    public enum Style {
        BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
    };

    // 어떤 Set을 넘겨도 되나, EnumSet이 가장 좋다.
    public void applyStyles(Set<Style> styles){...}

    // text.applyStyles(EnumSet.of(Style.BOLD, Sytle.ITALIC));
}
