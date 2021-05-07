package com.company;

import java.util.Scanner;

public class websiteCheck {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        String protocol = website.substring(0,website.indexOf(":"));
        String domainType=website.substring(website.lastIndexOf(".")+1);
        if(protocol.equals("https")){
            System.out.println("HyperText Transfer Protocol Secure");
        }
        else if(protocol.equals("http")){
            System.out.println("HyperText Transfer Protocol");
        }
        else if (protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }
        else{
            System.out.println("It is not an Website protocol");
        }

        if(domainType.equals("com")){
            System.out.println("Commersial");
        }
        else if(domainType.equals("gov")){
            System.out.println("government website");
        }
        else if(domainType.equals("net")){
            System.out.println("Network");
        }
        else if(domainType.equals("in")){
            System.out.println("Indian website");
        }
        else if(domainType.equals("org")){
            System.out.println("organization");
        }
        else{
            System.out.println("Unknown Domain");
        }
    }
}
