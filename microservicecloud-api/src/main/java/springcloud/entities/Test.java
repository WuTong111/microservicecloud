/**
 * $Id: Test.java,v 1.0 2019/3/21 14:23 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.entities;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: Test.java,v 1.1 2019/3/21 14:23 G Exp $
 * Created on 2019/3/21 14:23
 */
public class Test {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int sum = 0;
        try{
            for (int i=1;i<6;i++)
                sum = sum + a[i];
            System.out.println("sum " + sum);
        }catch (Exception e){
            System.out.println("数组越界");
        }finally {
            System.out.println("程序结束");
        }
    }
}