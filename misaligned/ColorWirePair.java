public class ColorWirePair {

    private Integer wirePair;
    private String majorColor;
    private String minorColor;

    public Integer getWirePair() {
        return wirePair;
    }

    public void setWirePair(Integer wirePair) {
        this.wirePair = wirePair;
    }

    public String getMajorColor() {
        return majorColor;
    }

    public void setMajorColor(String majorColor) {
        this.majorColor = majorColor;
    }

    public String getMinorColor() {
        return minorColor;
    }

    public void setMinorColor(String minorColor) {
        this.minorColor = minorColor;
    }

    public ColorWirePair(Integer wirePair, String majorColor, String minorColor) {
        this.wirePair = wirePair;
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }
}
