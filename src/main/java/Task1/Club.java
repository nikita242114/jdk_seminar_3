package Task1;

public class Club extends Place {

    public Club(Person[] arrayT) {
        super(arrayT);
    }

    /*public void start() {
    }*/

    @Override
    void action() {
        for (int i = 0; i < personArray.length; i++) {
            personArray[i].haveRest();
        }
    }
}