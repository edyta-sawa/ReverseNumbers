public class Reverse {
    public static void main(String[] args) {

        float[] vals = new float[3];
        vals[0] = 1.0f;
        vals[1] = 10.0f;
        vals[2] = 20.0f;
        float theSum = 0.0f;
        for (float val : vals)
            theSum += val;
        System.out.println(theSum);
    }
}