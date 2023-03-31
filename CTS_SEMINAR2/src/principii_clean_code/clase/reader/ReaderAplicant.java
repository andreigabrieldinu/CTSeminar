package principii_clean_code.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {

    public String fileName = "";
    public ReaderAplicant(String file){
        this.fileName = file;
    }

    public String getFileName() {
        return fileName;
    }
    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void readAplicant(Scanner input, Aplicant aplicant) {
        aplicant.setNume(input.next());
        aplicant.setPrenume(input.next());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());
        aplicant.setNrProiecte(input.nextInt());
        String[] denumiriProiecte = new String[aplicant.getNrProiecte()];
        for (int i = 0; i < aplicant.getNrProiecte() ; i++)
            denumiriProiecte[i] = input.next();
        aplicant.setDenumiriProiecte(denumiriProiecte);

    }
}
