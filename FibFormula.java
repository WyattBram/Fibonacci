import java.lang.Math;
public class FibFormula implements IFindFib{
    @Override
    public int calculateFIb(int f) {
        Math.pow(1-Math.sqrt(5)/2, f);
        return (int) ((Math.pow((1+Math.sqrt(5))/2, f) - Math.pow((1-Math.sqrt(5))/2, f)) / Math.sqrt(5));
    }
}



