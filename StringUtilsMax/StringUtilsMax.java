package d20180829.ch07;

public class StringUtilsMax {

    /**
     * 计算回文字符的最大字串的长度
     * @param str
     * @return
     */
    public static int longestPalindrome(String str){
        if (str == null || str.length() < 1){
            return 0;
        }
        int max = 0, current = 0;
        //循环每个字符为回文的中点
        for (int i = 0; i < str.length(); ++i){
            //考虑回文子串为奇数长度的情况
            for (int j = 0; i - j >= 0 && i + j < str.length(); j++){
                //如果不相等，则不继续累加回文子串的长度
                if (str.charAt(i - j) != str.charAt(i + j)){
                    break;
                }
                current = j * 2 + 1;
            }
            //如果得到的长度比max大，则更新max
            if (current > max){
                max = current;
            }
            //重置current
            current = 0;

            //考虑回文子串为偶数长度的情况
            for (int j = 0; i - j >= 0 && i + j + 1 < str.length(); j++){
                if (str.charAt(i - j) != str.charAt(i + j +1)){
                    break;
                }
                current = j * 2 + 2;
            }
            if (current > max){
                max = current;
            }
        }
        return max;
    }
}
