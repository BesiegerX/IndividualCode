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
{if(text.contains(sub)==true)
return true;
else return false;
}
if(check(text,""+sub.charAt(0))==true && check(text,sub.substring(1,sub.length()))==true)
return true;

return false;
}
}
