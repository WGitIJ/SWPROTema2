package cat.paucasesnovescifp.sppro.jdbc.model;

public class Book {
    private Integer id;
    private String title;
    private Integer anyEdicio;
    private String fColleccio;
    private String departament;

    public Book(Integer id, String title, Integer anyEdicio, String fColleccio, String departament) {
        this.id = id;
        this.title = title;
        this.anyEdicio = anyEdicio;
        this.fColleccio = fColleccio;
        this.departament = departament;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAnyEdicio() {
        return anyEdicio;
    }

    public void setAnyEdicio(Integer anyEdicio) {
        this.anyEdicio = anyEdicio;
    }

    public String getfColleccio() {
        return fColleccio;
    }

    public void setfColleccio(String fColleccio) {
        this.fColleccio = fColleccio;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", anyEdicio=" + anyEdicio +
                ", fColleccio='" + fColleccio + '\'' +
                ", departament='" + departament + '\'' +
                '}';
    }
}
