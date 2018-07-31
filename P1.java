class P1
{
public static void main(String[] args)
{
System.out.println(check("abcdefghijklmnopqrstuvwxyz","maxsjsmmmn"));
}
static boolean check(String text, String sub)
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
