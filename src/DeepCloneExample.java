public class DeepCloneExample implements Cloneable {
    private StringBuilder name;
    public DeepCloneExample(StringBuilder name) {
        this.name = name;	}
    public Object clone() throws CloneNotSupportedException {
        DeepCloneExample deepClone = (DeepCloneExample) super.clone();
        deepClone.name = new StringBuilder(name.toString());
        return deepClone;	}
    public StringBuilder getName() {
        return name;
    }
    public void setName(StringBuilder name) {
        this.name = name;	 }
    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuilder name = new StringBuilder("John");
        DeepCloneExample original = new DeepCloneExample(name);
        DeepCloneExample clone = (DeepCloneExample) original.clone();
        System.out.println("Original: " + original.getName());
        System.out.println("Clone: " + clone.getName());
        name.append(" Doe");
        System.out.println("Original after change: " + original.getName());
        System.out.println("Clone after change: " + clone.getName());
    }}



