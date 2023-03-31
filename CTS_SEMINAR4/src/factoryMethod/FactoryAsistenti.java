package factoryMethod;

public class FactoryAsistenti implements Factory{

    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Asistent(nume);
    }
}
