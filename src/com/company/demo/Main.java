package com.company.demo;


public class Main {

    public static void main(String[] args) {
        String st = "a10b12$";
        int n = st.length();
        int i=0;
        char temp=' ';
        String num="0";
        boolean flag = false;
        while (i<n){

            char ch = st.charAt(i);

            while ((ch>='0'&& ch<='9')&& i<n-1 )
            {
                num = num + ch;
                i++;
                ch = st.charAt(i);
            }

            if(flag)
            {
                for (int j = 0; j < Integer.parseInt(num); j++) {
                    System.out.print(temp);
                }
                num ="0";
                flag = false;
            }

            if(ch>'9')
            {
                temp = ch;
                flag = true;
            }

            i++;
        }

    }
}
