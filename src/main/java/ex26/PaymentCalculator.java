package ex26;

public class PaymentCalculator {
    float calcBal;
    int calcAPR;
    float calcPay;
    double aprPercent;
    double rate;

    public PaymentCalculator(float bal, int apr, float pay){
        calcBal = bal;
        calcAPR = apr;
        calcPay = pay;
        aprPercent = calcAPR/100.0;
        rate = aprPercent/365;
    }

    public double calculateMonthsUntilPaidOff(){
        return (-(1.0/30.0) * (Math.log(1 + ((calcBal/calcPay) * (1 - (Math.pow((1 + rate), 30))))))) / (Math.log(1 + rate));
    }

}


