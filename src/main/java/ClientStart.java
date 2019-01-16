import com.dubbo.service.HelloDubbo;
import com.dubbo.service.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientStart {
    public static void main(String[] args) throws Exception{
        System.out.println("客户度端启动......");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloDubbo helloDubbo = (HelloDubbo) context.getBean("helloDubboService");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldService");

       while (true){
           Thread.sleep(3000);
           System.out.println(helloDubbo.syaHello());
           System.out.println(helloWorld.helloWorld());
       }
    }
}
