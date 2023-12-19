package jp.co.kiramex.company.entity;

public class Sales extends Employee {
    // フィールド
    private String appointment;

    // コンストラクタ
    public Sales() {

    }

    // 引数ありコンストラクタ
    public Sales(int employeeId, String employeeName, int vitality) {
        super.setEmployeeId(employeeId);
        super.setEmployeeName(employeeName);
        super.setDivisionName("営業部");
        super.setVitality(vitality);
        this.appointment = "未定";
    }

    // 報告するメソッド
    public void report() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("今日は10件アポイント取りました。" + appointment +"です。");
    }


    @Override
    //挨拶メソッド、スーパークラスのメソッドをオーバーライド
    public void greeting() {
        super.setVitality(getVitality() - 10);
        System.out.println(super.getDivisionName() + "オバラ、の皆さん、おっはーーー。");
    }

    @Override
    //自己紹介メソッド、スーパークラスのメソッドをオーバーライド
    public void introduce() {
        super.setVitality(getVitality() - 10);
        System.out.println("私の名前は" + super.getEmployeeName() + "です");
        System.out.println("所属部署は" + super.getDivisionName() + "です");
        System.out.println("オバラ今日のアポイント先は" + appointment + "です");
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}