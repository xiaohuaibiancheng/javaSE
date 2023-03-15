package com.xiaohu.service;

import com.xiaohu.model.Customer;
import com.xiaohu.util.CMUtility;

/**
 * @author huhao
 * @create 2022-12-26 22:29
 */
public class CustomerService {

    private CustomerList customerList = new CustomerList(10);

    public void showSelector(){
        System.out.println("------------客户信息管理软件------------");
        System.out.println("             1 添加客户");
        System.out.println("             2 修改客户");
        System.out.println("             3 删除客户");
        System.out.println("             4 客户列表");
        System.out.println("             5 退    出");
        System.out.println("                    ");
        System.out.println("             请选择(1-5):");
        char s = CMUtility.readMenuSelection();
        switch (s){
            case '1':
                addCustomer();
            case '2':
                modifyCustomer();
            case '3':
                deleteCustomer();
            case '4':
                customerList();
            case '5':
                System.out.println("确认是否删除(Y/N)：");
                char confirm = CMUtility.readConfirmSelection();
                if(confirm == 'Y'){
                    break;
                }else if(confirm == 'N'){
                    showSelector();
                }
        }


    }

    public void addCustomer(){
        System.out.println("------------添加客户------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(5);
        System.out.println("性别：");
        char sex = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(15);
        System.out.println("邮箱：");
        String mail = CMUtility.readString(20);

        Customer customer = new Customer(name,sex,age,phone,mail);
        customerList.addCustomer(customer);

        System.out.println("------------添加完成------------\n");
        System.out.println("\n");
        showSelector();
    }

    public void modifyCustomer(){
        System.out.println("------------修改客户------------");
        System.out.println("请选择待修改客户编号(-1退出)：");
        int id = CMUtility.readInt();
        if(id != -1){
            System.out.println("姓名("+customerList.getCustomer(id).getName()+")：");
            String name = CMUtility.readString(5,customerList.getCustomer(id).getName());

            System.out.println("性别("+customerList.getCustomer(id).getSex()+")：");
            char sex = CMUtility.readChar(customerList.getCustomer(id).getSex());

            System.out.println("年龄("+customerList.getCustomer(id).getAge()+")：");
            int age = CMUtility.readInt(customerList.getCustomer(id).getAge());

            System.out.println("电话("+customerList.getCustomer(id).getPhone()+")：");
            String phone = CMUtility.readString(15,customerList.getCustomer(id).getPhone());

            System.out.println("邮箱("+customerList.getCustomer(id).getMail()+")：");
            String mail = CMUtility.readString(20,customerList.getCustomer(id).getMail());

            Customer customer = new Customer(name,sex,age,phone,mail);
            customerList.replaceCustomer(id,customer);

            System.out.println("------------修改完成------------\n");
            System.out.println("\n");
            showSelector();
        }else if(id == -1){
            System.out.println("------------修改完成------------\n");
            System.out.println("\n");
            showSelector();
        }





    }

    public void deleteCustomer(){
        System.out.println("------------删除客户------------");
        System.out.println("请选择待删除客户编号(-1退出)：");
        int id = CMUtility.readInt();
        System.out.println("确认是否删除(Y/N)：");
        char confirm = CMUtility.readConfirmSelection();
        System.out.println("------------删除完成------------");
        if(confirm == 'Y'){
            customerList.deleteCustomer(id);
        }else if(confirm == 'N'){
            showSelector();
        }
    }

    public void customerList(){
        System.out.println("--------------客户列表--------------");
        System.out.println("编号  姓名   性别   年龄  电话   邮箱");
        customerList.showCustomers();
        System.out.println("------------客户列表完成------------");
    }
}
