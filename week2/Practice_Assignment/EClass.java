class Employee {

    int eid;
    String ename;
    String eprojects[];

    public Employee(Employee e) {
        this.eid = e.eid;
        this.ename = e.ename;
        this.eprojects = e.eprojects;
    }
    public Employee(int id, String name, String[] projects) {
        this.eid = id;
        this.ename = name;
        this.eprojects = projects;
    }
    public void display(){
        System.out.println("eid: "+ eid);
        System.out.println("ename: "+ ename);
        System.out.println("eprojects: ");
        for(String s: eprojects){
            System.out.println(s);
        }
    }

    public void mutator(){
        this.ename = this.ename + "_IITM";
        this.eprojects[0] = "P6";
    }
}
class EClass {
    public static void main(String[] args) {
        String[] arr = {"P1", "P2"};
        Employee e1 = new Employee(12,"Alimul", arr);
        Employee e2 = new Employee(e1);
        e1.mutator();
        e1.display();
        e2.display();
    }
}



