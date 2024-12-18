public class ShallowCloneExample implements Cloneable {
    private StringBuilder name;
    public ShallowCloneExample(StringBuilder name) {
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public StringBuilder getName() {
        return name;
    }
    public void setName(StringBuilder name) {
        this.name = name;      }
    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuilder name = new StringBuilder("John");
        ShallowCloneExample original = new ShallowCloneExample(name);
        ShallowCloneExample clone = (ShallowCloneExample) original.clone();
        System.out.println("Original: " + original.getName());
        System.out.println("Clone: " + clone.getName());
        name.append(" Doe");
        System.out.println("Original after change: " + original.getName());
        System.out.println("Clone after change: " + clone.getName());
    }}

