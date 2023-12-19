package jp.co.kiramex.company.entity;

public class GetterSetterSample {

    public static void main(String[] args) {
        Employee employee = new Employee();

        //employee.employeeName = "大島"; カプセル化でコンパイルエラー
        
        //setterを経由して、値を設定
        employee.setEmployeeName("大島");

        //getterを経由して、値を取得
        String empName = employee.getEmployeeName();
        
        //結果出力
        System.out.println(empName); 

     }
}