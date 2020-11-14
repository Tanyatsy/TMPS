package Proxy;

public class FileImpl implements File {

    private String fileName;
    private String fileType;

    public FileImpl(String fileName, String fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
        loadFileConverter(fileName, fileType);
    }

    @Override
    public void printName() {
        System.out.println("Displaying " + fileName);
    }

    @Override
    public void printType() {
        System.out.println("Displaying " + fileType);
    }

    private void loadFileConverter(String fileName, String fileType) {
        System.out.println("Loading " + fileName);
        System.out.println("Prepare Converter for file with type: " + fileType);
    }

}
