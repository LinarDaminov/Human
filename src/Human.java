public class Human {
   private String name;
   private int yearOfBirth;
   private String town;
   private String job;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            System.out.println("Информация не указана");
        }
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth<=0){
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town.isEmpty() || town == null) {
            System.out.println("Информация не указана");
        }
        this.town = town;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job.isEmpty() || job == null) {
            System.out.println("Информация не указана");
        }
        this.job = job;
    }

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

