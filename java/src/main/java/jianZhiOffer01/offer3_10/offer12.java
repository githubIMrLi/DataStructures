package jianZhiOffer01.offer3_10;

public class offer12 {

    public double Power(double base, int exponent) {
        if (exponent==0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
        boolean flag=  false;
        if (exponent<0){
            exponent = -exponent;
            flag = true;
        }
        double pow = Power(base*base,exponent/2);
        if (exponent%2!=0){
            pow = pow*base;
        }
        return flag ? 1/pow:pow;
    }
}
