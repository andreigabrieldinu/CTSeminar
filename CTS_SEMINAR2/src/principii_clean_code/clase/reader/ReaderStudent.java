package principii_clean_code.clase.reader;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import principii_clean_code.clase.reader.ReaderAplicant;

public class ReaderStudent extends ReaderAplicant{
    public ReaderStudent(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            readAplicant(input, student);
            student.setAn_studii(input.nextInt());
            student.setFacultate(input.next());
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
