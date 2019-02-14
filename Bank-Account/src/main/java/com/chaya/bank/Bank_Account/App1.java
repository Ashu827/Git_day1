package com.chaya.bank.Bank_Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
       
       BankAccount acc= context.getBean(BankAccount.class);
       acc.deposit();
    }
}