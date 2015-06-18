package mainpackage;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
	
	public static int numberexec=0;
	
    //byte -127 to 127 
    //short -32767 to 32767
    //int  -2147483647 to 2147483647
    //long -9223372036854775807 to 9223372036854775807
    public static void sol(BigInteger input,boolean neg){
    	String N="";
    	if (neg == true){
    		N="-";
    	}
    	
        if(input.bitLength()>64){
            System.out.println(input+ " can't be fitted anywhere.");
         }else{
            System.out.println(N+input +" can be fitted in:");
                  

            if (input.bitLength()<8){
                //arr[1]=true;
                System.out.println("* byte");
            }
        if (input.bitLength()<16){
            //arr[1]=true;
            System.out.println("* short");
        }
        if (input.bitLength()<32){
            //arr[2]=true;
            System.out.println("* int");
        }
        if (input.bitLength()<64){
            //arr[3]=true;
            System.out.println("* long");
        }}

    }

    public static void breakInput(String str){
        if(numberexec>0){
        	if (str.contains("-")){
        	String [] p = str.split("-", 0);
            BigInteger tempBig = new BigInteger(p[1]);
            sol(tempBig,true);}
        	else{
        		
                BigInteger tempBig = new BigInteger(str);
                sol(tempBig,false);
        	}
        }
        numberexec++;
    }
		
}
