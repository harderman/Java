
interface Phone{
    public void BuyPhone();
}
class XiaoMi implements Phone{
    @Override
    public void BuyPhone() {
        System.out.println("谁他妈买小米！");
    }
}
class Iphone implements Phone{
    @Override
    public void BuyPhone() {
        System.out.println("买个苹果玩玩!");
    }
}
class PhoneFactory{
    private PhoneFactory(){}
    public static Phone getInterface(String classname) {
        Phone phone = null;
        try {
            phone = (Phone) Class.forName(classname).newInstance();

        }catch(InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phone;
    }
}
public class text_1 {
    public static void main(String[] args) {
    Phone phone = PhoneFactory.getInterface("XiaoMi");
    Phone phone1 = PhoneFactory.getInterface("Iphone");
    phone.BuyPhone();
    phone1.BuyPhone();
    }
}
