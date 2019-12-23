package hwg.springbootlearn;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author: hwg
 * @Date: Create in 2019/12/19
 */
public class FileUploadThread implements Runnable {
    private MultipartFile file;
    private File floder;
    public FileUploadThread(MultipartFile file, File floder){
        this.file=file;
        this.floder=floder;
    }
    @Override
    public void run() {
        String oldName = file.getOriginalFilename();
        String newFileName = UUID.randomUUID().toString()+oldName.substring(oldName.indexOf("."));
        try {
            file.transferTo(new File(floder,newFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
