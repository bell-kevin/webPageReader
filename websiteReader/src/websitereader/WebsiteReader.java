/*
This reads a webpage
 */
package websitereader;

import java.util.*;
import java.net.*; // URL, URLconnection
import java.io.*;

public class WebsiteReader {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        Scanner webIn;
        URL url;
        URLConnection connection;
        InputStream inStream; // stream of bytes
        int i = 0, maxI; // line number and max line number
        try {
            System.out.println("Enter a full URL address: ");
            url = new URL(computerKeyboardInput.nextLine());
            connection = url.openConnection();
            inStream = connection.getInputStream();
            webIn = new Scanner(inStream);
            System.out.println("Enter number of lines");
            maxI = computerKeyboardInput.nextInt();
            while (i < maxI && webIn.hasNext()) {
                System.out.println(webIn.nextLine());
                i++;
            } // end while loop
        } // end try
        catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end catch exception block
    } // end main method
} // end websiteReader class
