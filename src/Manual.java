import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Base64;

public class Manual {
    private String[] paths;
    private String mode;
    private FileManage fileManage = new FileManage();

    public Manual(String mode, String[] paths) {
        this.mode = mode;
        this.paths = paths;
    }

    public void start() {
        for (int i = 2; i < paths.length; i++) {
            String path = paths[i];
            if (fileManage.isValid(path)) {
                try {
                    byte[] fileBytes = Files.readAllBytes(Paths.get(path));
                    String hash = mode.equals("-md5") ? DigestUtils.md5Hex(fileBytes) : DigestUtils.sha256Hex(fileBytes);



                    System.out.println(hash);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
