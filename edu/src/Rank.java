public enum Rank {
    A("秀"),
    B("優"),
    C("良"),
    D("可"),
    F("不可");

    private String japanese;

    public String getJapanese() {
        return japanese;
    }

    Rank(String japanese) {
        this.japanese = japanese;
    }
}
