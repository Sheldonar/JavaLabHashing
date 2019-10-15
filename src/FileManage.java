import java.io.File;

public class FileManage {
    public Boolean isValid(String address) {
        File check = new File(address);
        if (!check.exists()) {
            System.out.println("File in current path does not exist");
//            logger.warn("File in current path does not exist");
            return false;
        }
        if (!check.isFile()) {
            System.out.println("Not a file");
//            logger.warn("Not a file");
            return false;
        }

        return true;
    }

}
