// branch: main
// branch: dev-octopus-temp
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to MAIN");

        // DEV: extra debugging info — inserted BEFORE the loop (unique)
        printDevNotes();

        for (int i = 1; i <= 7; i++) {
            System.out.println("i = " + 2 * i);
        }
    }

    private static void printDevNotes() {
        System.out.println("DEV: running extra checks...");
        for (int j = 1; j <= 3; j++) {
            System.out.println("dev-check " + j);
        }
    }
}
