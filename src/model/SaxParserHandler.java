package model;

import model.employees.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxParserHandler extends DefaultHandler {

    private static final String TAG_EMPLOYEE = "employee";
    private static final String TAG_DEV = "dev";
    private static final String TAG_WEB = "web";
    private static final String TAG_MOBILE = "mobile";
    private static final String TAG_QA = "qa";
    private static final String TAG_UX = "ux";
    private static final String TAG_PM = "pm";
    private static final String TAG_TL = "tl";
    private static final String TAG_NAME = "name";
    private static final String TAG_SNAME = "sname";
    private static final String TAG_POS = "position";
    private static final String TAG_SALARY = "salary";

    private String currentTag;

    private static boolean isEmloyees;
    private static boolean isDev;
    private static boolean isWeb;
    private static boolean isMobile;
    private static boolean isQa;
    private static boolean isUx;
    private static boolean isPm;
    private static boolean isTl;

    List<MobileDev> MobileList = new ArrayList<>();
    List<WebDev> WebList = new ArrayList<>();
    List<Qa> QaList = new ArrayList<>();
    List<Ux> UxList = new ArrayList<>();
    List<Pm> PmList = new ArrayList<>();
    List<Tl> TlList = new ArrayList<>();

    private String name;
    private String sname;
    private String position;
    private int salary;

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
    public void startDocument() throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTag = qName;
        if (currentTag != null) {
            switch (currentTag) {
                case "employees":
                    isEmloyees = true;
                    break;
                case "dev":
                    isDev = true;
                    break;
                case "web":
                    isWeb = true;
                    break;
                case "mobile":
                    isMobile = true;
                    break;
                case "qa":
                    isQa = true;
                    break;
                case "ux":
                    isUx = true;
                    break;
                case "pm":
                    isPm = true;
                    break;
                case "tl":
                    isTl = true;
                    break;
            }

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName != null) {
            switch (qName) {
                case TAG_EMPLOYEE:
                    if (isMobile){
                        MobileList.add(new MobileDev(name, sname, position, salary));
                    } else if (isWeb){
                        WebList.add(new WebDev(name, sname, position, salary));
                    } else if (isQa){
                        QaList.add(new Qa(name, sname, position, salary));
                    } else if (isUx){
                        UxList.add(new Ux(name, sname, position, salary));
                    } else if (isPm){
                        PmList.add(new Pm(name, sname, position, salary));
                    } else if (isTl){
                        TlList.add(new Tl(name, sname, position, salary));
                    }
                    break;
                case TAG_MOBILE:
                    isMobile = false;
                    break;
                case TAG_WEB:
                    isWeb = false;
                    break;
                case TAG_QA:
                    isQa = false;
                    break;
                case TAG_UX:
                    isUx = false;
                    break;
                case TAG_PM:
                    isPm = false;
                    break;
                case TAG_TL:
                    isTl = false;
                    break;
            }

            currentTag = null;

        }
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentTag == null){
            return;
        }
         switch (currentTag){
             case TAG_NAME:
                 name = new String(ch, start, length);
                 break;
             case TAG_SNAME:
                 sname = new String(ch, start, length);
                 break;
             case TAG_POS:
                 position = new String(ch, start, length);
                 break;
             case TAG_SALARY:
                 salary = Integer.parseInt(new String(ch, start, length));
                 break;
         }
    }
}
