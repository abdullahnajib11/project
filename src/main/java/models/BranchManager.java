package main.models;

public class BranchManager {
    private String name;
    private String branchCode;

    public BranchManager(String name, String branchCode) {
        this.name = name;
        this.branchCode = branchCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}
