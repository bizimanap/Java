 class interest2 {//a class called interest2.
    public double cal(int p,int t,int r, int n){// created methood.
        return(p*((1+((r/100)/n))^(n*t)));// the formula that will be used  to calculate.

    }
    
}
class BB{// a second class called BB.
    public static void main(String[] args){// a mandatory java syntax.
        interest2 myinterest2=new interest2();// a created object called my interest2.
        double response=myinterest2.cal(500000,18,3,12);// recalling of methood and the values .
        System.out.println("response:"+response);//system prints an output.
    }

}
