//ROKTOM
class SquareEncrypt
{
    public static void main(String args[])
    {
        String str=args[0];
        int l=str.length(),in=l;
        for(int i=0;i<l;i++)
        {
            if(Math.sqrt(l)%1==0)
            break;
            l++;
        }
        String enc="";
        for(int i=0;i<Math.sqrt(l);i++)
        {
            for(int j=i;j<Math.pow(Math.sqrt(l),2);j=(int)(j+Math.sqrt(l)))
            {
                if(j>=in)
                    enc+=".";
                    else if(str.charAt(j)==' ')
                    enc+="*";
                    else
                    enc+=str.charAt(j);
                }
            }
            for(int i=0;i<l;i++)
            System.out.print(enc.charAt(i));
            }
}