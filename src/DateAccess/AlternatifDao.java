package DateAccess;

import entities.Eğitmen;
import entities.Kategori;
import entities.Kurs;

public interface AlternatifDao {
    void add(Eğitmen eğitmen, Kategori kategori, Kurs kurs);
}
