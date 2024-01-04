public class Teacher {
    private String fName;
    private String lName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String aFName, String aLName, String aSubject, int aYears){
        this.fName = aFName;
        this.lName = aLName;
        this.subject = aSubject;
        this.yearsTeaching = aYears;
    }

    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
    public String getSubject(){
        return subject;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }
    public void setfName(String afName){
        this.fName = afName;
    }
    public void setlName(String alName){
        this.lName = alName;
    }
    public void setSubject(String aSubject){
        this.subject = aSubject;
    }
    public void setYearsTeaching(int aYears){
        this.yearsTeaching = aYears;
    }
}
