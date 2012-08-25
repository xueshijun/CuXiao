package com.htmlclient.test;



/* ****** ****** */

import com.gargoylesoftware.htmlunit.html.*;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.BrowserVersion;

/* ****** ****** */

class Test {

    public static void main (String[] args) throws Exception
    {
		final WebClient webClient = new WebClient();
		HtmlPage page ;
		/*
		page = webClient.getPage("http://htmlunit.sourceforge.net");
		System.out.println (page.asXml());
	        page = webClient.getPage("http://www.ats-lang.org");
		System.out.println (page.asXml());
		*/
		// webClient.setJavaScriptEnabled(false);
		page = webClient.getPage("http://localhost:50080/CuXiao.html");
		System.out.println (page.asXml());
		webClient.closeAllWindows();
		return ;
    }
}

/* ****** ****** */

/* end of [Test.java] */
