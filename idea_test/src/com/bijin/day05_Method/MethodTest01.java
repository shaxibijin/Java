package com.bijin.day05_Method;
/*
    数组遍历

    需求：
        设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]

    思路：
        1:因为要求结果在一行上输出，所以这里需要在学习一个新的输出语句System.out.print(“内容”);
            System.out.println(“内容”); 输出内容并换行
            System.out.print(“内容”); 输出内容不换行
            System.out.println(); 起到换行的作用
        2:定义一个数组，用静态初始化完成数组元素初始化
        3:定义一个方法，用数组遍历通用格式对数组进行遍历
        4:用新的输出语句修改遍历操作
        5:调用遍历方法
 */
public class MethodTest01 {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55};
        PrintArray(arr);
    }
//定义一个方法，用数组遍历通用格式对数组进行遍历
    /*
        两个明确：
            返回值类型：void
            参数：int[] arr
     */

    public static void PrintArray(int arr[]){
        System.out.print("[");
        for (int x=0; x<arr.length; x++){
            if (x == arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x] + ",");
            }

        }
        System.out.println("]");
    }
}
