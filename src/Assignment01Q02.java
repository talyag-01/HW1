public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int num = Integer.parseInt(args[0]);
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                approxPi += 1.0 / (i*2 + 1);
            } else {
                approxPi -= 1.0 / (i*2 + 1);
            }
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
