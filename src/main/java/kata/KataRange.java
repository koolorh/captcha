package kata;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class KataRange {

    private String input;
    public KataRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith("[");
    }

    public boolean isEndWithInclusive() {
        return input.endsWith("]");
    }

    public int getStartRange() {
        if(isStartWithInclusive()) {
            return Integer.parseInt(input.charAt(1)+"");
        }else{
            return 1;
        }
    }
}
