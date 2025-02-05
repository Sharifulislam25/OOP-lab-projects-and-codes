//Assignment Name: Create two classes: Company and Main. 
//Your ID : 232-15-916
//Batch : Spring_25
//Submission Date :06/02/25

class Company {
    private int companyId;
    private String companyName;
    private int establishedYear;
    private String ceoName;

    // Constructor
    public Company(int companyId, String companyName, int establishedYear, String ceoName) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.establishedYear = establishedYear;
        this.ceoName = ceoName;
    }

    // Setter methods
    public void setCompanyId(int id) {
        this.companyId = id;
    }

    public void setCompanyName(String name) {
        this.companyName = name;
    }

    public void setEstablishedYear(int year) {
        this.establishedYear = year;
    }

    public void setCeoName(String ceo) {
        this.ceoName = ceo;
    }

    // Getter methods
    public int getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public String getCeoName() {
        return ceoName;
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of Company
        Company tiktok = new Company(101, "TikTok", 2016, "Shou Zi Chew");

        // Printing company details using getter methods
        System.out.println("Company ID: " + tiktok.getCompanyId());
        System.out.println("Company Name: " + tiktok.getCompanyName());
        System.out.println("Established Year: " + tiktok.getEstablishedYear());
        System.out.println("CEO Name: " + tiktok.getCeoName());
    }
}