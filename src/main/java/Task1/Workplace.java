package Task1;

public class Workplace extends Place {

    public Workplace(Person[] arrayT) {super(arrayT);}

    @Override
    void action() {
        for (int i = 0; i < personArray.length; i++) {
            personArray[i].doWork();
        }
    }
}
