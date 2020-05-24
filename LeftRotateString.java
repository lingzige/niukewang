package niuke;

// 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
// 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
// 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！

import netscape.security.UserTarget;

public class LeftRotateString {

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(leftRotateString(str, 2));
    }

    public static String leftRotateString(String str,int n) {
        if(n>=str.length())
            return str;
        char[] chs = str.toCharArray();
        swap(chs, 0, n-1);
        swap(chs, n, str.length()-1);
        swap(chs, 0, str.length()-1);
        return new String(chs);
    }

    public static void swap(char[] chs, int i, int j){
        while(i<j){
            char temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
            i++;
            j--;
        }

    }
}
