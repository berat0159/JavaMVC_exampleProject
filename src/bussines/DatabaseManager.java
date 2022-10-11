package bussines;

import DateAccess.AlternatifDao;
import DateAccess.HibernateDao;
import DateAccess.JdbcDao;
import entities.Eğitmen;
import entities.Kategori;
import entities.Kurs;

public class DatabaseManager {
    private AlternatifDao alternatifDao;
    public DatabaseManager(AlternatifDao alternatifDao){
        this.alternatifDao=alternatifDao;
    }


    public void add(Eğitmen eğitmen, Kategori kategori, Kurs kurs) throws Exception{

        /*if(kurs.kursName==kurs.kursName){

            throw new Exception("Kurs İsmi Tekrar Edemez");

        }

        if (kategori.kategoriName==kategori.kategoriName){
            throw new Exception("Kategori İsmi tekrar edemez");
        }*/

        if(kurs.price<0){

            throw new Exception("Kursun Fiyati 0 dan kucuk olamaz");
        }

         alternatifDao.add(eğitmen,kategori,kurs);




    }
}
