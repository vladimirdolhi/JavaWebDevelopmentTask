package model;

public class TeamStruct {

    private String job;
    private int count;

    public String getJob() {
        return job;
    }

    public int getCount() {
        return count;
    }

    public TeamStruct(String job, int count) {
        this.job = job;
        this.count = count;
    }
}
