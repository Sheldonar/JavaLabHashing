import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;

public class Interactive {
    private String[] paths;
    private FileManage fileManage = new FileManage();

    public Integer getMode() {
        Scanner sc = new Scanner(System.in);
        int mode;
        if (sc.hasNextInt()) {
            mode = sc.nextInt();
        } else {
            mode = -1;
        }
        return mode;
    }

    public void showMSG() {
        System.out.println("Press 1 to use SHA256");
        System.out.println("Press 2 to use MD5");
        System.out.println("press F pay respect");
    }

    public void start() {
        while (true) {
            showMSG();
            int currentMode = getMode();
            while (currentMode != 1 && currentMode != 2) {
                if (currentMode != -1) {
                    System.out.printf("Invalid option type %d , must be 1 or 2", currentMode);
                    currentMode = getMode();
                } else {
                    return;
                }
            }
            System.out.println("Enter path to the file:");
            Scanner scanner = new Scanner(System.in);
            String filename = scanner.nextLine();

            if (fileManage.isValid(filename)) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(currentMode == 1 ? "SHA-256" : "MD5");
                    System.out.println(Base64.getEncoder().encodeToString(messageDigest.digest(Files.readAllBytes(Paths.get(filename)))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
