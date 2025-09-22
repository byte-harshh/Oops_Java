package com.company;

import com.company.accounts.Account;
import com.company.hr.Employee;

public class CompanyTest {
   public static void main(String[] args) {
       Account  a = new Account();
       a.displayAccountDetails();
       Employee e = new Employee();
       e.displayEmployeeDetails();
    }
}
