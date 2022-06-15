import java.util.InputMismatchException;

public class Tshirts {
    static String shirtSize(int cms) {
        if(cms<=20) {
            throw new InputMismatchException("Invalid Tshirt size selected");
        }
        if(cms < 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else if(cms<=46){
            return "L";
        } else {
            throw new InputMismatchException("Invalid Tshirt size selected");
        }
    }

    public static void main(String[] args) { 
        assert(shirtSize(37) == "S");
        assert(shirtSize(38) == "M");
        assert(shirtSize(40) == "M");
        assert(shirtSize(43) == "L");

        System.out.println("All is well (maybe!)");
    }
}
