/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

/**
 * https://www.geeksforgeeks.org/java-lang-runtime-class-in-java/
 * 
 * https://www.javatpoint.com/java-runtime-class Java Runtime class is used to
 * interact with java runtime environment. Java Runtime class provides methods
 * to execute a process, invoke GC, get total and free memory etc. There is only
 * one instance of java.lang.Runtime class is available for one java
 * application.
 *
 * 1)	public static Runtime getRuntime()	returns the instance of Runtime class.
 * 2)	public void exit(int status)	terminates the current virtual machine. 
 * 3)   public void addShutdownHook(Thread hook)	registers new hook thread. 
 * 4)	public Process exec(String command)throws IOException	executes given command in a separate process. 
 * 5)	public int availableProcessors()	returns no. of available processors. 
 * 6)	public long freeMemory()	returns amount of free memory in JVM. 
 * 7)	public long totalMemory()	returns amount of total memory in JVM
 *
 * @author EDYA
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInfo {

    public static void main(String[] args) throws IOException {
        //Java Runtime exec() method
        Runtime.getRuntime().exec("notepad");//will open a new notepad  

        //How to shutdown system in Java
        //Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");  
        
        //How to restart system in Java
        //Runtime.getRuntime().exec("shutdown -r -t 0");  
        
        //Java Runtime availableProcessors()
        //System.out.println(Runtime.getRuntime().availableProcessors());

        //Java Runtime freeMemory() and totalMemory() method
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory: " + r.totalMemory());
        System.out.println("Free Memory: " + r.freeMemory());

        for (int i = 0; i < 10000; i++) {
            new SystemInfo();
        }
        System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: " + r.freeMemory());

    }

}
