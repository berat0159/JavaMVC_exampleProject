import DateAccess.HibernateDao;
import DateAccess.JdbcDao;
import Loggers.BaseLogger;
import Loggers.DatabaseLogger;
import Loggers.FileLogger;
import Loggers.MailLogger;
import bussines.DatabaseManager;
import bussines.LoggerManager;
import entities.Eğitmen;
import entities.Kategori;
import entities.Kurs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Eğitmen eğitmen=new Eğitmen("Engin","Demirog");
        Kategori kategori=new Kategori("Programlama");
        Kurs kurs=new Kurs("Java",20.21);

        DatabaseManager databaseManager=new DatabaseManager(new JdbcDao());
        databaseManager.add(eğitmen,kategori,kurs);

        ArrayList<BaseLogger> baseLoggers=new ArrayList<>();
        baseLoggers.add(new DatabaseLogger());
        baseLoggers.add(new FileLogger());
        baseLoggers.add(new MailLogger());

        LoggerManager loggerManager=new LoggerManager(baseLoggers);
        loggerManager.log("null");


    }
}