package factoryMethod;

public class FactoryMedici implements Factory{
    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Medic(nume);
    }
}
