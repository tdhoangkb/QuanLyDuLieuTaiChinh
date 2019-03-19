package com.example.model;

public class ChiSoTaiChinh {
    //Nhóm chỉ số định giá
    private int eps;
    private int bvps;
    private int pe;
    private int pb;
    private int ps;
    private int tySuatCoTuc;
    private int beta;
    private int epsDC;
    private int bvpsDC;
    private int peDC;
    private int pbDC;
    private int ev_ebit;
    private int ev_ebitda;
    //Nhóm chỉ số sinh lợi
    private int tySuatLoiNhuanGopbien;
    private int ebit;
    private int ebitda;
    private int tySuatLoiNhuanTrenDTThuan;
    private int ROEA;
    private int ROCE;
    private int ROAA;
    //Nhóm chỉ số tăng trưởng
    private int tangTruongDTThuan;
    private int tangTruongLNGop;
    private int tangTruongLNTThue;
    private int tangTruongLNSTCDCongTyMe;
    private int tangTruongTongTS;
    private int tangTruongNoDaiHan;
    private int tangTruongNoPhaiTra;
    private int tangTruongVCSH;
    private int tangTruongVonDieuLe;
    //Nhóm chỉ số thanh khoản
    private int tySoThanhToanTienMat;
    private int tySoThanhToanNhanh;
    private int tySoThanhToanNhanhLoaiTruHTK_PTNH;
    private int tySoThanhToanHienHanh;
    private int khaNangThanhToanLaiVay;
    //Nhóm chỉ số hiệu quả hoạt động
    private int vongQuayPhaiThuKH;
    private int thoiGianThuTienKHBinhQuan;
    private int vongQuayHangTonKho;
    private int thoiGianTonKhoBinhQuan;
    private int vongQuayPhaiTraNhaCungCap;
    private int thoiGianTraTienKHBinhQuan;
    private int vongQuayTSCD;
    private int vongQuayTongTS;
    private int vongQuayVonChuSoHuu;
    //Nhóm chỉ số đòn bẩy tài chính
    private int tySoNoNganHanTrenTongNoPhaiTra;
    private int tySoNoVayTrenTongTS;
    private int tySoNoTrenTongTS;
    private int tySoVonCSHTrenTongTS;
    private int tySoNoNganHanTrenVCSH;
    private int tySoNoVayTrenVCSH;
    private int tySoNoTrenVCSH;
    //Nhóm chỉ số dòng tiền
    private int tySoDongTienHDKDTrenDTT;
    private int khaNangChiTraNoNHTuDongTienHDKD;
    private int khaNangChiTraNoNHTuLuuChuyenTienThuanTrongKy;
    private int tyLeDonTich_PP_CDKT;
    private int tyLeDonTich_PP_DongTien;
    private int dongTienTuHDKDTrenTongTS;
    private int dongTienTuHDKDTrenVonCSH;
    private int dongTientuHDKDTrenLNThuanTuHDKD;
    private int khaNangThanhToanNoTuDongTienHDKD;
    private int dongTienTuHDKDTrenMoiCP;
    //Cơ cấu chi phí
    private int giaVonHangBanTrenDTThuan;
    private int chiPhiBanHangTrenDTThuan;
    private int chiPhiQLDoanhNghiepTrenDTThuan;
    private int chiPhiLaiVayTrenDTThuan;
    //Cơ cấu tài sản ngắn hạn
    private int taiSanNHTrenTongTS;
    private int tienTrenTSNganHan;
    private int dauTuTCNganHanTrenTSNganHan;
    private int phaiThuNganHanTrenTSNganHan;
    private int hangTonKhoTrenTSNganHan;
    private int taiSanNHKhacTrenTSNganHan;
    //Cơ cấu tài sản dài hạn
    private int taiSanDaihanTrenTongTS;
    private int taiSanCoDinhTrenTongTS;
    private int taiSanCoDinhHHTrenTSCoDinh;
    private int taiSanThueTaiChinhTrenTSCoDinh;
    private int taiSanVoHinhTrenTSCoDinh;
    private int xDCBDDTrenTSCoDinh;

    KetQuaKinhDoanh kqkd=new KetQuaKinhDoanh();

    public ChiSoTaiChinh() {
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public int getBvps() {
        return bvps;
    }

    public void setBvps(int bvps) {
        this.bvps = bvps;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPb() {
        return pb;
    }

    public void setPb(int pb) {
        this.pb = pb;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getTySuatCoTuc() {
        return tySuatCoTuc;
    }

    public void setTySuatCoTuc(int tySuatCoTuc) {
        this.tySuatCoTuc = tySuatCoTuc;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getEpsDC() {
        return epsDC;
    }

    public void setEpsDC(int epsDC) {
        this.epsDC = epsDC;
    }

    public int getBvpsDC() {
        return bvpsDC;
    }

    public void setBvpsDC(int bvpsDC) {
        this.bvpsDC = bvpsDC;
    }

    public int getPeDC() {
        return peDC;
    }

    public void setPeDC(int peDC) {
        this.peDC = peDC;
    }

    public int getPbDC() {
        return pbDC;
    }

    public void setPbDC(int pbDC) {
        this.pbDC = pbDC;
    }

    public int getEv_ebit() {
        return ev_ebit;
    }

    public void setEv_ebit(int ev_ebit) {
        this.ev_ebit = ev_ebit;
    }

    public int getEv_ebitda() {
        return ev_ebitda;
    }

    public void setEv_ebitda(int ev_ebitda) {
        this.ev_ebitda = ev_ebitda;
    }

    public int getTySuatLoiNhuanGopbien() {
        return tySuatLoiNhuanGopbien;
    }

    public void setTySuatLoiNhuanGopbien(int tySuatLoiNhuanGopbien) {
        this.tySuatLoiNhuanGopbien = tySuatLoiNhuanGopbien;
    }

    public int getEbit() {
        return ebit;
    }

    public void setEbit(int ebit) {
        this.ebit = ebit;
    }

    public int getEbitda() {
        return ebitda;
    }

    public void setEbitda(int ebitda) {
        this.ebitda = ebitda;
    }

    public int getTySuatLoiNhuanTrenDTThuan() {
        return tySuatLoiNhuanTrenDTThuan;
    }

    public void setTySuatLoiNhuanTrenDTThuan(int tySuatLoiNhuanTrenDTThuan) {
        this.tySuatLoiNhuanTrenDTThuan = tySuatLoiNhuanTrenDTThuan;
    }

    public int getROEA() {
        return ROEA;
    }

    public void setROEA(int ROEA) {
        this.ROEA = ROEA;
    }

    public int getROCE() {
        return ROCE;
    }

    public void setROCE(int ROCE) {
        this.ROCE = ROCE;
    }

    public int getROAA() {
        return ROAA;
    }

    public void setROAA(int ROAA) {
        this.ROAA = ROAA;
    }

    public int getTangTruongDTThuan() {
        return tangTruongDTThuan;
    }

    public void setTangTruongDTThuan(int tangTruongDTThuan) {
        this.tangTruongDTThuan = tangTruongDTThuan;
    }

    public int getTangTruongLNGop() {
        return tangTruongLNGop;
    }

    public void setTangTruongLNGop(int tangTruongLNGop) {
        this.tangTruongLNGop = tangTruongLNGop;
    }

    public int getTangTruongLNTThue() {
        return tangTruongLNTThue;
    }

    public void setTangTruongLNTThue(int tangTruongLNTThue) {
        this.tangTruongLNTThue = tangTruongLNTThue;
    }

    public int getTangTruongLNSTCDCongTyMe() {
        return tangTruongLNSTCDCongTyMe;
    }

    public void setTangTruongLNSTCDCongTyMe(int tangTruongLNSTCDCongTyMe) {
        this.tangTruongLNSTCDCongTyMe = tangTruongLNSTCDCongTyMe;
    }

    public int getTangTruongTongTS() {
        return tangTruongTongTS;
    }

    public void setTangTruongTongTS(int tangTruongTongTS) {
        this.tangTruongTongTS = tangTruongTongTS;
    }

    public int getTangTruongNoDaiHan() {
        return tangTruongNoDaiHan;
    }

    public void setTangTruongNoDaiHan(int tangTruongNoDaiHan) {
        this.tangTruongNoDaiHan = tangTruongNoDaiHan;
    }

    public int getTangTruongNoPhaiTra() {
        return tangTruongNoPhaiTra;
    }

    public void setTangTruongNoPhaiTra(int tangTruongNoPhaiTra) {
        this.tangTruongNoPhaiTra = tangTruongNoPhaiTra;
    }

    public int getTangTruongVCSH() {
        return tangTruongVCSH;
    }

    public void setTangTruongVCSH(int tangTruongVCSH) {
        this.tangTruongVCSH = tangTruongVCSH;
    }

    public int getTangTruongVonDieuLe() {
        return tangTruongVonDieuLe;
    }

    public void setTangTruongVonDieuLe(int tangTruongVonDieuLe) {
        this.tangTruongVonDieuLe = tangTruongVonDieuLe;
    }

    public int getTySoThanhToanTienMat() {
        return tySoThanhToanTienMat;
    }

    public void setTySoThanhToanTienMat(int tySoThanhToanTienMat) {
        this.tySoThanhToanTienMat = tySoThanhToanTienMat;
    }

    public int getTySoThanhToanNhanh() {
        return tySoThanhToanNhanh;
    }

    public void setTySoThanhToanNhanh(int tySoThanhToanNhanh) {
        this.tySoThanhToanNhanh = tySoThanhToanNhanh;
    }

    public int getTySoThanhToanNhanhLoaiTruHTK_PTNH() {
        return tySoThanhToanNhanhLoaiTruHTK_PTNH;
    }

    public void setTySoThanhToanNhanhLoaiTruHTK_PTNH(int tySoThanhToanNhanhLoaiTruHTK_PTNH) {
        this.tySoThanhToanNhanhLoaiTruHTK_PTNH = tySoThanhToanNhanhLoaiTruHTK_PTNH;
    }

    public int getTySoThanhToanHienHanh() {
        return tySoThanhToanHienHanh;
    }

    public void setTySoThanhToanHienHanh(int tySoThanhToanHienHanh) {
        this.tySoThanhToanHienHanh = tySoThanhToanHienHanh;
    }

    public int getKhaNangThanhToanLaiVay() {
        return khaNangThanhToanLaiVay;
    }

    public void setKhaNangThanhToanLaiVay(int khaNangThanhToanLaiVay) {
        this.khaNangThanhToanLaiVay = khaNangThanhToanLaiVay;
    }

    public int getVongQuayPhaiThuKH() {
        return vongQuayPhaiThuKH;
    }

    public void setVongQuayPhaiThuKH(int vongQuayPhaiThuKH) {
        this.vongQuayPhaiThuKH = vongQuayPhaiThuKH;
    }

    public int getThoiGianThuTienKHBinhQuan() {
        return thoiGianThuTienKHBinhQuan;
    }

    public void setThoiGianThuTienKHBinhQuan(int thoiGianThuTienKHBinhQuan) {
        this.thoiGianThuTienKHBinhQuan = thoiGianThuTienKHBinhQuan;
    }

    public int getVongQuayHangTonKho() {
        return vongQuayHangTonKho;
    }

    public void setVongQuayHangTonKho(int vongQuayHangTonKho) {
        this.vongQuayHangTonKho = vongQuayHangTonKho;
    }

    public int getThoiGianTonKhoBinhQuan() {
        return thoiGianTonKhoBinhQuan;
    }

    public void setThoiGianTonKhoBinhQuan(int thoiGianTonKhoBinhQuan) {
        this.thoiGianTonKhoBinhQuan = thoiGianTonKhoBinhQuan;
    }

    public int getVongQuayPhaiTraNhaCungCap() {
        return vongQuayPhaiTraNhaCungCap;
    }

    public void setVongQuayPhaiTraNhaCungCap(int vongQuayPhaiTraNhaCungCap) {
        this.vongQuayPhaiTraNhaCungCap = vongQuayPhaiTraNhaCungCap;
    }

    public int getThoiGianTraTienKHBinhQuan() {
        return thoiGianTraTienKHBinhQuan;
    }

    public void setThoiGianTraTienKHBinhQuan(int thoiGianTraTienKHBinhQuan) {
        this.thoiGianTraTienKHBinhQuan = thoiGianTraTienKHBinhQuan;
    }

    public int getVongQuayTSCD() {
        return vongQuayTSCD;
    }

    public void setVongQuayTSCD(int vongQuayTSCD) {
        this.vongQuayTSCD = vongQuayTSCD;
    }

    public int getVongQuayTongTS() {
        return vongQuayTongTS;
    }

    public void setVongQuayTongTS(int vongQuayTongTS) {
        this.vongQuayTongTS = vongQuayTongTS;
    }

    public int getVongQuayVonChuSoHuu() {
        return vongQuayVonChuSoHuu;
    }

    public void setVongQuayVonChuSoHuu(int vongQuayVonChuSoHuu) {
        this.vongQuayVonChuSoHuu = vongQuayVonChuSoHuu;
    }

    public int getTySoNoNganHanTrenTongNoPhaiTra() {
        return tySoNoNganHanTrenTongNoPhaiTra;
    }

    public void setTySoNoNganHanTrenTongNoPhaiTra(int tySoNoNganHanTrenTongNoPhaiTra) {
        this.tySoNoNganHanTrenTongNoPhaiTra = tySoNoNganHanTrenTongNoPhaiTra;
    }

    public int getTySoNoVayTrenTongTS() {
        return tySoNoVayTrenTongTS;
    }

    public void setTySoNoVayTrenTongTS(int tySoNoVayTrenTongTS) {
        this.tySoNoVayTrenTongTS = tySoNoVayTrenTongTS;
    }

    public int getTySoNoTrenTongTS() {
        return tySoNoTrenTongTS;
    }

    public void setTySoNoTrenTongTS(int tySoNoTrenTongTS) {
        this.tySoNoTrenTongTS = tySoNoTrenTongTS;
    }

    public int getTySoVonCSHTrenTongTS() {
        return tySoVonCSHTrenTongTS;
    }

    public void setTySoVonCSHTrenTongTS(int tySoVonCSHTrenTongTS) {
        this.tySoVonCSHTrenTongTS = tySoVonCSHTrenTongTS;
    }

    public int getTySoNoNganHanTrenVCSH() {
        return tySoNoNganHanTrenVCSH;
    }

    public void setTySoNoNganHanTrenVCSH(int tySoNoNganHanTrenVCSH) {
        this.tySoNoNganHanTrenVCSH = tySoNoNganHanTrenVCSH;
    }

    public int getTySoNoVayTrenVCSH() {
        return tySoNoVayTrenVCSH;
    }

    public void setTySoNoVayTrenVCSH(int tySoNoVayTrenVCSH) {
        this.tySoNoVayTrenVCSH = tySoNoVayTrenVCSH;
    }

    public int getTySoNoTrenVCSH() {
        return tySoNoTrenVCSH;
    }

    public void setTySoNoTrenVCSH(int tySoNoTrenVCSH) {
        this.tySoNoTrenVCSH = tySoNoTrenVCSH;
    }

    public int getTySoDongTienHDKDTrenDTT() {
        return tySoDongTienHDKDTrenDTT;
    }

    public void setTySoDongTienHDKDTrenDTT(int tySoDongTienHDKDTrenDTT) {
        this.tySoDongTienHDKDTrenDTT = tySoDongTienHDKDTrenDTT;
    }

    public int getKhaNangChiTraNoNHTuDongTienHDKD() {
        return khaNangChiTraNoNHTuDongTienHDKD;
    }

    public void setKhaNangChiTraNoNHTuDongTienHDKD(int khaNangChiTraNoNHTuDongTienHDKD) {
        this.khaNangChiTraNoNHTuDongTienHDKD = khaNangChiTraNoNHTuDongTienHDKD;
    }

    public int getKhaNangChiTraNoNHTuLuuChuyenTienThuanTrongKy() {
        return khaNangChiTraNoNHTuLuuChuyenTienThuanTrongKy;
    }

    public void setKhaNangChiTraNoNHTuLuuChuyenTienThuanTrongKy(int khaNangChiTraNoNHTuLuuChuyenTienThuanTrongKy) {
        this.khaNangChiTraNoNHTuLuuChuyenTienThuanTrongKy = khaNangChiTraNoNHTuLuuChuyenTienThuanTrongKy;
    }

    public int getTyLeDonTich_PP_CDKT() {
        return tyLeDonTich_PP_CDKT;
    }

    public void setTyLeDonTich_PP_CDKT(int tyLeDonTich_PP_CDKT) {
        this.tyLeDonTich_PP_CDKT = tyLeDonTich_PP_CDKT;
    }

    public int getTyLeDonTich_PP_DongTien() {
        return tyLeDonTich_PP_DongTien;
    }

    public void setTyLeDonTich_PP_DongTien(int tyLeDonTich_PP_DongTien) {
        this.tyLeDonTich_PP_DongTien = tyLeDonTich_PP_DongTien;
    }

    public int getDongTienTuHDKDTrenTongTS() {
        return dongTienTuHDKDTrenTongTS;
    }

    public void setDongTienTuHDKDTrenTongTS(int dongTienTuHDKDTrenTongTS) {
        this.dongTienTuHDKDTrenTongTS = dongTienTuHDKDTrenTongTS;
    }

    public int getDongTienTuHDKDTrenVonCSH() {
        return dongTienTuHDKDTrenVonCSH;
    }

    public void setDongTienTuHDKDTrenVonCSH(int dongTienTuHDKDTrenVonCSH) {
        this.dongTienTuHDKDTrenVonCSH = dongTienTuHDKDTrenVonCSH;
    }

    public int getDongTientuHDKDTrenLNThuanTuHDKD() {
        return dongTientuHDKDTrenLNThuanTuHDKD;
    }

    public void setDongTientuHDKDTrenLNThuanTuHDKD(int dongTientuHDKDTrenLNThuanTuHDKD) {
        this.dongTientuHDKDTrenLNThuanTuHDKD = dongTientuHDKDTrenLNThuanTuHDKD;
    }

    public int getKhaNangThanhToanNoTuDongTienHDKD() {
        return khaNangThanhToanNoTuDongTienHDKD;
    }

    public void setKhaNangThanhToanNoTuDongTienHDKD(int khaNangThanhToanNoTuDongTienHDKD) {
        this.khaNangThanhToanNoTuDongTienHDKD = khaNangThanhToanNoTuDongTienHDKD;
    }

    public int getDongTienTuHDKDTrenMoiCP() {
        return dongTienTuHDKDTrenMoiCP;
    }

    public void setDongTienTuHDKDTrenMoiCP(int dongTienTuHDKDTrenMoiCP) {
        this.dongTienTuHDKDTrenMoiCP = dongTienTuHDKDTrenMoiCP;
    }

    public int getGiaVonHangBanTrenDTThuan() {
        return giaVonHangBanTrenDTThuan;
    }

    public void setGiaVonHangBanTrenDTThuan(int giaVonHangBanTrenDTThuan) {
        this.giaVonHangBanTrenDTThuan = giaVonHangBanTrenDTThuan;
    }

    public int getChiPhiBanHangTrenDTThuan() {
        return chiPhiBanHangTrenDTThuan;
    }

    public void setChiPhiBanHangTrenDTThuan(int chiPhiBanHangTrenDTThuan) {
        this.chiPhiBanHangTrenDTThuan = chiPhiBanHangTrenDTThuan;
    }

    public int getChiPhiQLDoanhNghiepTrenDTThuan() {
        return chiPhiQLDoanhNghiepTrenDTThuan;
    }

    public void setChiPhiQLDoanhNghiepTrenDTThuan(int chiPhiQLDoanhNghiepTrenDTThuan) {
        this.chiPhiQLDoanhNghiepTrenDTThuan = chiPhiQLDoanhNghiepTrenDTThuan;
    }

    public int getChiPhiLaiVayTrenDTThuan() {
        return chiPhiLaiVayTrenDTThuan;
    }

    public void setChiPhiLaiVayTrenDTThuan(int chiPhiLaiVayTrenDTThuan) {
        this.chiPhiLaiVayTrenDTThuan = chiPhiLaiVayTrenDTThuan;
    }

    public int getTaiSanNHTrenTongTS() {
        return taiSanNHTrenTongTS;
    }

    public void setTaiSanNHTrenTongTS(int taiSanNHTrenTongTS) {
        this.taiSanNHTrenTongTS = taiSanNHTrenTongTS;
    }

    public int getTienTrenTSNganHan() {
        return tienTrenTSNganHan;
    }

    public void setTienTrenTSNganHan(int tienTrenTSNganHan) {
        this.tienTrenTSNganHan = tienTrenTSNganHan;
    }

    public int getDauTuTCNganHanTrenTSNganHan() {
        return dauTuTCNganHanTrenTSNganHan;
    }

    public void setDauTuTCNganHanTrenTSNganHan(int dauTuTCNganHanTrenTSNganHan) {
        this.dauTuTCNganHanTrenTSNganHan = dauTuTCNganHanTrenTSNganHan;
    }

    public int getPhaiThuNganHanTrenTSNganHan() {
        return phaiThuNganHanTrenTSNganHan;
    }

    public void setPhaiThuNganHanTrenTSNganHan(int phaiThuNganHanTrenTSNganHan) {
        this.phaiThuNganHanTrenTSNganHan = phaiThuNganHanTrenTSNganHan;
    }

    public int getHangTonKhoTrenTSNganHan() {
        return hangTonKhoTrenTSNganHan;
    }

    public void setHangTonKhoTrenTSNganHan(int hangTonKhoTrenTSNganHan) {
        this.hangTonKhoTrenTSNganHan = hangTonKhoTrenTSNganHan;
    }

    public int getTaiSanNHKhacTrenTSNganHan() {
        return taiSanNHKhacTrenTSNganHan;
    }

    public void setTaiSanNHKhacTrenTSNganHan(int taiSanNHKhacTrenTSNganHan) {
        this.taiSanNHKhacTrenTSNganHan = taiSanNHKhacTrenTSNganHan;
    }

    public int getTaiSanDaihanTrenTongTS() {
        return taiSanDaihanTrenTongTS;
    }

    public void setTaiSanDaihanTrenTongTS(int taiSanDaihanTrenTongTS) {
        this.taiSanDaihanTrenTongTS = taiSanDaihanTrenTongTS;
    }

    public int getTaiSanCoDinhTrenTongTS() {
        return taiSanCoDinhTrenTongTS;
    }

    public void setTaiSanCoDinhTrenTongTS(int taiSanCoDinhTrenTongTS) {
        this.taiSanCoDinhTrenTongTS = taiSanCoDinhTrenTongTS;
    }

    public int getTaiSanCoDinhHHTrenTSCoDinh() {
        return taiSanCoDinhHHTrenTSCoDinh;
    }

    public void setTaiSanCoDinhHHTrenTSCoDinh(int taiSanCoDinhHHTrenTSCoDinh) {
        this.taiSanCoDinhHHTrenTSCoDinh = taiSanCoDinhHHTrenTSCoDinh;
    }

    public int getTaiSanThueTaiChinhTrenTSCoDinh() {
        return taiSanThueTaiChinhTrenTSCoDinh;
    }

    public void setTaiSanThueTaiChinhTrenTSCoDinh(int taiSanThueTaiChinhTrenTSCoDinh) {
        this.taiSanThueTaiChinhTrenTSCoDinh = taiSanThueTaiChinhTrenTSCoDinh;
    }

    public int getTaiSanVoHinhTrenTSCoDinh() {
        return taiSanVoHinhTrenTSCoDinh;
    }

    public void setTaiSanVoHinhTrenTSCoDinh(int taiSanVoHinhTrenTSCoDinh) {
        this.taiSanVoHinhTrenTSCoDinh = taiSanVoHinhTrenTSCoDinh;
    }

    public int getxDCBDDTrenTSCoDinh() {
        return xDCBDDTrenTSCoDinh;
    }

    public void setxDCBDDTrenTSCoDinh(int xDCBDDTrenTSCoDinh) {
        this.xDCBDDTrenTSCoDinh = xDCBDDTrenTSCoDinh;
    }
}
