package com.tman.tanmay.new_calculator;

import android.widget.TextView;

/**
 * Created by TANMAY on 02-Oct-16.
 */
public class Calculator {
    private TextView display;
    public void setTextView(TextView t){
        this.display = t;
    }
    String num1;
    String num2;
    int n,n1,n2;
    int count;
    String exp = "";
    public Calculator() {
        num1="";
        num2="";
        n=0;
        count=1;
        n1=0;
        n2=0;
        exp = "";
    }

    void calc(char c)
    {

        try //(true)
        {
            switch (c)
            {

                case '0':
                    exp = exp + "0";
                    display.setText(exp);
                    break;

                case '1':
                    exp = exp + "1";
                    display.setText(exp);
                    break;

                case '2':
                    exp = exp + "2";
                    display.setText(exp);
                    break;

                case '3':
                    exp = exp + "3";
                    display.setText(exp);
                    break;

                case '4':
                    exp = exp + "4";
                    display.setText(exp);
                    break;

                case '5':
                    exp = exp + "5";
                    display.setText(exp);
                    break;

                case '6':
                    exp = exp + "6";
                    display.setText(exp);
                    break;

                case '7':
                    exp = exp + "7";
                    display.setText(exp);
                    break;

                case '8':
                    exp = exp + "8";
                    display.setText(exp);
                    break;

                case '9':
                    exp = exp + "9";
                    display.setText(exp);
                    break;

                case '+':
                    exp = exp + "+";
                    display.setText(exp);
                    break;

                case '-':
                    exp = exp + "-";
                    display.setText(exp);
                    break;

                case '*':
                    exp = exp + "*";
                    display.setText(exp);
                    break;

                case '/':
                    exp = exp + "/";
                    display.setText(exp);
                    break;

                case '=':

                    if(exp.equals("0/0"))
                        break;
                    int pos=0;
                    for(int i=0;i<exp.length();i++)
                    {
                        if(exp.charAt(i)=='/')
                        {
                            n=4;
                            pos=i;
                        }
                        else if (exp.charAt(i)=='+')
                        {
                            n=1;
                            pos=i;
                        }
                        else if (exp.charAt(i)=='-')
                        {
                            n=2;
                            pos=i;
                        }
                        else if (exp.charAt(i)=='*')
                        {
                            n=3;
                            pos=i;
                        }
                    }
                    if(pos==0)
                    {
                        exp=exp.substring(1,exp.length());
                        display.setText(exp);
                        break;
                    }
                    if(pos==(exp.length()-1))
                    {
                        exp=exp.substring(0,exp.length()-1);
                        display.setText(exp);
                        break;
                    }
                    num1="";
                    num2="";
                    for(int i=0;i<pos;i++)
                    {
                        num1=num1+exp.charAt(i);
                    }
                    n1=Integer.parseInt(num1);
                    for(int i=pos+1;i<exp.length();i++)
                    {
                        num2= num2 +exp.charAt(i);
                    }
                    n2=Integer.parseInt(num2);
                    if (n == 1) {
                        display.setText((n1 + n2) + "");
                        exp = Integer.toString(n1 + n2) ;
                    }
                    if (n == 2) {
                        display.setText((n1 - n2) + "");
                        exp = Integer.toString(n1 - n2) ;
                    }
                    if (n == 3) {
                        display.setText((n1 * n2) + "");
                        exp = Integer.toString(n1 * n2) ;
                    }
                    if (n == 4) {
                        display.setText((n1 / n2) + "");
                        exp = Integer.toString(n1 / n2) ;
                    }
                    n=0;
                    n1=0;
                    n2=0;
                    display.setText(exp);
                    break;

                case 'c':
                    display.setText("");
                    exp="";
                    num1="";
                    num2="";
                    break;

                case 'd':
                    if(exp!="")
                    {
                        exp = exp.substring(0, (exp.length() - 1));
                        display.setText(exp);
                    }
                    break;

                default:
                    break;
            }
        //break;
        }
        catch (Exception e){
            exp="";
            display.setText(exp);
        }
    }
}