package Loggers;

public class FileLogger extends BaseLogger {

    @Override
    public void log(String data) {
        System.out.println("File ile loglandi:"+data);
    }
}
