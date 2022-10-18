public class Human {
   private String name;
   private int yearOfBirth;
   private String town;
   private String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Информация не введена!");
        } else {
            this.name = name;}

        if (yearOfBirth>0){
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if(town.isEmpty()) {
            throw new IllegalArgumentException("Информация не введена!");
        } else{
            this.town = town;
        }
        if(job.isEmpty()){
            throw new IllegalArgumentException("Информация не введена!");
        } else {
            this.job = job;
        }

    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ",Я из города " + town + ",Мне " + yearOfBirth + " лет, я работаю на должности: " + job + ",Будем знакомы!";
    }
}

