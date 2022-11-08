import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Welcome to project
    @author: tienb
    Date: 11/6/2022
    Time: 12:26 AM
    
    ProjectName: Bai12
*/public class QuanLyPT {
    Map<String, PhuongTien> quanLyPT;
    public QuanLyPT() {
        this.quanLyPT = new HashMap<>();
    }

    public Map<String, PhuongTien> getQuanLyPT() {
        return quanLyPT;
    }

    public void setQuanLyPT(Map<String, PhuongTien> quanLyPT) {
        this.quanLyPT = quanLyPT;
    }
    // Nhap phuong tien tu ban phim

    // Them phuong tien
    public void themPT(PhuongTien phuongTien){
        quanLyPT.put(phuongTien.id, phuongTien);
    }
    // kiem tra phuong tien co ton tai
    public PhuongTien tonTaiPT(String id){
        PhuongTien phuongTien = this.quanLyPT.entrySet().stream()
                .filter(o->o.getKey().equals(id))
                .map(Map.Entry::getValue)
                .findFirst().orElse(null);
        if (phuongTien == null){
            return null;
        }else {
            return phuongTien;
        }
    }
    // xoa phuong tien
    public boolean xoaPhuongTien(String id){
        if (tonTaiPT(id) == null){
            System.out.println("Khong ton tai phuong tien");
            return false;
        }else{
            quanLyPT.remove(id);
            return true;
        }
    }
    // Tim phuong tien theo hang
    public List<PhuongTien> timPTTheoHang(String hangSX){
        List<PhuongTien> danhSachPT = this.quanLyPT.entrySet().stream()
                .filter(o->o.getValue().getHangSX().equals(hangSX))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return new ArrayList<>(danhSachPT);
    }
    // Tim phuong tien theo mau
    public List<PhuongTien> timPTTheoMau(String mauXe){
        List<PhuongTien> danhSachPT = this.quanLyPT.entrySet().stream()
                .filter(o->o.getValue().getMauXe().equals(mauXe))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return new ArrayList<>(danhSachPT);
    }
}
