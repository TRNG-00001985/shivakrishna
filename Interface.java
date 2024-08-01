interface M{
    int RT=3;
    void shiva();
    void chinna();
}
interface K extends M{

}
abstract class B implements M{
    // @Override
    // public void shiva(){
    //     System.out.println("Character1");
    // }

    @Override
    public void chinna(){
        System.out.println("Character 2");
    }
}
public class Interface{
    public static void main(String[] args) {
        M n= new B();
        n.shiva();
        n.chinna();
        System.out.println(M.RT);

    }
}