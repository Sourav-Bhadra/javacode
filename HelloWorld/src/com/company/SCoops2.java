package com.company;

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,int qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQuantity(){return qty;}

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(int qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class SCoops2
{
    public static void main(String[] args)
    {

        Product p =new Product("ab34","sourav");
        Customer c= new Customer("13224","sourav");
        p.setPrice(100);
        p.setQuantity(3);
        c.setAddress("45,jk lane");
        c.setPhno("686497546466");
    }
}