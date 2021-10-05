package model;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class MySaxParser {
    public CompanyInfo parse(){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser;
        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
            return null;

        }
        File file = new File("employees.xml");
        try {
            parser.parse(file, handler);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            return null;

        }

        return new CompanyInfo(handler.getMobileList(), handler.getWebList(), handler.getQaList(),
                handler.getUxList(), handler.getPmList(), handler.getTlList());
    }
}
