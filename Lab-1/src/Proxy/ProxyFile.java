package Proxy;

public class ProxyFile implements File {
    private FileImpl file;

    private String fileName;
    private String fileType;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
        this.fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
    }


    @Override
    public void printName() {
        if (file == null) {
            file = new FileImpl(fileName, fileType);
        } else {
            file.printName();
        }
    }

    @Override
    public void printType() {
        if (file == null) {
            file = new FileImpl(fileName, fileType);
        } else {
            file.printType();
        }
    }
}
