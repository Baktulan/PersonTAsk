public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation,String companyName) {
        super(name, designation);
        this.groupName =companyName;
    }
    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    public String getGroupName(){
        return groupName;
    }

    public void dancing(){
        System.out.println(getName()+" is dancing");
    }

    @Override
    public String toString() {
        return "Dancer:" +
                "companyName: " + groupName + "\n"+ super.toString();
    }
}
