package controller;


import model.*;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        MySaxParser parser = new MySaxParser();
        CompanyInfo companyInfo = parser.parse();
        Team team = new Team(companyInfo.getMobileList(), companyInfo.getWebList(),
                companyInfo.getQaList(), companyInfo.getUxList(), companyInfo.getPmList(), companyInfo.getTlList());

        try {
            XMLOutput.output(team.getTeamStruct(), team.calculatePrice());
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
