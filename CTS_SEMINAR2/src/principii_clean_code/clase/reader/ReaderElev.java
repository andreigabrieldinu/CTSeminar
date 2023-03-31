package principii_clean_code.clase.reader;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import principii_clean_code.clase.reader.ReaderAplicant;

public class ReaderElev extends ReaderAplicant{
    public ReaderElev(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            readAplicant(input2, elev);
            elev.setClasa(input2.nextInt());
            elev.setTutore(input2.next());
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
