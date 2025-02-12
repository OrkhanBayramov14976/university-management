public class AcademicDetails {
    // fields
    private String level;
    private String program;
    private String division;
    private String major;
    private int catalogYear;

    // constructor
    public AcademicDetails(String level, String program, String division, String major, int catalogYear){
        this.level = level;
        this.program = program;
        this.division = division;
        this.major = major;
        this.catalogYear = catalogYear;
    }

    // getter methods
    public String getLevel(){
        return level;
    }
    public String getProgram(){
        return program;
    }
    public String getDivision(){
        return division;
    }
    public String getMajor(){
        return major;
    }
    public int getCatalogYear(){
        return catalogYear;
    }

    // setter methods
    public void setLevel(String level) {
        this.level = level;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setCatalogYear(int catalogYear) {
        this.catalogYear = catalogYear;
    }

    @Override
    public String toString() {
        return "Level: " + level + "\nProgram: " + program + "\nDivision: " + division + "\nMajor: " + major + "\nCatalog Year: " + catalogYear;
    }

    
}
