import java.util.ArrayList;
import java.util.List;

public class RegistrationCenter{


    List<IObServce> obServceList=new ArrayList<>();// 观察者

    public void addObServer(IObServce obServce){
        obServceList.add(obServce);

    }

    public  void removeObServer(IObServce obServce){
        obServceList.add(obServce);
    }

    public  void push(String string){
        for (IObServce obServce:obServceList
             ) {
            obServce.Update(string);
        }
    }

}
