import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import org.apache.commons.lang3.ArrayUtils;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, CsvException {

        Reader reader = Files.newBufferedReader(Paths.get("OD_2017.csv"));

        List<Entrevistados> pessoasTotal = new CsvToBeanBuilder(reader).withType(Entrevistados.class).build().parse();
        double [] valores = null;
        List<Double> zonas = new ArrayList<>();

        for(Entrevistados entrevistados : pessoasTotal){
                zonas.add(Double.parseDouble(entrevistados.getZonaDestino()));
        }

        valores = ArrayUtils.toPrimitive(zonas.toArray(new Double[zonas.size()]));

        new Histograma(valores);
    }
}

