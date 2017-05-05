package com.star.tools.test;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hxx9048
 * @since 2017/4/25
 */
public class HandleService extends DefaultHandler2 {
    private Map<String, Object> projects;
    private Map<String, Object> project;
    private String preTag = null;//作用是记录解析时的上一个节点名称

    @Override
    public void startDocument() throws SAXException {
        System.out.println("startDocument");
        projects = new HashMap<String, Object>();
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("endDocument");
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("startElement");
        if ("project".equals(qName)) {
            project = new HashMap<String, Object>();
        }
        preTag = qName;//将正在解析的节点名称赋给preTag

        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("endElement");
        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("characters");
        String con=new String(ch,0,ch.length);
        if (preTag != null) {
            String content = new String(ch, start, length);
            if ("name".equals(preTag)) {
                project.put("name",content);
            } else if ("price".equals(preTag)) {
                project.put("price",content);
            }
        }
    }

}
