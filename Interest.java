 class Interest {//this is a first class called Interest.
    public double cal(double r, double p, double y){ //this is a methood.
        return(p*r*y);// this is a formala which will be used to calculate.
    }
    }
    class object{ // this is an other class called object.
        public static void main(String args[]){// a mandatory syntax in java languege.
            Interest mySI=new Interest();//a created object called mySI.
            double answer =mySI.cal(100000,0.05,5);  //values of arguments.
            System.out.println("answer:" +answer);//printing of output.

        }
    }
    

