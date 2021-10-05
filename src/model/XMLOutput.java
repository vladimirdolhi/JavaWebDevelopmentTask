package model;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class XMLOutput {
    public static void output(List<TeamStruct> teamStruct, int price) throws XMLStreamException, FileNotFoundException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("teamInfo.xml"));
        writer.writeStartDocument();
        writer.writeCharacters("\n");
        writer.writeStartElement("teamInfo");
        writer.writeCharacters("\n\t");
        writer.writeStartElement("team");
        writer.writeCharacters("\n\t\t");
        writer.writeStartElement("struct");
        for (TeamStruct job : teamStruct ){
            writer.writeCharacters("\n\t\t\t");
            writer.writeStartElement(job.getJob());
            writer.writeCharacters(Integer.toString(job.getCount()));
            writer.writeEndElement();
        }
        writer.writeCharacters("\n\t\t");
        writer.writeEndElement();
        writer.writeCharacters("\n\t\t");
        writer.writeStartElement("totalPrice");
        writer.writeCharacters(Integer.toString(price));
        writer.writeEndElement();
        writer.writeCharacters("\n\t");
        writer.writeEndElement();
        writer.writeCharacters("\n");
        writer.writeEndDocument();

    }
}
