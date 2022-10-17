package src;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

/*
An object to be used to crawl a paths directory from
a given root to search for files an perform actions
on the given files
* */
public class Spider {

    private File root;
    public ArachnidNode rootNode;

    class ArachnidNode{
        String fileName;
        File currentFile;
        File [] nextFiles;
    }

    public Spider(String directory){
       this.rootNode = createNode(directory);
    }

    private ArachnidNode createNode(String directory){
        ArachnidNode spiderling = new ArachnidNode();
        spiderling.currentFile = new File(directory)            ;
        spiderling.fileName = spiderling.currentFile.getName();
        spiderling.nextFiles = spiderling.currentFile.listFiles();

        return spiderling;
    }

    public int crawl(ArachnidNode node, String key) {
        for (File file : node.nextFiles) {

            if (file.getName().equals(key)) {
                System.out.print("found: ");
                System.out.println(file.getName());
                return 1;
            } else {

                if(file.isDirectory()){
                    ArachnidNode spiderling = new ArachnidNode();
                    spiderling.currentFile = file;
                    spiderling.fileName = file.getName();
                    spiderling.nextFiles = file.listFiles();
                    crawl(spiderling, key);
                }
            }
        }
        return 0;
    }
}
