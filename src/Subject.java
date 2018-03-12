import java.util.ArrayList;
import java.util.List;

public class Subject implements  ISubject {

     private   List<IObServce> servceList=new ArrayList<>(); //订阅者集合
    @Override

    public void add(IObServce obServce) {
        servceList.add(obServce);
    }

    @Override
    public void remove(IObServce obServce) {
        servceList.remove(obServce);
    }

    @Override
    public void showMes(String showmes) {
        for (IObServce service:servceList
             ) {
            service.Update(showmes);
        }
    }

    @Override
    public void showMes(String mes, RegistrationCenter registrationCenter) {
        registrationCenter.push(mes);
    }

}
