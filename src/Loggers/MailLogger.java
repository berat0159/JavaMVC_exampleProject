package Loggers;

public class MailLogger extends BaseLogger{
    @Override
    public void log(String data) {
        System.out.println("Mail ile loglandi:"+data);
    }
}
