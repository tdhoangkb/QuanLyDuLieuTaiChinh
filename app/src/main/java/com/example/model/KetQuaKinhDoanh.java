package com.example.model;

public class KetQuaKinhDoanh {
    private String quy;
    private String nam;
    private int tk01;       //Doanh thu bán hàng và cung cấp dịch vụ
    private int tk02;       //Các khoản giảm trừ doanh thu
    private int tk10;       //Doanh thu thuần về bán hàng và cung cấp dịch vụ (10=01-02)
    private int tk11;       //Giá vốn hàng bán
    private int tk20;       //Lợi nhuận gộp về bán hàng và cung cấp dịch vụ (20=10-11)
    private int tk21;       //Doanh thu hoạt động tài chính
    private int tk22;       //Chi phí tài chính
    private int tk23;       //Chi phí lãi vay
    private int tk25;       //Chi phí bán hàng
    private int tk26;       //Chi phí quản lý doanh nghiệp
    private int tk30;       //Lợi nhuận thuần từ hoạt động kinh doanh(30=20+21-25-26)
    private int tk31;       //Thu nhập khác
    private int tk32;       //Chi phí khác
    private int tk40;       //Lợi nhuận khác
    private int tk50;       //Tổng lợi nhuận kế toán trước thuế (50=30+40)
    private int tk51;       //Chi phí thuế TNDN hiện hành
    private int tk52;       //Chí phí thuế TNDN hoãn lại
    private int tk60;       // Lợi nhuận sau thuế thu nhập doanh nghiệp (60=50-51-52)
    private int tk70;       //Lãi cơ bản trên cổ phiếu
    private int tk71;       //Lãi suy giảm trên cổ phiếu



    public KetQuaKinhDoanh() {
    }

    public String getQuy() {
        return quy;
    }

    public void setQuy(String quy) {
        this.quy = quy;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getTk01() {
        return tk01;
    }

    public void setTk01(int tk01) {
        this.tk01 = tk01;
    }

    public int getTk02() {
        return tk02;
    }

    public void setTk02(int tk02) {
        this.tk02 = tk02;
    }

    public int getTk10() {
        return tk01-tk02;
    }


    public int getTk11() {
        return tk11;
    }

    public void setTk11(int tk11) {
        this.tk11 = tk11;
    }

    public int getTk20() {
        return tk10-tk11;
    }


    public int getTk21() {
        return tk21;
    }

    public void setTk21(int tk21) {
        this.tk21 = tk21;
    }

    public int getTk22() {
        return tk22;
    }

    public void setTk22(int tk22) {
        this.tk22 = tk22;
    }

    public int getTk23() {
        return tk23;
    }

    public void setTk23(int tk23) {
        this.tk23 = tk23;
    }

    public int getTk25() {
        return tk25;
    }

    public void setTk25(int tk25) {
        this.tk25 = tk25;
    }

    public int getTk26() {
        return tk26;
    }

    public void setTk26(int tk26) {
        this.tk26 = tk26;
    }

    public int getTk30() {
        return tk20+tk21-tk25-tk26;
    }
    public int getTk31() {
        return tk31;
    }

    public void setTk31(int tk31) {
        this.tk31 = tk31;
    }

    public int getTk32() {
        return tk32;
    }

    public void setTk32(int tk32) {
        this.tk32 = tk32;
    }

    public int getTk40() {
        return tk31-tk32;
    }

    public int getTk50() {
        return tk30+tk40;
    }


    public int getTk51() {
        return tk51;
    }

    public void setTk51(int tk51) {
        this.tk51 = tk51;
    }

    public int getTk52() {
        return tk52;
    }

    public void setTk52(int tk52) {
        this.tk52 = tk52;
    }

    public int getTk60() {
        return tk50-tk51-tk52;
    }



    public int getTk70() {
        return tk70;
    }

    public void setTk70(int tk70) {
        this.tk70 = tk70;
    }

    public int getTk71() {
        return tk71;
    }

    public void setTk71(int tk71) {
        this.tk71 = tk71;
    }
}
