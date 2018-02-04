package com.rpise;
import java.util.StringTokenizer;
/*
 * @author Rajesh Patkar
 */
public class CheckingUserDefinedExceptions {

    private String output = "";
    private boolean flag1;
    private boolean flag2;

    /* ReadOnly Property */
    public String getOutput() {
        return output;
    }

    /* WriteOnly Property */
    public void setC(String s) {
        StringTokenizer st = new StringTokenizer(s, ",");
        flag1 = Boolean.parseBoolean(st.nextToken());
        flag2 = Boolean.parseBoolean(st.nextToken());
        output = "";
        client1();
    }

    void client1() {
        output += "<p> Entering Client1 </p>";
        try {
            output += "<p>Entering Outer try</p>";
            client2();
            output += "<p> Leaving Outer try</p>";
        } catch (E2 e) {
            output += "<p> Caught E2 " + e.getErrorno() + "</p>";
        } finally {
            output += "<p>In finally of Outer try</p>";
        }
        output += "<p> Leaving Client1 </p>";
    }

    void client2() {
        output += "<p>Entering Client2</p>";
        try {
            output += "<p> Entering Inner try </p>";
            if (flag1) {
               /* Instantiate Exception E1 */
                E1 e1 = new E1(-2);
                /* throw the exception object so that it propagates until caught */
                throw e1;
            }
            output += "<p>Median</p>";
            if (flag2) {
                /* Instantiate Exception E2 and  throw the exception object so that it propagates until caught */
                throw new E2(5);
            }
            output += "<p>Leaving Inner try</p>";
        } catch (E1 e) {
            output += "<p> Caught E1" + e.getErrorno() + "</p>";
        } finally {
            output += "<p> In finally of inner try </p>";
        }
        output += "<p>Leaving Client2</p>";
    }
}

