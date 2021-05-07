
package com.company;
class check{
    boolean checkRotation(String str1, String str2){
        if (str1.length()!= str2.length()) {
            return false;
        }
        else{
            String temp=str1+str2;

            if (temp.substring(temp.indexOf(str2), (str2.length()+1))==str2) {
                return true;
            }
            else{
                return false;
            }
        }

    }
}




class test1{
    public static void main(String[] args) {
        String str1 ="avajava";
        String str2 ="javaava";
        check s = new check();
        if(s.checkRotation(str1, str2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}