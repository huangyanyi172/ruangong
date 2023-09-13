import Util.HammingUtils;
import Util.SimHashUtils;
import Util.TxtIOUtil;
import org.junit.Test;

public class MainTest {

    @Test
    public void Test1(){
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str2 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_add.txt");
        String str3 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_del.txt");
        String str4 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_dis_1.txt");
        String str5 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_dis_10.txt");
        String str6 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_dis_15.txt");
        String ansFileName = "src/test/resources/test/test1.txt";
        double ans1 = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str1), SimHashUtils.getSimHash(str1));
        double ans2 = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str1), SimHashUtils.getSimHash(str2));
        double ans3 = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str1), SimHashUtils.getSimHash(str3));
        double ans4 = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str1), SimHashUtils.getSimHash(str4));
        double ans5 = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str1), SimHashUtils.getSimHash(str5));
        double ans6 = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str1), SimHashUtils.getSimHash(str6));
        TxtIOUtil.writeTxt(ans1, ansFileName);
        TxtIOUtil.writeTxt(ans2, ansFileName);
        TxtIOUtil.writeTxt(ans3, ansFileName);
        TxtIOUtil.writeTxt(ans4, ansFileName);
        TxtIOUtil.writeTxt(ans5, ansFileName);
        TxtIOUtil.writeTxt(ans6, ansFileName);
    }

    @Test
    public void Test2(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String ansFileName = "src/test/resources/test/test2.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void Test3(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_add.txt");
        String ansFileName = "src/test/resources/test/test3.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void Test4(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_del.txt");
        String ansFileName = "src/test/resources/test/test4.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void Test5(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_dis_1.txt");
        String ansFileName = "src/test/resources/test/test5.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void Test6(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_dis_10.txt");
        String ansFileName = "src/test/resources/test/test6.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void Test7(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_dis_15.txt");
        String ansFileName = "src/test/resources/test/test7.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans,ansFileName);
    }

    /**
     * 文件不存在异常测试
     * @throws Exception
     */
    @Test
    public void Test8() throws Exception {
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.8_dis_.txt");
        String ansFileName = "src/test/resources/test/test8.txt";
        if(str0 == "" || str1 == ""){
            throw new Exception("文件不存在");
        }
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    /**
     * 文件为空异常测试
     */
    @Test
    public void Test9(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.1.txt");
        String ansFileName = "src/test/resources/test/test9.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    /**
     * 文件字数太少异常测试
     */
    @Test
    public void Test10(){
        String str0 = TxtIOUtil.readTxt("src/test/resources/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("src/test/resources/test/orig_0.2.txt");
        String ansFileName = "src/test/resources/test/test10.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }
}