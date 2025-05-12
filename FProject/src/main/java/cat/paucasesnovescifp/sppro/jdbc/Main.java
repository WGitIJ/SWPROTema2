package cat.paucasesnovescifp.sppro.jdbc;

import cat.paucasesnovescifp.sppro.jdbc.controller.BibliotecaDAO;
import cat.paucasesnovescifp.sppro.jdbc.exception.JDBCException;

import java.util.Properties;

public class Main {
    public static void main(String[] args) throws JDBCException {
        Properties props = new Properties();
        props.setProperty("user", "usuari");
        props.setProperty("password", "seCret_24");
        BibliotecaDAO db = new BibliotecaDAO("jdbc:mysql://daw.paucasesnovescifp.cat:3306/biblioteca", props);
        System.out.println(db.listTop20Collections());
        System.out.println(db.getBooksByCollection("BIBLIOTECA BASICA DE MALLORCA"));
        db.close();
    }
}
