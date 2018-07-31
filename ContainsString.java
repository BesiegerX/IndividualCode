//java
//@aman

//program to check if a string contains a sequence of letters anywhere in it in any order.
//done recursively.
//just checks if the letters of sub is present in text or not. Repition of letters does not affect.
//case sensitive check.

public class ContainsString
{
public static boolean check(String text, String sub)
{
if (sub.length()==1)
return text.contains(sub);
return check(text,""+sub.charAt(0)) && check(text,sub.substring(1,sub.length()));
}
}
