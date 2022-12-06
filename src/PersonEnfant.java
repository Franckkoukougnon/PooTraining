public class PersonEnfant extends Person {
    String sport;
    String origin;
    public PersonEnfant(String name, String address, int age, String sport, String origin) {
        super(name, address, age);
        this.sport = sport;
        this.origin = origin;


    }

    @Override
    public String toString(){
        return sport +" "+address+" "+" "+origin;
    }
}
