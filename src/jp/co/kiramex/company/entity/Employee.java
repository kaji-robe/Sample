package jp.co.kiramex.company.entity;

public class Employee {
    //フィールド
    private String employeeName; //　社員名
    private String divisionName; //　部署名
    private int vitality; //　体力

    //コンストラクタ
    public Employee() {
    }

    //引数有りのコンストラクタ
    public Employee(String employeeName, String divisionName, int vitality) {
        System.out.println("初期化時に引数有りのコンストラクタが呼び出されました");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    public String getEmployeeName() {   //getterの名前は get + フィールド名
        return employeeName;            //return フィールド名
    }

    public void setEmployeeName(String employeeName) {  //setterの名前は set + フィールド名
        this.employeeName = employeeName;               //return フィールド名の代入
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getVitarity() {
        return vitality;
            }

    public void setVitality(int vitality) {
        this.vitality = vitality;


    }

}
