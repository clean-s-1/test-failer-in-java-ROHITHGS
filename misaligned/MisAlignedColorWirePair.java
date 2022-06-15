import java.util.List;

public class MisAlignedColorWirePair {

     public static final String WHITE="White";
     public static final String BROWN="Brown";

    public static void main(String[] args) {
        List<ColorWirePair> listColorWirePair = getColorWirePair();
        colorWirePairTest(listColorWirePair);
        ColorWirePairPrinter colorWirePairPrinter = new ColorWirePairPrinter();
        colorWirePairPrinter.printColorWirePair(listColorWirePair);
        int colorWirePairSet = listColorWirePair.size();
        assert (colorWirePairSet ==25);
        System.out.println("All is well (maybe!)");

    }

    private static void colorWirePairTest(final List<ColorWirePair> listColorWirePair){

        StringBuilder colorFormatter = new StringBuilder();

        listColorWirePair.forEach( colorWirePair -> colorFormatter.append(String.format("%d  | %s  | %s \n",
                colorWirePair.getWirePair(),colorWirePair.getMajorColor(),colorWirePair.getMinorColor())  ));
        String originalColorFormatter = colorFormatter.toString();
        ColorWirePairPrinter colorWirePairPrinter = new ColorWirePairPrinter();
        final String newColorFormatter  =colorWirePairPrinter.getFormatedColourPair();
        assert(originalColorFormatter.equalsIgnoreCase(newColorFormatter));

    }

    private static List<ColorWirePair> getColorWirePair() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        ColorWirePairCreator colorWirePairCreator = new ColorWirePairCreator();
        List<ColorWirePair> listColorWirePair= colorWirePairCreator.createWirePair(majorColors, minorColors);
        return listColorWirePair;
    }
}
