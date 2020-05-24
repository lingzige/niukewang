package niuke;

// 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
// 数值为0或者字符串不是一个合法的数值则返回0

/*
* +2147483647
    1a33
    输出
    复制
    2147483647
0
* */

public class StrToInt {

    public static void main(String[] args) {
        String str = "-2147483649";
        System.out.println(strToInt(str));


    }

    public static int strToInt(String str) {
        if("0".equals(str) || str.startsWith("0"))
            return 0;
        int sign=1;
        long res = 0;
        if(str.startsWith("-")){
            sign = -1;
            char[] chs = str.toCharArray();
            for(int i=1;i<chs.length;i++){
                if(!(chs[i]>='0' && chs[i]<='9')){
                    return 0;
                }
                res = (long)(Long.parseLong(new String(chs[i]+""))+res*Math.pow(10,1));
            }
            if(res>0x7FFFFFFF)
                return 0;
            return (int) (sign*res);
        }else if(str.startsWith("+")){
            char[] chs = str.toCharArray();
            for(int i=1;i<chs.length;i++){
                if(!(chs[i]>='0' && chs[i]<='9')){
                    return 0;
                }
                res = (long)(Long.parseLong(new String(chs[i]+""))+res*Math.pow(10,1));
            }

            return (int) res;
        }else{
            char[] chs = str.toCharArray();
            for(int i=0;i<chs.length;i++){
                if(!(chs[i]>='0' && chs[i]<='9')){
                    return 0;
                }
                res = (long)(Long.parseLong(new String(chs[i]+""))+res*Math.pow(10,1));
            }
            return (int) res;
        }
    }
}
