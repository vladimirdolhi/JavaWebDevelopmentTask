package model;

import model.employees.*;

import java.util.ArrayList;
import java.util.List;

public class CompanyInfo {
    private String name;
    private List<MobileDev> MobileList = new ArrayList<>();
    private List<WebDev> WebList = new ArrayList<>();
    private List<Qa> QaList = new ArrayList<>();
    private List<Ux> UxList = new ArrayList<>();
    private List<Pm> PmList = new ArrayList<>();
    private List<Tl> TlList = new ArrayList<>();

    public CompanyInfo(List<MobileDev> mobileList, List<WebDev> webList, List<Qa> qaList,
                       List<Ux> uxList, List<Pm> pmList, List<Tl> tlList) {
        MobileList = mobileList;
        WebList = webList;
        QaList = qaList;
        UxList = uxList;
        PmList = pmList;
        TlList = tlList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileList(List<MobileDev> mobileList) {
        MobileList = mobileList;
    }

    public void setWebList(List<WebDev> webList) {
        WebList = webList;
    }

    public void setQaList(List<Qa> qaList) {
        QaList = qaList;
    }

    public void setUxList(List<Ux> uxList) {
        UxList = uxList;
    }

    public void setPmList(List<Pm> pmList) {
        PmList = pmList;
    }

    public void setTlList(List<Tl> tlList) {
        TlList = tlList;
    }

    public String getName() {
        return name;
    }

    public List<MobileDev> getMobileList() {
        return MobileList;
    }

    public List<WebDev> getWebList() {
        return WebList;
    }

    public List<Qa> getQaList() {
        return QaList;
    }

    public List<Ux> getUxList() {
        return UxList;
    }

    public List<Pm> getPmList() {
        return PmList;
    }

    public List<Tl> getTlList() {
        return TlList;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "name='" + name + '\'' +
                ", MobileList=" + MobileList +
                ", WebList=" + WebList +
                ", QaList=" + QaList +
                ", UxList=" + UxList +
                ", PmList=" + PmList +
                ", TlList=" + TlList +
                '}';
    }
}

