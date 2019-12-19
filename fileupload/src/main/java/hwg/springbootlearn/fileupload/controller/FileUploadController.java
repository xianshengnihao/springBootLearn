package hwg.springbootlearn.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: hwg
 * @Date: Create in 2019/12/12
 */
@Controller
public class FileUploadController {
    SimpleDateFormat smpl = new SimpleDateFormat("yyyy-MM-dd");
    @PostMapping("/upload")
    @ResponseBody
    //MultipartFile 变量名必须与前端nanme属性中名字一致，有点傻
    public String fileUpload(MultipartFile file, HttpServletRequest req){
        if(file==null){
            return "文件上传失败";
        }
//        String realpath =req.getServletContext().getRealPath("/img")+smpl.format(new Date());
        File floder = new File("E:\\img");
        if(!floder.exists()){
            floder.mkdir();
        }
        String oldName = file.getOriginalFilename();
        String newFileName = UUID.randomUUID().toString()+oldName.substring(oldName.indexOf("."));
        try {
            file.transferTo(new File(floder,newFileName));
            return floder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";


    }


}
