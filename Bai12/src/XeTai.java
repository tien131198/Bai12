/* Welcome to project
    @author: tienb
    Date: 11/6/2022
    Time: 12:18 AM
    
    ProjectName: Bai12
*/public class XeTai extends PhuongTien{
    private int TrongTai;
    public XeTai(){
        super();
    }
    public XeTai(String id, String hangSX, int namSX, int giaBan, String mauXe, int trongTai) {
        super(id, hangSX, namSX, giaBan, mauXe);
        TrongTai = trongTai;
    }

}
