package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(wordcount("Word Count Testing App!"));
    }
    
    public static int wordcount(String s) {
        int count = 0;
	    	String s = "";
	    	char a[] = s.toCharArray();
	    	int endLine = s.length() -1;
	    	for (int i = 0; i<s.length(); i++) {
	    		if (a[i] == 0) {
	    			break;
	    		}
	    		else if (a[i] == ' ' || i == endLine) {
	    			count++;
	    		} else {
	    			continue;
	    		}
	    	}
	    	assertEquals(0, count, 0);
		return count;
    }
}
