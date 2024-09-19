package FileSystem;

import java.nio.file.FileSystemLoopException;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    List<FileSystem>fs;
    String dirName;

    public Directory(String dirName){
        this.dirName = dirName;
        fs = new ArrayList<>();
    }

    public void add(FileSystem fs){
        this.fs.add(fs);
    }
    @Override
    public void ls() {

        System.out.println("Files in the Director "+dirName+" are :");

        for(FileSystem x: fs){
            x.ls();
        }

    }
}
