
public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            //TODO с какими флагами
        }

        if (args[0].equals("-i")) {
            Interactive interactive = new Interactive();
            interactive.start();
        } else if (args.length > 2 && (args[0].equals("-md5") || args[0].equals("-sha256")) && args[1].equals("-f")) {
            Manual manual = new Manual(args[0], args);
            manual.start();
        } else {
            System.out.println("Invalid arguments");
        }
    }
}
