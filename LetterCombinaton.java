package College.Recursion.MultipleRecursion;

import java.util.ArrayList;
//leetcode no-17

public class LetterCombinaton {
    static String keypadKeys[]={
        ".","@#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };

    static ArrayList<String> keypad(String number)
    {
        if(number.length()==0)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(" ");
            return list;
        }
        char firstChar=number.charAt(0);
        String remString=number.substring(1);

        int index=firstChar-'0';
        String key=keypadKeys[index];
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<key.length();i++)
        {
            ArrayList<String> list=keypad(remString);
            for(String s:list)
            {
                result.add(key.charAt(i)+s);
            }

        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(keypad("23"));
        
    }
    
}
