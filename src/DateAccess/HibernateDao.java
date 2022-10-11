package DateAccess;

import entities.Eğitmen;
import entities.Kategori;
import entities.Kurs;

public class HibernateDao implements AlternatifDao {

    @Override
    public void add(Eğitmen eğitmen, Kategori kategori, Kurs kurs) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
