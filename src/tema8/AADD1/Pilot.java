package tema8.AADD1;

public class Pilot {
    private int driverid;
    private String code;
    private String forename;
    private String surname;
    private String dob;
    private String nationally;
    private String url;

    private final int DEFAULT_DRIVERID = 1;
    private final String DEFAULT_CODE = "DAN";
    private final String DEFAULT_FORENAME = "Daniel";
    private final String DEFAULT_SURNAME = "Barberá";
    private final String DEFAULT_DOB = "01-03-2006";
    private final String DEFAULT_NATIONALLY = "Spanish";
    private final String DEFAULT_URL = "http://en.wikipedia.org/wiki/Daniel_Barbera";

    public Pilot(int driverid, String code, String forename, String surname, String dob, String nationally, String url) {
        this.driverid = driverid;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationally = nationally;
        this.url = url;
    }
    public Pilot (){
        this.driverid = DEFAULT_DRIVERID;
        this.code = DEFAULT_CODE;
        this.forename = DEFAULT_FORENAME;
        this.surname = DEFAULT_SURNAME;
        this.dob = DEFAULT_DOB;
        this.nationally = DEFAULT_NATIONALLY;
        this.url = DEFAULT_URL;
    }

    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationally() {
        return nationally;
    }

    public void setNationally(String nationally) {
        this.nationally = nationally;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString(){
        return "\nId piloto: "+ driverid+", Code: "+code +", Forename: "+forename+", Surname: " +surname+", DOB: "+dob+", Nationally: "+nationally+", URL: "+url;
    }
}
