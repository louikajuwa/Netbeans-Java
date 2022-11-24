package prkng;

public class Cars {
    private String PlateNumber;
    private String Month;
    private String Day;
    private String Time;
    private String Out;
    
    public Cars(String PlateNumber,String Month,String Day,String Time,String Out) {
        this.PlateNumber = PlateNumber;
        this.Month = Month;
        this.Day = Day;
        this.Time = Time;
        this.Out = Out;
    }

    Cars(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getPlateNumber() {
        return PlateNumber;
    }
    public String getMonth() {
        return Month;
    }
    public String getDay() {
        return Day;
    }
    public String getTime() {
        return Time;
    }
    
    public String getOut() {
        return Out;
    }
}
