import java.io.*;
import  java.util.*;

public class IdentifyPossibleWords {

	public String identifyPossibleWords(String input1,String input2)
  {
		input1 = input1.toUpperCase();
		
		StringBuffer out= new StringBuffer();
		String[] str= input2.split(":");
		
		int a = input1.indexOf('_');
		
		for (int i = 0; i < str.length; i++)
    {
			str[i] = str[i].toUpperCase();

			if (str[i].length() >= input1.length() && input1.replace('_', str[i].charAt(a)).equals(str[i]))
      {
				out.append(str[i]).append(":");
			}
		}
		
		if (out.length() == 0) 
        return "ERROR";
    else
        return out.toString().substring(0, out.length() - 1);
	}
}
