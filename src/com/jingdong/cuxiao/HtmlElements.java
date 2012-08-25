package com.jingdong.cuxiao;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class HtmlElements {
	Document doc;
	public HtmlElements(){}
	
	public HtmlElements(String getUrl){  
		try {
			doc = Jsoup.connect(getUrl).userAgent("")  
			                .timeout(3000)  
			                .get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public HtmlElements(File file){ 
		try {
				doc  = Jsoup.parse(file, "gbk");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	}

	public String cuXiaoInfo_get(){ 
		Element link=this.doc.select("span#mfms").first(); 
		return link.text(); 
	}

	
	
	public Document doc_get() {
		return this.doc;
	}
  
}
