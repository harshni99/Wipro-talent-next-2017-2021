import java.util.*; 
public class RemoveDuplicateCharInString
{
    public static void main(String args[])
    {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("string before removing duplicates:"+str);
        str = str.toLowerCase();
        char ch[]=str.toCharArray();
        int len=ch.length;
        int i,j=0,index=0;
        for(i=0;i<len;i++)
        {
            for(j=0;j<i;j++)
            {
                if(ch[i]==ch[j])
                {
                    break;
                }
            }
            if (j==i)  
            { 
                ch[index++] = ch[i]; 
            } 
        }
         System.out.println("String after removing duplicates:"+String.valueOf(Arrays.copyOf(ch, index)));
    }
}