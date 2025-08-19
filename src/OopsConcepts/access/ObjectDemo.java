package OopsConcepts.access;

public class ObjectDemo {
// finalize comes when the garbage collector is called
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
// tostring tells how it's converts the string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectDemo{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo();
        System.out.println(obj.hashCode());
    }
}
