package day01;

/**
 * 实现方法,完成获取下列文件名中的后缀名
 *
 * @author Xiloer
 * <p>
 * 单词记一记:
 * file   文件
 * name   名字           --->       fileName 文件名
 * <p>
 * ext 这里是单词extension的前三个字母，这里指"后缀"的意思。
 * 注:开发中当一个单词作为标识符命名比较长时，可以用类似方式简写
 * <p>
 * get 获取，获得
 * <p>
 * getExtByName 表示获取后缀根据名字
 * <p>
 * logo 商标，徽标
 */
public class Test01 {
    public static void main(String[] args) {
        String fileName1 = "logo.png";
        //要png
        String fileName2 = "jquery.1.1.2.js";
        //要js

        String ext = getExtByName(fileName1);
        System.out.println(ext);
        //png
        ext = getExtByName(fileName2);
        System.out.println(ext);
        //js
    }

    /**
     * 获取给定文件名中的后缀名部分
     *
     * @param name 文件名
     * @return
     */
    public static String getExtByName(String name) {
        int index = name.indexOf(".");
        int i = 0;
        for (int j = 0; j < name.length(); j++) {
            if (index == -1) {
                break;
            } else {
                i = index;
                index = name.indexOf(".", index + 1);
            }
        }
        return name.substring(i + 1);
    }
}
