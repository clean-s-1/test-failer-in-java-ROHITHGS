import java.util.List;

public class ColorWirePairPrinter {

    public void printColorWirePair(List<ColorWirePair> colorWirePairList) {
        colorWirePairList.forEach( colorWirePair -> System.out.printf("%d    | %s   | %s\n",
                colorWirePair.getWirePair(),colorWirePair.getMajorColor(),colorWirePair.getMinorColor()  ));
    }
}
