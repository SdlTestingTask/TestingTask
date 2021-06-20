package Analyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetriveInteger {
		
		public int FetchNum(String strString) {
			
			 String strTest_1 = strString.replace(",", "");
			 
			 String str = "";
			 
			 Pattern p3 = Pattern.compile("\\d+");
			 
		     Matcher m3 = p3.matcher(strTest_1);
		      
		     while(m3.find()) {
		    	  
		         str = (m3.group());
		      }
			    int iTest = Integer.parseInt(str);
			    
			    return iTest;
		}
		
}


