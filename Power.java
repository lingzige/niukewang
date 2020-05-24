package niuke;

/*
* 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

保证base和exponent不同时为0
* */
public class Power {

    public static double Power(double base, int exponent) throws Exception {
        int res = 1;
        if(base==0){
            return 0;
        }
        if(exponent==0 || base==1){
            return 1;
        }
        if(exponent<0){
            exponent = -exponent;
            for (int i = 0; i < exponent; i++) {
                res *= base;
                if(res>Double.MAX_VALUE){
                    System.out.println("超过最大值");
                    return -1;
                }
            }
            return 1.0/res;
        }else{
            for (int i = 0; i < exponent; i++) {
                res *= base;
                if(res>Double.MAX_VALUE){
                    System.out.println("超过最大值");
                    return -1;
                }
            }
            return res;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(Power(20,2000));
    }
}