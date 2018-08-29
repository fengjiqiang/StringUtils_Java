package d20180829.ch07;

import java.util.HashMap;
import java.util.Hashtable;

public class StringContainsUtil {
    /**
     * 散列表方式实现字符串包含问题
     * @param str1
     * @param str2
     * @return
     */
    public static boolean contains(String str1, String str2){
        Hashtable hashtable = new Hashtable();
        for (int i = 0; i < str1.length(); i++){
            //依次把str1中的字符放入散列表
            //散列表的值没用，随便放个1
            hashtable.put(str1.charAt(i), 1);
        }
        for (int i = 0; i < str2.length(); i++){
            if (!hashtable.containsKey(str2.charAt(i))){
                return false;
            }

//            Object value = hashtable.get(str2.charAt(i));
//            int v = Integer.parseInt(value.toString()); //java.lang.NullPointerException
//            if (v != 1){
//                return false;
//            }
        }
        return true;
    }
}
