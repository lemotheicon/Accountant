/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accountant;

/**
 *
 * @author Omolemo
 */
public class Accountant {

    
    public static void main(String[] args) {
        Employee clerk = new Employee();
        Employee driver = new Employee();
        clerk.setEmpNum(345);
        driver.setEmpNum(567);
        System.out.println("The ckerk's number is " + clerk.getEmpNum() + "and the driver's number is "
        + driver.getEmpNum());
    }
    
}
