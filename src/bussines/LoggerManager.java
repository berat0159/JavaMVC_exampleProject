package bussines;

import Loggers.BaseLogger;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoggerManager {

    private ArrayList<BaseLogger> baseLoggers;
    public LoggerManager(ArrayList<BaseLogger> baseLoggers){
        this.baseLoggers=baseLoggers;
    }

    public void log(String data){

        for (BaseLogger baseLogger:baseLoggers){
            baseLogger.log(data);
        }
    }
}
