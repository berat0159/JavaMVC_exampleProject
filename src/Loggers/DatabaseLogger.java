package Loggers;

public class DatabaseLogger extends BaseLogger{
    @Override
    public void log(String data) {
        System.out.println("Database ile loglandi:"+data);
    }
}
