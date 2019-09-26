public class printMegaBytesAndKiloBytes {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes > 0) {
            System.out.println("Invalid Value");
        } else {
            int inMegaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            String result = kiloBytes + " KB " + "= " + inMegaBytes + "MD "
                    + "and " + remainingKiloBytes + "KB ";
            System.out.println(result);
        }
    }
}
