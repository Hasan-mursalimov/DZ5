public class Pets {
    private int number;
    private String nickname;
    private int weight;
    private Person owner;

    public Pets(int number, String nickname, int weight, Person owner) {
        this.number = number;
        this.nickname = nickname;
        this.weight = weight;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}

