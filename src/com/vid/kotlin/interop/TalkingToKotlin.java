package com.vid.kotlin.interop;

import com.vid.kotlin.classes.CustomerKotlin;
import com.vid.kotlin.classes.CustomerKotlinKt;
import com.vid.kotlin.classes.Status;

import java.io.IOException;

public class TalkingToKotlin {

    public void loadStats(CustomerKotlin c) {
        try{
            c.loadStats("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // Compiler warning because scala object isnt declared nullable (no ! operator)
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Vid", null);

        customerKotlin.getEmail();
        customerKotlin.setEmail("Email");

        // Cannot access as a field, unless annotated with @JvmField
        customerKotlin.getSomeProperty();
        System.out.println(customerKotlin.someOtherProperty);

        customerKotlin.changeStatus(Status.Current);
        // Problems with default arguments, unnless @JvmOverloads added
        customerKotlin.changeStatus();

        // @JvmName annotation
        customerKotlin.preferential();

        // Filename is referenced
        TopLevelFunctionsKt.prefix("some", "value");
        TopLevelFunctionsKt.getCopyRightYear();

        // Extension functions are invoked in this manner
        CustomerKotlinKt.extension(customerKotlin);

    }

}
