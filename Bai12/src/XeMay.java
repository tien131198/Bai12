/* Welcome to project
    @author: tienb
    Date: 11/6/2022
    Time: 12:18 AM
    
    ProjectName: Bai12
*/public class XeMay extends PhuongTien{
    private int congSuat;
    public XeMay(){
        super();
    }
    public XeMay(String id, String hangSX, int namSX, int giaBan, String mauXe, int congSuat) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.congSuat = congSuat;
    }
}
