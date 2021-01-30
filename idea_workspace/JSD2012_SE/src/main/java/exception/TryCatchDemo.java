package exception;

/**
 * 异常处理机制中的try-catch
 *
 * @Author Izaro
 * @Date 2021/1/29 15:07
 */
public class TryCatchDemo {
    /**
     * 如果str为null时,当虚拟机执行到下面的代码会发现这里存在
     * <p>
     * 空指针现象,于是虚拟机会实例化一个空指针异常的实例,并将其
     * <p>
     * 抛出.抛出后会检查报错的这句话是否被异常处理机制控制,如
     * <p>
     * 果没有则会将该异常抛出到当前方法外面,由调用该方法的代码
     * <p>
     * 却解决(这里相当于抛出到main方法外面).
     */
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        try {
            String str="abc";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            //try语句块中报错代码以下内容都不会被执行!!
            System.out.println("!!!!!!!!!!!!!!!!!!!");
        } catch (NullPointerException e) {
            System.out.println("WRONG");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("字符串下标越界了!");

        /*
        catch超类异常的意义:
        当try中某几类异常希望使用相同方法时,可以catch这些异常的超类.
        在最后一个catch处捕获Exception也可以避免因为一个未处理的异常导致程序中断.

        当多个catch的异常之间存在继承关系时,子类型异常要在上面先行捕获,超类异常在下.否则编译不通过.
         */
        }catch(Exception e){
            System.out.println("反正就是出了个错!");
        }
        System.out.println("程序结束了...");

    }
}
