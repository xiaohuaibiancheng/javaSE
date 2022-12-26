package com.xiaohu.util;

import com.xiaohu.model.Account;
import com.xiaohu.util.Utility;

import java.io.FilenameFilter;

/**
 * @author huhao
 * @create 2022-12-04 20:41
 */
public class FamilyAccountUtil {

    public void operSelect(String details,int balance){
        while(true){
            System.out.println("\n------------家庭收支记账软件------------\n");
            System.out.println("              1、收支明细");
            System.out.println("              2、登记收入");
            System.out.println("              3、登记支出");
            System.out.println("              4、退出");
            System.out.println();
            System.out.println("             请选择(1-4)：");

            char key = Utility.readMenuSelection();
            switch (key){
                case '1':
                    showDetails(details);
                case '2':
                    incoming(details,balance);
                case '3':
                    outcoming(details,balance);
                case '4':
                    char exit = exit();
                    if(exit == 'Y'){
                        break;
                    }else{
                        continue;
                    }
            }
        }



    }

    public char exit(){
        System.out.println("\n");
        System.out.println("确认是否退出(Y/N)：");
        char key = Utility.readConfirmSelection();
        return key;
    }

    public void showDetails(String details){
        System.out.println("\n------------当前收支明细记录------------");
        System.out.println("收支   账户余额    收支金额    说明");
        System.out.println(details);
//        if(accounts != null && accounts.length>0){
//            for(Account account:accounts){
//                System.out.println(account.type+"   "+account.balance+"    "+account.vary+"    "+account.remark);
//            }
//        }
    }

    public void incoming(String details, int balance){
        System.out.println("\n");
        System.out.println("本次收入金额：");
        int in = Utility.readNumber();
        System.out.println("本次收入说明：");
        String remark = Utility.readString();

        balance += in;
        String info = "收入"+"   "+balance+"    "+in+"    "+remark+"\n";
        details += info;
    }

    public void outcoming(String details, int balance){
        System.out.println("\n");
        System.out.println("本次支出金额：");
        int out = Utility.readNumber();
        System.out.println("本次支出说明：");
        String remark = Utility.readString();

        balance -= out;
        String info = "支出"+"   "+balance+"    "+out+"    "+remark+"\n";
        details += info;
    }
}
