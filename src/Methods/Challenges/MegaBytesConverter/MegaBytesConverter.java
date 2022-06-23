package Methods.Challenges.MegaBytesConverter;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        //1MB = 1024 KB
        //2500KB = 2MB AND 452KB

        if (kilobytes < 0){
            System.out.println("Invalid Value");
            return;
        }

        int megabyte = (kilobytes / 1024);
        int remainingKilobytes = (kilobytes % 1024);

        System.out.println(kilobytes + " KB = " + megabyte +" MB and " + remainingKilobytes + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

}
