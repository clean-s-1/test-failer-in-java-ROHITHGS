public class Tshirts {
    static String shirtSize(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
        assert(shirtSize(37) == "S");
        assert(shirtSize(0)  == "M"): "Invalid size ,Size should be non-zero positive value";
        assert(shirtSize(38) == "M"): "Size is not available";
        assert(shirtSize(40) == "M");
        assert(shirtSize(43) == "L");

        System.out.println("All is well (maybe!)");
    }
}
