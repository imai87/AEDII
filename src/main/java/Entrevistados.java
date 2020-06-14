import com.opencsv.bean.CsvBindByName;

public class Entrevistados {

    @CsvBindByName(column = "ID_PESS", required = true)
    private String frequentadores;

    @CsvBindByName(column = "CO_D_X", required = true)
    private String coordenadaX;

    @CsvBindByName(column = "CO_D_Y", required = true)
    private String coordenadaY;

    @CsvBindByName(column = "ZONA_D", required = true)
    private String zonaDestino;

    public String getZonaDestino() {
        return zonaDestino;
    }

    public void setZonaDestino(String zonaDestino) {
        this.zonaDestino = zonaDestino;
    }

    public String getFrequentadores() {
        return frequentadores;
    }

    public void setFrequentadores(String frequentadores) {
        this.frequentadores = frequentadores;
    }

    public String getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public String getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(String coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}
