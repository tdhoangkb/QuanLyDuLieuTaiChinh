package com.example.model;

public class LuuChuyenTienTeTrucTiep {
    private String kyKeToan;
    private int lctt01;     //Tiền thu từ bán hàng và cung cấp dịch vụ và doanh thu khác
    private int lctt02;     //Tiền chi trả cho người cung cấp hàng hoá dịch vụ
    private int lctt03;     //Tiền chi trả cho người lao động
    private int lctt04;     //Tiền chi trả lãi vay
    private int lctt05;     //Thuế TNDN đã nộp
    private int lctt06;     //Tiền thu khác từ hoạt động kinh doanh
    private int lctt07;     //Tiền chi khác cho hoạt động kinh doanh
    private int lctt20;     //Lưu chuyển tiền thuần từ hoạt động sản xuất kinh doanh
    private int lctt21;     //Tiền chi mua sắm, xây dựng TSCĐ và các tài sản dài hạn khác
    private int lctt22;     //Tiền thu từ thanh lý nhượng bán TSCĐ và các tài sản dài hạn khác
    private int lctt23;     //Tiền chi cho vay, mua các công cụ nợ của đơn vị khác
    private int lctt24;     //Tiền thu hồi cho vay, bán lại các công cụ nợ của đơn vị khác
    private int lctt25;     //Tiền chi đầu tư góp vốn vào đơn vị khác
    private int lctt26;     //Tiền thu hồi đầu tư góp vốn vào đơn vị khác
    private int lctt27;     //Tiền thu lãi cho vay, cổ tức và lợi nhuận được chia
    private int lctt30;     //Lưu chuyển tiền thuần từ hoạt động đầu tư
    private int lctt31;     //Tiền thu từ phát hành cổ phiếu, nhận vốn góp của chủ sở hữu
    private int lctt32;     //Tiền chi trả vốn góp cho các chủ sở hữu, mua lại cổ phiếu của các DN đã phát hành
    private int lctt33;     //Tiền thu từ đi vay
    private int lctt34;     //Tiền trả nợ gốc vay
    private int lctt35;     //Tiền trả nợ gốc thuê tài chính
    private int lctt36;     //Cổ tức, lợi nhuận đã trả cho chủ sở hữu
    private int lctt40;     //Lưu chuyển tiền thuần từ hoạt động tài chính
    private int lctt50;     //Lưu chuyển tiền thuần trong năm(50=20+30+40)
    private int lctt60;     //Tiền và tương đương tiền đầu kỳ
    private int lctt61;     //Ảnh hưởng của thay đổi tỷ giá hối đoái quy đổi ngoại tệ
    private int lctt70;     //Tiền và tương đương tiền cuối kỳ(70=50+60+61)

    public LuuChuyenTienTeTrucTiep() {
    }

    public String getKyKeToan() {
        return kyKeToan;
    }

    public void setKyKeToan(String kyKeToan) {
        this.kyKeToan = kyKeToan;
    }

    public int getLctt01() {
        return lctt01;
    }

    public void setLctt01(int lctt01) {
        this.lctt01 = lctt01;
    }

    public int getLctt02() {
        return lctt02;
    }

    public void setLctt02(int lctt02) {
        this.lctt02 = lctt02;
    }

    public int getLctt03() {
        return lctt03;
    }

    public void setLctt03(int lctt03) {
        this.lctt03 = lctt03;
    }

    public int getLctt04() {
        return lctt04;
    }

    public void setLctt04(int lctt04) {
        this.lctt04 = lctt04;
    }

    public int getLctt05() {
        return lctt05;
    }

    public void setLctt05(int lctt05) {
        this.lctt05 = lctt05;
    }

    public int getLctt06() {
        return lctt06;
    }

    public void setLctt06(int lctt06) {
        this.lctt06 = lctt06;
    }

    public int getLctt07() {
        return lctt07;
    }

    public void setLctt07(int lctt07) {
        this.lctt07 = lctt07;
    }

    public int getLctt20() {
        return lctt20;
    }

    public void setLctt20(int lctt20) {
        this.lctt20 = lctt20;
    }

    public int getLctt21() {
        return lctt21;
    }

    public void setLctt21(int lctt21) {
        this.lctt21 = lctt21;
    }

    public int getLctt22() {
        return lctt22;
    }

    public void setLctt22(int lctt22) {
        this.lctt22 = lctt22;
    }

    public int getLctt23() {
        return lctt23;
    }

    public void setLctt23(int lctt23) {
        this.lctt23 = lctt23;
    }

    public int getLctt24() {
        return lctt24;
    }

    public void setLctt24(int lctt24) {
        this.lctt24 = lctt24;
    }

    public int getLctt25() {
        return lctt25;
    }

    public void setLctt25(int lctt25) {
        this.lctt25 = lctt25;
    }

    public int getLctt26() {
        return lctt26;
    }

    public void setLctt26(int lctt26) {
        this.lctt26 = lctt26;
    }

    public int getLctt27() {
        return lctt27;
    }

    public void setLctt27(int lctt27) {
        this.lctt27 = lctt27;
    }

    public int getLctt30() {
        return lctt30;
    }

    public void setLctt30(int lctt30) {
        this.lctt30 = lctt30;
    }

    public int getLctt31() {
        return lctt31;
    }

    public void setLctt31(int lctt31) {
        this.lctt31 = lctt31;
    }

    public int getLctt32() {
        return lctt32;
    }

    public void setLctt32(int lctt32) {
        this.lctt32 = lctt32;
    }

    public int getLctt33() {
        return lctt33;
    }

    public void setLctt33(int lctt33) {
        this.lctt33 = lctt33;
    }

    public int getLctt34() {
        return lctt34;
    }

    public void setLctt34(int lctt34) {
        this.lctt34 = lctt34;
    }

    public int getLctt35() {
        return lctt35;
    }

    public void setLctt35(int lctt35) {
        this.lctt35 = lctt35;
    }

    public int getLctt36() {
        return lctt36;
    }

    public void setLctt36(int lctt36) {
        this.lctt36 = lctt36;
    }

    public int getLctt40() {
        return lctt40;
    }

    public void setLctt40(int lctt40) {
        this.lctt40 = lctt40;
    }

    public int getLctt50() {
        return lctt50=lctt20+lctt30+lctt40;
    }



    public int getLctt60() {
        return lctt60;
    }

    public void setLctt60(int lctt60) {
        this.lctt60 = lctt60;
    }

    public int getLctt61() {
        return lctt61;
    }

    public void setLctt61(int lctt61) {
        this.lctt61 = lctt61;
    }

    public int getLctt70() {
        return lctt70=lctt50+lctt60+lctt61;
    }


}
