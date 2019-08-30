package BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        Map<Integer,BankAccount> bankAccounts = new LinkedHashMap<>();

        while(!"End".equals(input=read.readLine())){

            String[] data = input.split("\\s+");

            switch (data[0]){
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(),bankAccount);
                    System.out.println(String.format("Account ID%d created",bankAccount.getId()));
                    break;
                case "Deposit":
                    if (bankAccounts.containsKey(Integer.parseInt(data[1]))){
                        bankAccounts.get(Integer.parseInt(data[1])).deposit(Double.parseDouble(data[2]));
                        System.out.println(String.format("Deposited %s to ID%s",data[2],data[1]));
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(data[1]));
                    break;
                case "GetInterest":
                    if (bankAccounts.containsKey(Integer.parseInt(data[1]))){
                        System.out.println(String.format("%.2f",bankAccounts.get(Integer.parseInt(data[1])).getInterest(Integer.parseInt(data[2]))));
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

        }

    }
}
