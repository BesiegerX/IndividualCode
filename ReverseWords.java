//java
//@aman

//code that reverses words in a sentence using recursion.
//puts an extra space at the end of output. Should use text.substring(0,text.length()-1) when using the code.

public class ReverseWords
{
public static String reverse(String text)
{
if(text.indexOf(" ")<0)
return text+" ";
return reverse(text.substring(text.indexOf(" ")+1,text.length())) + text.substring(0,text.indexOf(" ")+1);
}
}
