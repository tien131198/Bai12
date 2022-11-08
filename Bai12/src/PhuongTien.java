/* Welcome to project
    @author: tienb
    Date: 11/6/2022
    Time: 12:18 AM
    
    ProjectName: Bai12
*/public class PhuongTien {
    protected String id;
    protected String hangSX;
    protected int namSX;
    protected int giaBan;
    protected String mauXe;

    public PhuongTien() {
    }

    public PhuongTien(String id, String hangSX, int namSX, int giaBan, String mauXe) {
        this.id = id;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }
}
