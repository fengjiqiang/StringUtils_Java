package d20180829.ch07;

public class Reverse {
    /**
     * 在对换位置反转字符串
     * @param str
     * @param start
     * @param end
     * @return
     */

    public static String reverse(String str, int start, int end){
        char[] array = str.toCharArray();  //将array转换为一个新的字符数组
        int mid = (end - start) / 2 + start;
        for (int i = 0; i <= mid - start; i++){
            swap(array, start + i, end - i);
        }
        return String.valueOf(array);  //返回array的字符串表示形式
    }

    /**
     * 字符数组指定位置的互换
     * @param array
     * @param left
     * @param right
     */

    private static void swap(char[] array, int left, int right){
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
