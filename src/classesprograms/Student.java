package classesprograms;

public class Student {


        private String name;
        private int rollNum;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollNum() {
            return rollNum;
        }

        public void setRollNum(int rollNum) {
            this.rollNum = rollNum;
        }

        public void display() {
            System.out.println(this.name);
            System.out.println(this.rollNum);
        }

        public Student(String name, int rollNum) {
            this.name = name;
            this.rollNum = rollNum;
        }

        public static void main(String[] args) {
            Student s1[] = new Student[4];

            s1[0] = new Student("Rampravesh", 25);
            s1[1] = new Student("Akash", 26);
            s1[2] = new Student("Arpit", 25);
            s1[3] = new Student("Ajeet", 26);
            for (int i = 0; i < s1.length; i++) {
                s1[i].display();
            }
        }
    }

