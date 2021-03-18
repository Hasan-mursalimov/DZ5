import java.util.Objects;

public class Pets implements Comparable<Pets>{
    private int number;
    private String nickname;
    private Integer weight;
    private Person owner;

    public Pets(int number, String nickname, int weight, Person owner) {
        this.number = number;
        this.nickname = nickname;
        this.weight = weight;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "number=" + number +
                ", nickname='" + nickname + '\'' +
                ", weight=" + weight +
                ", owner=" + owner +
                '}';
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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return number == pets.number &&
                weight == pets.weight &&
                Objects.equals(nickname, pets.nickname) &&
                Objects.equals(owner, pets.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, nickname, weight, owner);
    }

    @Override
    public int compareTo(Pets o) {
        int res=owner.getName().compareTo(owner.getName());
        int res1=nickname.compareTo(nickname);
        int res11=weight.compareTo(weight);
        return 0;
    }
}

