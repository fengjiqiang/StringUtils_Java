package d20180829.ch07;

public class StringUtils {
    /**
     * 判断回文字符串
     * @param str
     * @return
     */

    public static boolean isPalindrome(String str){
        if (str == null || str.length() == 0){
            throw new RuntimeException("字符串为空");
        }
        int mid = (str.length() - 1) / 2;
        for(int i = 0;i <= mid; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
