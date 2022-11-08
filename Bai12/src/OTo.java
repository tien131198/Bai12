/* Welcome to project
    @author: tienb
    Date: 11/6/2022
    Time: 12:18 AM
    
    ProjectName: Bai12
*/public class OTo extends PhuongTien{
    private int soChoNgoi;
    private String kieuDongCo;

    public OTo() {
        super();
    }

    public OTo(String id, String hangSX, int namSX, int giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
}
