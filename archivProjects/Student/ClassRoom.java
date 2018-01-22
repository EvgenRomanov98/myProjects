public class ClassRoom {

    private String classWord;
    private int classLimit;
    Student[] studMass;
    private int studCount = 0;

    public ClassRoom() {
    }

    public ClassRoom(int classLimit) {
        studMass = new Student[classLimit];
    }

    public ClassRoom(String classWord, int classLimit) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        studMass = new Student[classLimit];
    }


    public String getClassWord() {
        return classWord;
    }

    public void setClassWord(String classWord) {
        this.classWord = classWord;
    }

    public int getClassLimit() {
        return classLimit;
    }

    public void setClassLimit(int classLimit) {
        this.classLimit = classLimit;
    }

    public Student[] getStudMass() {
        return studMass;
    }

    public void setStudMass(Student[] studMass) {
        this.studMass = studMass;
    }

    public int getStudCount() {
        return studCount;
    }

    public void setStudCount(int studCount) {
        this.studCount = studCount;
    }



    public void addStudentToClass(Student s) {
        if (studCount < studMass.length) {
            for (int i = 0; i < studMass.length; i++) {
                if (studMass[i] == null) {
                    studMass[i] = s;
                    studCount++;
                    break;
                }
            }
        } else {
            System.out.println("net mest");
        }
    }

    public void printStudentNameAndAgeInClass() {
        for (Student student : studMass) {
            if (student != null) {
                System.out.println(student.getName() + " , " + student.getAge());
            }
        }
    }

    public void ageSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getAge() > studMass[j + 1].getAge()) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
        for (Student s:studMass) {
            System.out.println(s.getName() + " , " + s.getAge());
        }

    }
}
