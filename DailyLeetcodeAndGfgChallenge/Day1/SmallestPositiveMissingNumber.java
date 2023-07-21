
https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
//APPROACH 1 O(n^2)



class Solution {

  static int missingNumber(int arr[], int size) {
    // Your code here

    //Method1 O(n^2)
    int missing = -1;
    int i = 0;

    for (i = 1; i <= size; i++) {
      int value = i;
      boolean flag = false;
      for (int j = 0; j < size; j++) {
        if (arr[j] == value) {
          flag = true;
          break;
        }
      }
      if (flag) {
        continue;
      } else {
        missing = value;
        break;
      }
    }

    if (i == size + 1) {
      return size + 1;
    } else {
      return missing;
    }
  }
}


APPROACH(O(nlogn))
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        //METHOD2(O(nlogn))
     
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                set.add(arr[i]);
                
                
            }
        }//O(N)


        ArrayList<Integer> list=new ArrayList<>(set);//O(n)
                int missing=list.size()+1;
                Collections.sort(list);O(nlogn)
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==i+1)
            {
                continue;
            }
            else
            {
                missing=i+1;
                break;
            }
        }//O(n)
          //System.out.println(list);
   
        return missing;
        
    }
}


APPROACH-3(O(n))

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                set.add(arr[i]);
                
            }
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        //System.out.println(list);
        //return 3;
        
        for(int i=0;i<list.size();i++)
        {
            int index=Math.abs(list.get(i))-1;
            if(index<list.size())
            {
    
            list.set(index,list.get(index)*-1);
            }
        }
        //System.out.println(list);
       
    
        
        
        
        int i;
        for(i=0;i<list.size();i++)
        {
            if(list.get(i)>0)
            {
                return i+1;
            }
        }
        return list.size()+1;
    }
}

