//aaaabbccd      a4,b2,c2,d1    4-2=2

package Problems;
import java.util.*;

class Prob {
    public static void method1(String str)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {

        if(map.containsKey(str.charAt(i)))
        {
            int value=map.get(str.charAt(i));
            map.put(str.charAt(i),value+1);

        }
        else{
            map.put(str.charAt(i),1);
        }
        }
        System.out.println(map);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        method1(str);

        
    }

    
}
