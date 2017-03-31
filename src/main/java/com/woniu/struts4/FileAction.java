package com.woniu.struts4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;

public class FileAction {
	
	
	private File upLoadFile;
	  private String upLoadFileContentType;// 得到文件的类型
	  private String upLoadFileFileName;// 得到文件的名称
	  
	  public File getUpLoadFile() {
			return upLoadFile;
		}
		public void setUpLoadFile(File upLoadFile) {
			this.upLoadFile = upLoadFile;
		}
		

	public String getUpLoadFileContentType() {
			return upLoadFileContentType;
		}
		public void setUpLoadFileContentType(String upLoadFileContentType) {
			this.upLoadFileContentType = upLoadFileContentType;
		}
		public String getUpLoadFileFileName() {
			return upLoadFileFileName;
		}
		public void setUpLoadFileFileName(String upLoadFileFileName) {
			this.upLoadFileFileName = upLoadFileFileName;
		}
		
	//上传文件	
//	public String upLoadFile(){
//		if(upLoadFile!=null){
//			String path="D:/新建文件夹";  //获取文件存入路径
//			String extension=upLoadFileFileName.substring(upLoadFileFileName.lastIndexOf("."));
//			String name= UUID.randomUUID().toString()+extension;  //获取新的文件名
//			File file =new File(path, name);
//			upLoadFile.renameTo(file);
//		}
//		return "upLoadFile";
//	}
	//上传文件
	public String upLoadfile1(){
		//获取文件路径
		String past1="D:/新建文件夹";
		//获取一个随机文件名
		String name1=UUID.randomUUID()+upLoadFileFileName.substring(upLoadFileFileName.lastIndexOf("."));
		//指定文件的路径和名称
		File file1=new File(past1, name1);
		//获取文件内容（copy upLoadFile的内容到file1）
		upLoadFile.renameTo(file1);
		//返回逻辑视图名
		return "upLoadFile";
	}
	
	//下载文件返回的逻辑视图
	public String downLoadFile(){
		
		return "downLoadFile";
	}
	
	//对应的struts.xml中的getdownLoad
	public InputStream getDownLoad(){
		String path="D:/新建文件夹/b85124c5-9cf9-4b07-ba95-7d78bd759d2e.jpg";
		try {
			return new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	

}
