package src;

public class SpiderTest {
    public static void main(String[] args){
        Spider spider = new Spider(".");
        spider.crawl(spider.rootNode, "uiDesigner.xml");
    }
}
