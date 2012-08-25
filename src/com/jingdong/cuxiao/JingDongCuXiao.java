package com.jingdong.cuxiao;

import java.io.File;

import org.jsoup.nodes.Document;


public class JingDongCuXiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
	//	Create static html page by model page with product's id,such as 280111.
		HtmlElements element=new HtmlElements(
				new File(
						CreateHtmlPage.create(280111)));
		
	//	Create static html page by sample page.
	//	HtmlElements element=new HtmlElements(new File("WebRoot/Example.html"));
		System.out.println(element.cuXiaoInfo_get()); 
	}	

} 