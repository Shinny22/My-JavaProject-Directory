package cfi.ciras.devoir2;
import java.lang. StringBuilder;


public class Inverser{
	

    public  String reverseString(String str) {
    	
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

