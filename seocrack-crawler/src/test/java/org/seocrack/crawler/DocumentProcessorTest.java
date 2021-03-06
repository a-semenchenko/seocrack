//package org.seocrack.crawler;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import WebPage;
//import WebLink;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//import java.util.List;
//
//import static org.testng.Assert.*;
//
///**
// * Created by meqqee on 17.02.2017.
// */
//@Test(enabled = false)
//public class DocumentProcessorTest {
//
//    private DocumentProcessor documentProcessor;
//
//    @BeforeClass
//    public void init() {
//        try {
//            Document document = Jsoup.connect("http://oknapr.ru/").get();
//            documentProcessor = new DocumentProcessor(document);
//        } catch (IOException e) {
//            fail("Can not create connection. " + e.getMessage());
//        }
//    }
//
//    @Test(enabled = false)
//    public void testProcessLinks() throws Exception {
//        List<WebLink> links = documentProcessor.processLinks();
//
//        assertNotNull(links);
//        assertTrue(links.size() > 0);
//    }
//
//    @Test(enabled = false)
//    public void testProcessPage() throws Exception {
//        WebPage page = documentProcessor.processPage();
//
//        assertNotNull(page);
//        assertNotNull(page.getTitle());
//        assertEquals(page.getTitle(), "Пластиковые окна ПВХ в Твери, установка окон ПВХ | «Окна Просто»");
//    }
//}
