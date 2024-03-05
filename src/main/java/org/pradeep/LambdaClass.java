package org.pradeep;

public class LambdaClass {

public String handleRequest(String value){
    return value!=null || ""!=value ? "Hello " + value + "!" : "Hello World !";
}
}
