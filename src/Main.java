////copy past1
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Student {
//   String title;
//    int ages;
//    long phoneNumber;
//    int grades;
//
//    public Student(String title, int ages, long phoneNumber, int grades) {
//        this.title = title;
//        this.ages = ages;
//        this.phoneNumber = phoneNumber;
//       this.grades = grades;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getAges() {
//       return ages;
//    }
//
//    public void setAges(int i) {
//       this.ages = ages;
//    }
//
//    public long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public int getGrades() {
//        return grades;
//    }
//
//    public void setGrades(int grades) {
//        this.grades = grades;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "title='" + title + '\'' +
//                ", ages=" + ages +
//                ", phoneNumber=" + phoneNumber +
//                ", grades=" + grades +
//                '}';
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student student = new Student("Ailun", 22, 87078871243L, 89);
//        System.out.println(student.getTitle());
//
//        System.out.println("Old info: " + student);
//
//        student.setTitle("Ailin");
//        student.setAges(20);
//        student.setPhoneNumber(87054121874L);
//        student.setGrades(98);
//        System.out.println(student);
//    }
//}
//
//
////copy past2
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        Student student = new Student("Alina", 33, 87078871219L, 80);
//        Student student2 = new Student("Dina", 18, 87475880163L, 85);
//        Student student3 = new Student("Ulbosh", 22, 87475667809L, 93);
//
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        System.out.println("Old list: " +studentArrayList);
//
//        System.out.println(studentArrayList.get(0));
//        Collections.sort(studentArrayList, new SortByAge());
//        System.out.println("Sorted by age: " +studentArrayList);
//    }
//}
//
////copy past3
//class SortByAge implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getAges() == s2.getAges()) //equal
//            return 0;
//        if (s1.getAges() > s2.getAges())
//            return 1; // bigger
//        else
//            return -1; // smaller
//    }
//}
//
//class SortByGrade implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getGrades() == s2.getGrades()) //equal
//            return 0;
//        if (s1.getGrades() > s2.getGrades())
//            return 1; // bigger
//        else
//            return -1; // smaller
//    }
//}
//
//class SortByName implements  Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2){
//        return s1.getTitle().compareTo(s2.getTitle());
//    }
//}
//
//
//// copy past4
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        Student student = new Student("Dias", 17, 87089975678L, 75);
//        Student student2 = new Student("Raushan", 20, 87478890909L, 77);
//        Student student3 = new Student("Alnur", 18, 87071234567L, 89);
//
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        System.out.println("Old list: " + studentArrayList);
//
//        Student s = getStudentByAge(studentArrayList, 18);
//        System.out.println(s);
//    }
//
//    public static Student getStudentByAge(ArrayList<Student> list, int age) {
//        Student res = null;
//        for (Student s : list) {
//           if (s.getAges() == age) {
//               res = s;
//           }
//       }
//        return res;
//   }
//}



//problem2
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        Customer customer = new Customer(1,"Aldavergenova","Ailin","Omarqyzy","Taraz", 1,150);
//        Customer customer1 = new Customer(2,"Sagatova","Kamila","Zhamylbekqyzy","Astana", (int) 2,155);
//        Customer customer2 = new Customer(3,"Omarova","Ulpan","Yerassylqyzy","Semey", 3,160);
//        Customer customer3 = new Customer(4,"Talqarova","Samal","Igemberdiqyzy","Almaty", 4,165);
//        Customer customer4 = new Customer(5,"Omirbekova","Ayim","Uristembekqyzy","Oskemen", 5,170);
//        Customer customer5 = new Customer(6,"Kenesova","Yuki","Galymzhanqyzy","Aktau", 6,180);
//        Customer customer6 = new Customer(7,"Zhaparova","Raushan","Omirbekqyzy","Oskemen", 7,190);
//        ArrayList<Customer> customersArrayList = new ArrayList<>();
//        customersArrayList.add(customer);
//        customersArrayList.add(customer1);
//        customersArrayList.add(customer2);
//        customersArrayList.add(customer3);
//        customersArrayList.add(customer4);
//        customersArrayList.add(customer5);
//        customersArrayList.add(customer6);
//        Collections.sort(customersArrayList,new SortByName());
//        for(Customer s:customersArrayList){
//            System.out.println(s.getTitle());
//        }
//
//        int first = 1;
//        int second = 4;
//        ArrayList<Customer> diapason_customers = new ArrayList<>();
//        for(Customer f:customersArrayList){
//            if(f.getNumber_card()>=first && f.getNumber_card()<=second){
//                diapason_customers.add(f);
//            }
//        }
//        System.out.println("Customers number card of 1-4");
//        for(Customer f:diapason_customers){
//            System.out.println(f);
//        }
//    }
//}
//class Customer{
//    int id;
//    String surname;
//    String title;
//    String lastname;
//    String address;
//    int number_card;
//    int number_bank_check;
//    public Customer(int id,String surname,String title,String lastname,String address,int number_card,int number_bank_check){
//        this.id =id;
//        this.surname =surname;
//        this.title =title;
//        this.lastname =lastname;
//        this.address =address;
//        this.number_card =number_card;
//        this.number_bank_check =number_bank_check;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", title='" + title + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", address='" + address + '\'' +
//                ", number_card=" + number_card +
//                ", number_bank_check=" + number_bank_check +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getNumber_card() {
//        return number_card;
//    }
//
//    public void setNumber_card(int number_card) {
//        this.number_card = number_card;
//    }
//
//    public int getNumber_bank_check() {
//        return number_bank_check;
//    }
//
//    public void setNumber_bank_check(int number_bank_check) {
//        this.number_bank_check = number_bank_check;
//    }
//}
//class SortByName implements Comparator<Customer>{
//
//    @Override
//    public int compare(Customer first, Customer second) {
//        return first.getTitle().compareTo(second.getTitle());
//    }
//}

//problem1
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        Student student1 = new Student(1,"Ailin","Yesengalieva","Omarqyzy",1999,"Astana","87078871243","Marketing","1A",1);
//        Student student2 = new Student(2,"Daniya","Rustamova","Zhanserikqyzy",1998,"Taraz","87078871243","Management","3F",3);
//        Student student3 = new Student(3,"Kalamkas","Omarova","Rustamqyzy",1995,"Almaty","87078871243","English ","3J",3);
//        Student student4 = new Student(4,"Omargul","Atibekova","Yerassylqyzy",2004,"Oskemen","87078871243","IT ","2E",2);
//        Student student5 = new Student(5,"Zhuldyz","Daniyalova","Tulenqyzy",2002,"Semey","87078871243","Russian","1I",1);
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        studentArrayList.add(student1);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        studentArrayList.add(student4);
//        studentArrayList.add(student5);
//
//        String faculty = "Marketing";
//        for(Student a:studentArrayList){
//            if(a.getfaculty()==faculty){
//                System.out.println(a);
//            }
//        }
//
//        String Marketing = "Marketing";
//        String Management ="Management";
//        String English ="English";
//        String it = "IT";
//        String Russian ="Russian";
//
//
//
//        for(Student a : studentArrayList){
//            if(a.getfaculty()==it && a.getCourse()==3){
//                System.out.println("Faculty:IT 1 course:\n"+a);
//            }else if(a.getfaculty()==it && a.getCourse()==2){
//                System.out.println("Faculty:it 2 course :\n"+a);
//            }else if(a.getfaculty()==it && a.getCourse()==3){
//                System.out.println("Faculty:it 3 course :\n"+a);
//            }else if(a.getfaculty()==Russian && a.getCourse()==1){
//                System.out.println("Faculty:Russian 1 course :\n"+a);
//            }else if(a.getfaculty()==Russian && a.getCourse()==2){
//                System.out.println("Faculty:Russian 2 course :\n"+a);
//            }else if(a.getfaculty()==English && a.getCourse()==3){
//                System.out.println("Faculty:English 3 course :\n"+a);
//        }else if(a.getfaculty()==English && a.getCourse()==2){
//            System.out.println("Faculty:English 2 course :\n"+a);
//        }
//    }
//        int year = 1995;
//        for(Student a:studentArrayList){
//            if(a.getdate_of_birth()>year){
//                System.out.println("students born after 1995:\n"+a);
//            }
//        }
//        ArrayList<String> groups = new ArrayList<>();
//        for(Student a:studentArrayList){
//            groups.add(a.getGroup());
//        }
//        System.out.println(groups);
//
//    }
//}
//class Student{
//    int id;
//    String surname;
//    String title;
//    String patronymic;
//    int date_of_birth;
//    String address;
//    String phone_number;
//    String faculty;
//    int course;
//    String group;
//    public Student(int id,String title,String surname,String patronymic,int date_of_birth,String address,String phone_number,String faculty,String group,int course){
//        this.id = id;
//        this.surname = surname;
//        this.title = title;
//        this.patronymic = patronymic;
//        this.date_of_birth = date_of_birth;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.faculty = faculty;
//        this.course = course;
//        this.group = group;
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getpatronymic() {
//        return patronymic;
//    }
//
//    public int getdate_of_birth() {
//        return date_of_birth;
//    }
//
//    public String getaddress() {
//        return address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public String getfaculty() {
//        return faculty;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setpatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public void setdate_of_birth(int date_of_birth) {
//        this.date_of_birth = date_of_birth;
//    }
//
//    public void setaddress(String address) {
//        this.address = address;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public void setfaculty(String faculty) {
//        this.faculty = faculty;
//    }
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", title='" + title + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", date_of_birth='" + date_of_birth + '\'' +
//                ", address='" + address + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", faculty='" + faculty + '\'' +
//                ", course=" + course +
//                ", group='" + group + '\'' +
//                '}';
//    }
//}

//problem3
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        Patient patient1 = new Patient(123,"Aldavergenova","Ailin","Omarqyzy","Taraz", "87078871243",150, "Delirum");
//        Patient patient2 = new Patient(345,"Sagatova","Kamila","Zhamylbekqyzy","Astana",  "87078871243",155,"Dementia");
//        Patient patient3 = new Patient(567,"Omarova","Ulpan","Yerassylqyzy","Aktau", "87078871243",160, "Alcohol");
//        Patient patient4 = new Patient(789,"Talqarova","Samal","Igemberdiqyzy","Almaty", "87078871243",165, "Mood disorders");
//        Patient patient5 = new Patient(213,"Omirbekova","Yuki","Uristembekqyzy","Oskemen", "87078871243",170, "Schizophrenia");
//        Patient patient6 = new Patient(456,"Zhaparova","Raushan","Omirbekqyzy","Shymkent", "87078871243",175, "Sleep disorder");
//        ArrayList<Patient> patientsArrayList = new ArrayList<>();
//        patientsArrayList.add(patient1);
//        patientsArrayList.add(patient2);
//        patientsArrayList.add(patient3);
//        patientsArrayList.add(patient4);
//        patientsArrayList.add(patient5);
//        patientsArrayList.add(patient6);
//
//        ArrayList<Patient> ateroskleroz = new ArrayList<>();
//        String Delirum_diagn = "Delirum";
//        for(Patient s:patientsArrayList){
//            if(s.getDiagnosis()==Delirum_diagn){
//                ateroskleroz.add(s);
//            }
//        }
//        System.out.println("Patients:Delirum:");
//        for(Patient f:ateroskleroz){
//            System.out.println(f);
//        }
//
//        int first = 150;
//        int second = 165;
//        ArrayList<Patient> interval = new ArrayList<>();
//        for(Patient s:patientsArrayList){
//            if(s.getMedical_record_number()>=first && s.getMedical_record_number()<=second){
//                interval.add(s);
//            }
//        }
//        System.out.println(" interval of patients 150-165");
//        for(Patient f: interval){
//            System.out.println(f);
//        }
//    }
//}
//class Patient{
//    int id;
//    String surname;
//    String title;
//    String patronymic;
//    String address;
//    String phone_number;
//    int medical_record_number;
//    String diagnosis;
//    public Patient(int id,String surname,String title,String patronymic,String address,String phone_number,int medical_record_number,String diagnosis){
//        this.id = id;
//        this.surname = surname;
//        this.title = title;
//        this.patronymic = patronymic;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.medical_record_number = medical_record_number;
//        this.diagnosis = diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", title='" + title + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", medical_record_number=" + medical_record_number +
//                ", diagnosis='" + diagnosis + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getMedical_record_number() {
//        return medical_record_number;
//    }
//
//    public void setMedical_record_number(int medical_record_number) {
//        this.medical_record_number = medical_record_number;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//}

//problem5
//import java.util.ArrayList;
//
//
//public class Main {
//    public static void main(String[] args) {
//        Book book1 = new Book(1,"malenkyi prins","Sam","Astana",1998,240,"5000","kitap");
//        Book book2 = new Book(2,"To myself tenderly","Oksana","Korea",2002,260,"6000","kitap");
//        Book book3 = new Book(3,"Joie de vivro","Aruzhan","America",2003,280,"7000","kitap");
//        Book book4 = new Book(4,"Ekinshi bolma","Timur","Dubai",2006,340,"1800","kitap");
//        Book book5 = new Book(5,"Koshpendiler","Tamir","Taraz",2008,360,"9000","kitap");
//        Book book6 = new Book(6,"Mahabbat qyzyq mol zhyldar","Dana","Aktau",2010,450,"10000","kitap");
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//        bookArrayList.add(book1);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        bookArrayList.add(book4);
//        bookArrayList.add(book5);
//        bookArrayList.add(book6);
//        String author_google = "Oksana";
//        ArrayList<Book> author = new ArrayList<>();
//        for(Book d:bookArrayList){
//            if(d.getAuthor()==author_google){
//                author.add(d);
//            }
//        }
//        System.out.println(author);
//
//
//        String publisher_astana = "America";
// ArrayList<Book> publisher = new ArrayList<>();
// for(Book d:bookArrayList){
//            if(d.getPublisher()==publisher_astana){
//                publisher.add(d);
//            }
//        }
//        System.out.println(publisher);
//
//
//
//        int year = 1998;
//        ArrayList<Book> years = new ArrayList<>();
//        for(Book d:bookArrayList){
//            if(d.getYear()>1998){
//                years.add(d);
//            }
//        }
//        System.out.println(years);
//    }
//}
//class Book{
//    int id;
//    String title;
//    String author;
//    String publisher;
//    int year;
//    int numofpages;
//    String price;
//    String type_of_binding;
//
//    public Book(int id, String title, String author, String publisher, int year, int numofpages, String price, String type_of_binding) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.publisher = publisher;
//        this.year = year;
//        this.numofpages = numofpages;
//        this.price = price;
//        this.type_of_binding = type_of_binding;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", year=" + year +
//                ", numofpages=" + numofpages +
//                ", price='" + price + '\'' +
//                ", type_of_binding='" + type_of_binding + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getNumofpages() {
//        return numofpages;
//    }
//
//    public void setNumofpages(int numofpages) {
//        this.numofpages = numofpages;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public String getType_of_binding() {
//        return type_of_binding;
//    }
//
//    public void setType_of_binding(String type_of_binding) {
//        this.type_of_binding = type_of_binding;
//    }
//}


//problem4
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        applicant applicant1 = new applicant(1,"Aldavergenova","Ailin","Omarqyzy","Astana","87078871243",60);
//        applicant applicant2 = new applicant(2,"Sagatova","Almagul","Zhamylbekqyzy","Taraz","87078871243",75);
//        applicant applicant3 = new applicant(3,"Omarova","Tora","Yerassylqyzy","Aktau","87078871243",80);
//        applicant applicant4 = new applicant(4,"Talqarova","Yuki","Igemberdiqyzy","Shymkent","87078871243",50);
//        applicant applicant5 = new applicant(5,"Omirbekova","Ulbosh","Uristembekqyzy","Semey","87078871243",70);
//        applicant applicant6 = new applicant(6,"Zhaparova","Dana","Omirbekqyzy","Oskemen","87078871243",100);
//
//        ArrayList<applicant> applicantArrayList = new ArrayList<>();
//        applicantArrayList.add(applicant1);
//        applicantArrayList.add(applicant2);
//        applicantArrayList.add(applicant3);
//        applicantArrayList.add(applicant4);
//        applicantArrayList.add(applicant5);
//        applicantArrayList.add(applicant6);
//
//        ArrayList<applicant> not_good_marks = new ArrayList<>();
//        for(applicant f: applicantArrayList){
//            if(f.getMarks()<50){
//                not_good_marks.add(f);
//            }
//        }
//        System.out.println("unsatisfactory grades:");
//        for (applicant d:not_good_marks) {
//            System.out.println(d);
//        }
//
//        int mark = 75;
//        ArrayList<applicant> more_than = new ArrayList<>();
//        for(applicant d:applicantArrayList){
//            if(d.getMarks()>mark){
//                more_than.add(d);
//            }
//        }
//        System.out.println("higher than the specified one");
//        for(applicant f:more_than){
//            System.out.println(f);
//        }
//
//        int n = 3;
//        Collections.sort(applicantArrayList,new SortByMarks());
//        ArrayList<applicant> themost = new ArrayList<>();
//        System.out.println("highest total score");
//        for(int i = 0;i<n;i++){
//            themost.add(applicantArrayList.get(i));
//        }
//        System.out.println(themost);
//
//
//        for(applicant f:applicantArrayList){
//            if(f.getMarks()>70){
//                System.out.println(f);
//            }
//        }
//
//    }
//}
//class SortByMarks implements Comparator<applicant> {
//
//    @Override
//    public int compare(applicant first, applicant second) {
//        if(first.getMarks() == second.getMarks()){
//            return 0;
//        }else if(first.getMarks()>second.getMarks()){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
//}
//class applicant{
//    int id;
//    String surname;
//    String title;
//    String Patronymic;
//    String address;
//    String phone_number;
//    int marks;
//
//    public applicant(int id, String surname, String title, String Patronymic, String address, String phone_number, int marks) {
//        this.id = id;
//        this.surname = surname;
//        this.title = title;
//        this.Patronymic = Patronymic;
//        this.address = address;
//        this.phone_number = phone_number;
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "applicant{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", title='" + title + '\'' +
//                ", patronymic='" + Patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getPatronymic() {
//        return Patronymic;
//    }
//
//    public void setPatronymic(String Patronymic) {
//        this.Patronymic = Patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}



////Problem7
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main{
// public static void main(String[] args) {
// Phone phone1 = new Phone(1,"Kambar","Yerassyl","Omarqyzy","Taraz",100,256,5,5);
// Phone phone2 = new Phone(2,"Eralieva","Assel","Zhamalqyzy","Almaty",200,257,4,10);
// Phone phone3 = new Phone(3,"Talgatova","Assem","Rusramqyzy","Astana",300,258,3,14);
//     Phone phone5 = new Phone(4,"Shyrymbetova","Yuki","Uristembekqyzy","Oskemen",259,2,8,16);
//     Phone phone4 = new Phone(5,"Assangalieva","Aruzhan","Daurenqyzy","Aktau",500,260,1,17);
//     Phone phone6 = new Phone(6,"Turarova","Aliya","Erzhanqyzy","Oskemen",600,261,6,20);
// ArrayList<Phone> phoneArrayList = new ArrayList<>();
// phoneArrayList.add(phone1);
// phoneArrayList.add(phone2);
// phoneArrayList.add(phone3);
// phoneArrayList.add(phone4);
// phoneArrayList.add(phone5);
// phoneArrayList.add(phone6);
//
//        int time_exceeds = 14;
//        ArrayList<Phone> exceed_time = new ArrayList<>();
//        for(Phone s:phoneArrayList){
//            if(s.getTime()>time_exceeds){
//                exceed_time.add(s);
//            }
//        }
//        System.out.println(exceed_time);
//
//
//        ArrayList<Phone> intercity = new ArrayList<>();
//        for(Phone s:phoneArrayList){
//            if(s.getTime()>0){
//                intercity.add(s);
//            }
//        }
//        System.out.println(intercity);
//
//        Collections.sort(phoneArrayList,new SortByName());
//    }
//}
//
//class Phone{
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String address;
//    int credit_card_num;
//    int debit;
//    int credit;
//    int time;
//
//    public Phone(int id, String surname, String name, String patronymic, String address, int credit_card_num, int debit, int credit, int time) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.address = address;
//        this.credit_card_num = credit_card_num;
//        this.debit = debit;
//        this.credit = credit;
//        this.time = time;
//    }
//
//    @Override
//    public String toString() {
//        return "Phone{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", address='" + address + '\'' +
//                ", credit_card_num=" + credit_card_num +
//                ", debit=" + debit +
//                ", credit=" + credit +
//                ", time=" + time +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getCredit_card_num() {
//        return credit_card_num;
//    }
//
//    public void setCredit_card_num(int credit_card_num) {
//        this.credit_card_num = credit_card_num;
//    }
//
//    public int getDebit() {
//        return debit;
//    }
//
//    public void setDebit(int debit) {
//        this.debit = debit;
//    }
//
//    public int getCredit() {
//        return credit;
//    }
//
//    public void setCredit(int credit) {
//        this.credit = credit;
//    }
//
//    public int getTime() {
//        return time;
//    }
//
//    public void setTime(int time) {
//        this.time = time;
//    }
//}
//class SortByName implements Comparator<Phone> {
//
//    @Override
//    public int compare(Phone first, Phone second) {
//        return first.getName().compareTo(second.getName());
//    }
//}


//problem6
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<House> houseArrayList = new ArrayList<>();
//        House house1 = new House(12, 34, 230, 4, 4, "8 mkr", "drywall", 22);
//        House house2 = new House(13, 44, 250, 3,  3, "6 mkr", "drywall", 10);
//        House house3 = new House(14, 55, 370, 2,  2, "5 mkr", "drywall", 20);
//        House house4 = new House(15, 66, 480, 1,  1, "4 mkr", "drywall", 15);
//        House house5 = new House(16, 77, 260, 7, 5, "3 mkr", "drywall", 8);
//        houseArrayList.add(house1);
//        houseArrayList.add(house2);
//        houseArrayList.add(house3);
//        houseArrayList.add(house4);
//        houseArrayList.add(house5);
//             for (House s : houseArrayList){
//            if (s.getnumber_of_rooms() == 3){
//                System.out.println(s.apartment_number + ": " + s.getnumber_of_rooms() + ":room");
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.getnumber_of_rooms() == 4){
//                if (s.getFloor() > 1 && s.getFloor() < 4){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.area > 230){
//                System.out.println(s.apartment_number + " area: " + s.area);
//            }
//        }
//    }
//}
//
//class House{
//    int id;
//    int apartment_number;
//    int area;
//    int floor;
//    int number_of_rooms;
//    String street;
//    String buildingtype;
//    int lifetime;
//
//    public House (int id, int apartment_number, int area, int floor, int number_of_rooms, String street, String buildingtype, int lifetime){
//        this.id = id;
//        this.apartment_number = apartment_number;
//        this.area = area;
//        this.floor = floor;
//        this.number_of_rooms = number_of_rooms;
//        this.street = street;
//        this.buildingtype = buildingtype;
//        this.lifetime = lifetime;
//    }
//
//    @Override
//    public String toString() {
//        return "House{" +
//                "id=" + id +
//                ", apartment_number=" + apartment_number +
//                ", area=" + area +
//                ", floor=" + floor +
//                ", number_of_rooms=" + number_of_rooms +
//                ", street='" + street + '\'' +
//                ", buildingtype='" + buildingtype + '\'' +
//                ", lifetime=" + lifetime +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getapartment_number() {
//        return apartment_number;
//    }
//
//    public void setapartment_number(int apartment_number) {
//        this.apartment_number = apartment_number;
//    }
//
//    public int getArea() {
//        return area;
//    }
//
//    public void setArea(int area) {
//        this.area = area;
//    }
//
//    public int getFloor() {
//        return floor;
//    }
//
//    public void setFloor(int floor) {
//        this.floor = floor;
//    }
//
//    public int getnumber_of_rooms() {
//        return number_of_rooms;
//    }
//
//    public void setnumber_of_rooms(int number_of_rooms) {
//        this.number_of_rooms = number_of_rooms;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getbuildingtype() {
//        return buildingtype;
//    }
//
//    public void setbuildingtype(String buildingtype) {
//        this.buildingtype = buildingtype;
//    }
//
//    public int getlifetime() {
//        return lifetime;
//    }
//
//    public void setlifetime(int lifetime) {
//        this.lifetime = lifetime;
//    }
//}


//problem10
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Train> trainsArrayList = new ArrayList<>();
//        Train train1 = new Train("Germany", 1, "10:30", 150);
//        Train train2 = new Train("Kyrgyzstan", 2, "12:20", 200);
//        Train train3 = new Train("Belarus ", 3, "15:10", 250);
//        Train train4 = new Train("India ", 4, "18:00", 300);
//        Train train5 = new Train("Israel ", 5, "22:50", 350);
//
//        trainsArrayList.add(train1);
//        trainsArrayList.add(train2);
//        trainsArrayList.add(train3);
//        trainsArrayList.add(train4);
//        trainsArrayList.add(train5);
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Germany")){
//                System.out.println(s);
//            }
//        }
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Germany")){
//                if (s.departuretime.equals("10:30")){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Germany")){
//                if (s.seats == 150){
//                    System.out.println(s);
//                }
//            }
//        }
//    }
//}
//
//class Train{
//    String destination;
//    int trainnumber;
//    String departuretime;
//    int seats;
//
//    public Train(String destination, int trainnumber, String departuretime, int seats){
//        this.destination = destination;
//        this.trainnumber = trainnumber;
//        this.departuretime = departuretime;
//        this.seats = seats;
//    }
//
//    @Override
//    public String toString() {
//        return "Train{" +
//                "destination='" + destination + '\'' +
//                ", trainnumber=" + trainnumber +
//                ", departuretime='" + departuretime + '\'' +
//                ", quantityOfPlaces=" + seats +
//                '}';
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public int gettrainnumber() {
//        return trainnumber;
//    }
//
//    public void settrainnumber(int trainnumber) {
//        this.trainnumber = trainnumber;
//    }
//
//    public String getdeparturetime() {
//        return departuretime;
//    }
//
//    public void setdeparturetime(String departuretime) {
//        this.departuretime = departuretime;
//    }
//
//    public int getseats() {
//        return seats;
//    }
//
//    public void setseats(int seats) {
//        this.seats = seats;
//    }
//}

//problem9
//import java.util.ArrayList;
//import java.util.concurrent.atomic.AtomicReferenceArray;
//
//public class Main{
// public static void main(String[] args) {
// Product product1 = new Product(1,"Lexus","222222 ","Oman ",500000,12,30);
// Product product2= new Product(2,"Ford","333333","Egypt ",700000,16,40);
// Product product3 = new Product(3,"Cadillac","444444 ","Croatia ",800000,19,50);
// Product product4 = new Product(4,"BMW","555555 ","Spain ",900000,21,60);
//
// ArrayList<Product> productArrayList = new ArrayList<>();
// productArrayList.add(product1);
// productArrayList.add(product2);
// productArrayList.add(product3);
// productArrayList.add(product4);
//
//
//
//
// String name_tabu = "Lexus";
// ArrayList<Product> names = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==name_tabu){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
//
// String names_tabu = "Cadillac";
// int baga_kerek = 800000;
// ArrayList<Product> name = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==name_tabu && s.getPrice()<800000){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
//
// int time = 2;
// ArrayList<Product> id = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.shelflife>time){
// names.add(s);
//            }
//        }
// System.out.println(names);
//    }
//}
//
//class Product{
//    int id;
//    String name;
//    String UPC;
//    String manufacturer;
//    int price;
//    int shelflife;
//    int quantity;
//
//    public Product(int id, String name, String UPC, String manufacturer, int price, int shelflife, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.UPC = UPC;
//        this.manufacturer = manufacturer;
//        this.price = price;
//        this.shelflife = shelflife;
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", UPC='" + UPC + '\'' +
//                ", manufacturer='" + manufacturer + '\'' +
//                ", price=" + price +
//                ", shelflife=" + shelflife +
//                ", quantity =" + quantity  +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUPC() {
//        return UPC;
//    }
//
//    public void setUPC(String UPC) {
//        this.UPC = UPC;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getShelflife() {
//        return shelflife;
//    }
//
//    public void setShelflife(int shelflife) {
//        this.shelflife = shelflife;
//    }
//
//    public int getQuantity () {
//        return quantity ;
//    }
//
//    public void setQuantity (int quantity ) {
//        this.quantity  = quantity ;
//    }
//}

//problem8
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        Car car1 = new Car(1, "Ford", "100", 1998, "violet", 2000, "7890");
//        Car car2 = new Car(2, "Lexus", "90", 1997, "white", 6000, "2345");
//        Car car3 = new Car(3, "Honda", "80", 1999, "yellow", 8000, "5678");
//        Car car4 = new Car(4, "BMW", "70", 2000, "red", 1500, "6666");
//        Car car5 = new Car(5, "Cadillac", "60", 2005, "green", 9000, "8888");
//
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//        carArrayList.add(car4);
//        carArrayList.add(car5);
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Lexus")){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Cadillac") && s.yearissue < 2022){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.yearissue == 2005 && s.price > 3000){
//                System.out.println(s);
//            }
//        }
//    }
//}
//
//class Car{
//    int id;
//    String brand;
//    String model;
//    int yearissue;
//    String color;
//    int price;
//    String registrationNum;
//
//    public Car(int id, String brand, String model, int yearissue, String color, int price, String registrationNum){
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.yearissue = yearissue;
//        this.color = color;
//        this.price = price;
//        this.registrationNum = registrationNum;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", yearissue=" + yearissue +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", registrationNum='" + registrationNum + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getbrand() {
//        return brand;
//    }
//
//    public void setbrand(String stamp) {
//        this.brand = stamp;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getyearissue() {
//        return yearissue;
//    }
//
//    public void setyearissue(int yearissue) {
//        this.yearissue = yearissue;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getRegistrationNum() {
//        return registrationNum;
//    }
//
//    public void setRegistrationNum(String registrationNum) {
//        this.registrationNum = registrationNum;
//    }
//}
