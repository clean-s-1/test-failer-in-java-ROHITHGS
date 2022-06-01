import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class ColorWirePairCreator {
    public List<ColorWirePair> createWirePair(final String[] majorColors , final String[] minorColors){
        final List<ColorWirePair> listColorWirePair = new ArrayList<ColorWirePair>();
        AtomicInteger colorPair = new AtomicInteger(0);
        Arrays.stream(majorColors).forEach(majorColor->Arrays.stream(minorColors).forEach(minorColor ->
                listColorWirePair.add(new ColorWirePair(colorPair.getAndIncrement(),majorColor,minorColor))));
        return listColorWirePair;
    }
}
