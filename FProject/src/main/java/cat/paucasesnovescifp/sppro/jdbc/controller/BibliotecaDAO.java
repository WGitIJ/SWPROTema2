package cat.paucasesnovescifp.sppro.jdbc.controller;

import cat.paucasesnovescifp.sppro.jdbc.exception.JDBCException;
import cat.paucasesnovescifp.sppro.jdbc.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class BibliotecaDAO {
    private String url;
    private Properties properties = new Properties();
    private Connection connection;

    public BibliotecaDAO(String url, Properties properties) throws JDBCException {
        setUrl(url);
        setProperties(properties);
        connect();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws JDBCException {
        if (url == null || "".equals(url.trim())) {
            throw new JDBCException("La url no puede ser null o estar vacia");
        }
        this.url = url;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) throws JDBCException {
        if (properties == null || properties.isEmpty()) {
            throw new JDBCException("Las propiedades no pueden ser null o estar vacias");
        }
        this.properties = properties;
    }

    private void connect() throws JDBCException {
        try {
            connection = DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            throw new JDBCException("Error connecting to database: " + e.getMessage());
        }
    }

    public void close() throws JDBCException {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new JDBCException("Error closing connection: " + e.getMessage());
        }
    }

    public ArrayList<String> listTop20Collections() throws JDBCException {
        ArrayList<String> collections = new ArrayList<>();
        String sql = "SELECT FK_COLLECCIO, count(*) AS total " +
                "FROM LLIBRES " +
                "WHERE FK_COLLECCIO IS NOT NULL " +
                "GROUP BY FK_COLLECCIO " +
                "ORDER BY total DESC " +
                "LIMIT 20;";
        try {
            if (connection == null || connection.isClosed()) {
                connect();
            }
            try (PreparedStatement stmt = connection.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    collections.add(rs.getString("FK_COLLECCIO"));
                }
            }
        } catch (SQLException e) {
            throw new JDBCException("No s'ha pogut recuperar la col·lecció:  " + e.getMessage());
        }
        return collections;
    }

    public ArrayList<Book> getBooksByCollection(String collection) throws JDBCException {
        String sql = "SELECT ID_LLIB, TITOL, ANYEDICIO, FK_COLLECCIO, FK_DEPARTAMENT " +
                "FROM LLIBRES " +
                "WHERE FK_COLLECCIO = ?;";
        ArrayList<Book> books = new ArrayList<>();
        try {
            if (connection == null || connection.isClosed()) {
                connect();
            }
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, collection);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        Integer id = rs.getInt("ID_LLIB");
                        String title = rs.getString("TITOL");
                        Integer anyEdicio = rs.getInt("ANYEDICIO");
                        String fColleccio = rs.getString("FK_COLLECCIO");
                        String departament = rs.getString("FK_DEPARTAMENT");
                        books.add(new Book(id, title, anyEdicio, fColleccio, departament));
                    }
                }
            }
        } catch (SQLException e) {
            throw new JDBCException("No s'ha pogut recuperar la col·lecció: " + e.getMessage());
        }
        return books;
    }
}
