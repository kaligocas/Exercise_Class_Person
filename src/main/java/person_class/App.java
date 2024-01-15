package person_class;


public final class App {
    private App() {
    }

    /**
    
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
    }

    public class Person_class {
        private String name;
        private int age;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        private double height;
        private char gender;
        

        public Person_class()
        {
            this.name = "Katherine";
            this.age = 33;
            this.height = 1.64;
            this.gender = 'f';
        }

        public Person_class(String name, int age, double height, char gender)
        {
            this.name = name;
            this.age = age;
            this.height = height;
            this.gender = gender;
        }
    }
}
