package com.example.shoppingmall.Service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

//5. 파일업로드 및 삭제 처리
@Service
public class FileService {
    //저장할 경로, 파일명, 데이터값
    public String uploadFile(String uploadPath, String origianlFileName,
                             byte[] filedata) throws Exception {
        UUID uuid = UUID.randomUUID(); //문자열생성
        String extendsion = origianlFileName.substring(
                origianlFileName.lastIndexOf(".")
        ); //문자열 분리
        String saveFileName = uuid +extendsion; //새로운 파일명
        String uploadFullUrl = uploadPath+saveFileName; //저장위치 및 파일명

        //하드디스크에 파일 저장
        FileOutputStream fos = new FileOutputStream(uploadFullUrl);
        fos.write(filedata);
        fos.close();

        return saveFileName; //데이터베이스에 저장할 파일명을 전달
    }

    //파일삭제(상품을 수정시 기존파일을 삭제하고 새로운 파일을 저장)
    public void deleteFile(String uploadPath, String fileName) throws Exception {
        String deleteFileName = uploadPath+fileName;

        File deleteFile = new File(deleteFileName);
        if(deleteFile.exists()) { //파일이 존재하면
            deleteFile.delete();
        }
    }

}
