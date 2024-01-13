package Uke2.Opg8;

// a)
public class NettStudent extends Student {
    private String hjemsted;

    // b)
    public NettStudent(String studentnummer, String fornavn, String etternavn, String studiested, String hjemsted) {
        super(studentnummer, fornavn, etternavn, studiested);
        this.hjemsted = hjemsted;
    }

    public String getHjemsted() {
        return hjemsted;
    }

    public void setHjemsted(String hjemsted) {
        this.hjemsted = hjemsted;
    }

    // c)
    @Override
    public String toString() {
        String tekst = super.toString();
        tekst += "\nHjemsted: " + hjemsted;
        return tekst;
    }
}
