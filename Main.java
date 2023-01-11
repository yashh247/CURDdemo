package basic.home;



import java.util.*;

class Student{
        private int ID;
        private String Name;
        private int Standard;

        Student(int ID,String Name,int Standard){
            this.ID=ID;
            this.Name= Name;
            this.Standard=Standard;
        }

        public int getID(){
            return ID;
        }

        public String getName(){
            return Name;
        }

        public int getStandard(){
            return Standard;

        }

        public String toString(){
            return ID+" "+Name+" "+Standard;

        }


    }

public class Main {


    public static void main(String[] args) {


        List<Student> S = new ArrayList<Student>();
        int option;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter your option : ");
            option = s.nextInt();


            switch (option) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = s.nextInt();
                    System.out.print("Enter Name: ");
                    String name = s1.nextLine();
                    System.out.print("Enter Standard: ");
                    int standard = s.nextInt();

                    S.add(new Student(id, name, standard));

                    break;

                case 2:
                    System.out.println("---------------");
                    Iterator<Student> i = S.iterator();
                    while (i.hasNext()) {
                        Student e = i.next();
                        System.out.println(e);
                    }

                    System.out.println("----------------");

                    break;

                case 3:

                    boolean found = false;
                    System.out.println("enter student id : ");
                    id = s.nextInt();

                    System.out.println("----------------");
                    i = S.iterator();

                    while (i.hasNext()) {

                        Student e = i.next();
                        if (e.getID() == id) {
                            System.out.println(e);
                            found = true;

                        }


                    }
                    if (!found){
                        System.out.println("record not found");
                        System.out.println("------------------");
                    }

                    break;

                case 4:

                    found = false;
                    System.out.println("enter student id to be deleted : ");
                    id = s.nextInt();

                    System.out.println("----------------");
                    i = S.iterator();

                    while (i.hasNext()) {

                        Student e = i.next();
                        if (e.getID() == id) {
                            i.remove();
                            found = true;

                        }

                    }
                    if (!found){
                        System.out.println("record not found");
                        System.out.println("------------------");
                    } else{
                        System.out.println("Record deleted successfully");
                    }

                    break;

                case 5:

                    found = false;
                    System.out.println("enter student id to be updated : ");
                    id = s.nextInt();

                    System.out.println("----------------");
                    ListIterator<Student>st = S.listIterator();

                    while (st.hasNext()) {

                        Student e = st.next();
                        if (e.getID() == id) {
                            System.out.println("Enter new name : ");
                            name = s1.nextLine();

                            System.out.println("Enter new standard : ");
                            standard = s.nextInt();

                            st.set(new Student(id,name,standard));
                            found = true;

                        }

                    }
                    if (!found){
                        System.out.println("record not found");
                        System.out.println("------------------");
                    } else{
                        System.out.println("Record updated successfully");
                    }
                    break;

            }

        } while (option != 0 ) ;
    }
}
