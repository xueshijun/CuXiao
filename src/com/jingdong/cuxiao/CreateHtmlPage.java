package com.jingdong.cuxiao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

/**
 * Create Html Page with model
 * @author Administrator
 *
 */
public class CreateHtmlPage  {
	//<div id="name" pshowskuid="280122"></div>
	public static String create(int id) {
		String filename="";
		try {
		    String title="<div id=\"name\" pshowskuid=\""+String.valueOf(id)+"\"></div>";
		    //the path of model html page 
		    String filePath =  "WebRoot/CuXiao.html";
//		    System.out.print(filePath);
		   String templateContent = "";
		   FileInputStream fileinputstream = new FileInputStream(filePath);
		   int lenght = fileinputstream.available();
		   byte bytes[] = new byte[lenght];
		   fileinputstream.read(bytes);
		   fileinputstream.close();
		   templateContent = new String(bytes);
//		   System.out.print(templateContent);
		   templateContent = templateContent.replaceAll("###promotion###", title); 
//		   System.out.print(templateContent);
		
		   //get file name by current time
		   Calendar calendar = Calendar.getInstance();
		   filename = String.valueOf(calendar.getTimeInMillis()) + ".html";
		   filename = "WebRoot/" + filename;//Saving Path。
		   FileOutputStream fileoutputstream = new FileOutputStream(filename);// 建立文件输出流

		   System.out.println("文件输出路径:"+filename);
		   byte tag_bytes[] = templateContent.getBytes();
		   fileoutputstream.write(tag_bytes);
		   fileoutputstream.close(); 
	  } catch (Exception e) {
		  System.out.print(e.toString());
	  }
	  return filename;
 }}