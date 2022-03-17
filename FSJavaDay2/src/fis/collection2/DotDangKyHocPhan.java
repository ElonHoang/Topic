package fis.collection2;

import java.util.*;
import java.util.stream.Collectors;

public class DotDangKyHocPhan {
    private String ma;
    private Calendar ngayBatDau;
    private Calendar ngayKetThuc;
    private List<PhieuDangKyHocPhan> dsPhieuDangKy = new ArrayList<PhieuDangKyHocPhan>();
    private List<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
    public DotDangKyHocPhan(String ma, Calendar ngayBatDau, Calendar ngayKetThuc){
        this.ma = ma;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }
    
    //Cau 3: Lay ra danh sach sinh vien dang ky nhieu mon hoc nhat
    //Chu y : chi quan tam den nhung phieu dang ky hop le
    public List<SinhVien> getDsSinhVien(MonHoc monHoc){
    	List<SinhVien> sv;
//    	if(monHoc != null) {
//   	 		dsPhieuDangKy.stream()
//   	 							.filter(t -> t.laHopLe())
//   	 							.sorted(Comparator.comparing(t -> t.));
//    	}
    	return null;
       // return sv;
    }

    //Cau 4:Lay ra danh sach cac mon hoc co the mo lop. Mon do co the mo lop
    //khi so luong dang ky hoc mon hoc do lon hon hoac bang soSinhVienToiThieu
    //Chu y : chi quan tam den nhung phieu dang ky hop le
    public List<MonHoc> getDsMonHoc(int soSinhVienToiThieu){
        return null;
    }

    public void themPhieuDangKyHocPhan(PhieuDangKyHocPhan phieuDangKyHocPhan) {
        this.dsPhieuDangKy.add(phieuDangKyHocPhan);
    }
}
