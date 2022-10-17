public class Human {
   private String name;
   private int yearOfBirth;
   private String town;
   private String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ",Я из города " + town + ",Мне " + yearOfBirth + " лет, я работаю на должности: " + job + ",Будем знакомы!";
    }
}
