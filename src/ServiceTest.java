import org.junit.Test;

public class ServiceTest {

    @Test
    public  void fun(){
        /*
        订阅者
         */
        ObServce obServce =new ObServce();
        ObServce obServce1 =new ObServce();
        ObServce obServce2 =new ObServce();
        ObServce obServce3 =new ObServce();


        Subject subject=new Subject(); // 发布者
        subject.add(obServce);
        subject.add(obServce2);
        subject.add(obServce3);
        subject.add(obServce1);
        //subject.showMes("我开始发消息啦");
    }


    @Test
    public  void fun1(){
        ObServce obServce =new ObServce();
        ObServce obServce1 =new ObServce();
        ObServce obServce2 =new ObServce();
        ObServce obServce3 =new ObServce();
        RegistrationCenter re=new RegistrationCenter();
        re.addObServer(obServce);
        re.addObServer(obServce1);
        re.addObServer(obServce2);
        re.addObServer(obServce3);

        Subject subject=new Subject();
        subject.showMes("你好",re);
    }
}
