package exception;

import java.awt.*;
import java.io.IOException;

/**
 * 当子类重写超类中含有throws声明异常抛出的方法时,对throws的重写规则
 *
 * @Author Izaro
 * @Date 2021/1/30 10:36
 */
public class ThrowsDemo {
    public void dosome() throws IOException, AWTException {
    }
}

class SubClass extends ThrowsDemo {
//    @Override
//    public void dosome()throws IOException,AWTException{}
//    允许不再抛出任何异常

//    @Override
//    public void dosome(){}
//    允许仅抛出部分异常
//    @Override
//    public void dosome()throws IOException{}
//    允许抛出超类方法抛出异常的子类型异常

//    @Override
//    public void dosome() throws FileNotFoundException {
//    }
//    @Override
//    public void dosome() throws SQLException{}
//    @Override
//    public void  dosome()throws Exception{}
}
