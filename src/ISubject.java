/*
发布者
 */
public interface ISubject {
    void add(IObServce obServce);  //添加订阅者
    void remove(IObServce obServce); //移除订阅者
    void showMes(String showmes);  //订阅目标发出消息
    void showMes(String mes,RegistrationCenter registrationCenter);

}
