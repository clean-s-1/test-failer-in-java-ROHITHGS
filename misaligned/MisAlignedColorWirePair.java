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
        assert (colorWirePairSet !=25) : "Valid color wire pairs";
        System.out.println("All is well (maybe!)");

    }

    private static void colorWirePairTest(final List<ColorWirePair> listColorWirePair){
        ColorWirePair colorWirePair= listColorWirePair.get(3);
        assert (WHITE.equalsIgnoreCase(colorWirePair.getMajorColor())):"Invalid Major Color";
        assert (BROWN.equalsIgnoreCase(colorWirePair.getMinorColor())):"Invalid Minor Color";
    }

    private static List<ColorWirePair> getColorWirePair() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        ColorWirePairCreator colorWirePairCreator = new ColorWirePairCreator();
        List<ColorWirePair> listColorWirePair= colorWirePairCreator.createWirePair(majorColors, minorColors);
        return listColorWirePair;
    }
}
