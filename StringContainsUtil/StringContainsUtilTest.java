package d20180829.ch07;

public class StringContainsUtilTest {

    public static void main(String[] args){
        String str1 = "ABCDEFG", str2 = "DEA", str3 = "ADH";
        System.out.println(StringContainsUtil.contains(str1, str2));
        System.out.println(StringContainsUtil.contains(str1, str3));
    }
}
