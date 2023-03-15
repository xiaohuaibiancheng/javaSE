package com.xiaohu.service;

import com.xiaohu.model.Customer;

/**
 * @author huhao
 * @create 2022-12-28 20:40
 */
public class CustomerList {
    private static int currentID=0;
    private Customer[] customers;

    public void addCustomer(Customer customer){
        if(currentID < customers.length ){
            customer.setId(currentID+1);
            customers[currentID] = customer;
            currentID += 1;
        }else{
            System.out.println("客户已满，无法继续添加！");
        }
    }

    public Customer getCustomer(int index){
        return customers[index-1];
    }

    public void replaceCustomer(int index,Customer customer){
        customer.setId(index);
        customers[index-1] = customer;
    }

    public void deleteCustomer(int index){
        for(int i = index-1;i<customers.length-1;i++){
            customers[i] = customers[i+1];
        }
        customers[customers.length-1] = new Customer();

    }

    public void showCustomers(){
        for(int i=0;i<customers.length;i++){
            System.out.println(customers[i].getId()+"  "+customers[i].getName()+
                    "   "+customers[i].getSex()+"   "+customers[i].getAge()+"  "+customers[i].getPhone()+"   "+customers[i].getMail()+"\n");
        }
    }

    public CustomerList(int length) {
        this.customers = new Customer[length];
    }

}
