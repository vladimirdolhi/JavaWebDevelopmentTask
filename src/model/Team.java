package model;

import model.employees.*;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public Team(List<MobileDev> mobileList, List<WebDev> webList, List<Qa> qaList, List<Ux> uxList,
                List<Pm> pmList, List<Tl> tlList) {
        MobileList = mobileList;
        WebList = webList;
        QaList = qaList;
        UxList = uxList;
        PmList = pmList;
        TlList = tlList;
    }

    private List<MobileDev> MobileList;
    private List<WebDev> WebList;
    private List<Qa> QaList;
    private List<Ux> UxList;
    private List<Pm> PmList;
    private List<Tl> TlList;

    private int totalPrice;


    public int calculatePrice(){
        int totalPrice = 0;

        for (MobileDev emp: this.MobileList){
            totalPrice += emp.getSalary();
        }

        for (WebDev emp: this.WebList){
            totalPrice += emp.getSalary();
        }

        for (Qa emp: this.QaList){
            totalPrice += emp.getSalary();
        }

        for (Ux emp: this.UxList){
            totalPrice += emp.getSalary();
        }

        for (Pm emp: this.PmList){
            totalPrice += emp.getSalary();
        }

        for (Tl emp: this.TlList){
            totalPrice += emp.getSalary();
        }

        return  totalPrice;
    }

    public List<TeamStruct> getTeamStruct(){
        List<TeamStruct> teamStruct = new ArrayList<>();
        teamStruct.add(new TeamStruct("webDev", WebList.size()));
        teamStruct.add(new TeamStruct("mobileDev", MobileList.size()));
        teamStruct.add(new TeamStruct("qa", QaList.size()));
        teamStruct.add(new TeamStruct("ux",UxList.size()));
        teamStruct.add(new TeamStruct("pm", PmList.size()));
        teamStruct.add(new TeamStruct("tl", TlList.size()));
        return teamStruct;
    }

}
