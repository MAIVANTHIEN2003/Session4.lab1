package Session4.Lab1;

public class Main {
    public static void main(String args[]){
        PhoneBook pb = new PhoneBook();

        pb.insertPhone("Thien","0352804383");
        pb.insertPhone("Thien2","0837503456" );

        pb.insertPhone("Minh","0988174711");

        for (PhoneNumber pn : pb.PhoneList){
            System.out.println( "\t Name:"+pn.name);
            System.out.println( "\t Phone:"+pn.phone);
        }
        System.out.println("\t\t |||");

        pb.removePhone("luong");
        for (PhoneNumber pn : pb.PhoneList){
            System.out.println("\t Name:"+pn.name);
        }
        System.out.println("\t\t |||");

        pb.updatePhone("Thien2", "012345678");
        for (PhoneNumber pn : pb.PhoneList){
            System.out.println( "\t Name:"+pn.name);
            System.out.println( "\t Phone:"+pn.phone);
        }
        System.out.println("\t\t |||");

        pb.searchPhone("Minh");
        for (PhoneNumber pn : pb.PhoneList){

        }
        System.out.println("\t\t |||");

        pb.sort();

    }
}