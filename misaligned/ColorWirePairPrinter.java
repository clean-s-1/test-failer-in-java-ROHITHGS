import java.util.List;

public class ColorWirePairPrinter {

    private static String formatedColorPair = null;

    public static String getFormatedColourPair() {
        return formatedColorPair;
    }

    public void printColorWirePair(List<ColorWirePair> colorWirePairList) {
        StringBuilder colorFormatter = new StringBuilder();
        colorWirePairList.forEach( colorWirePair -> colorFormatter.append(String.format("%d  | %s  | %s \n",
                colorWirePair.getWirePair(),colorWirePair.getMajorColor(),colorWirePair.getMinorColor())  ));
        formatedColorPair = colorFormatter.toString();
    }
}
