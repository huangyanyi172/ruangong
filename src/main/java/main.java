import Util.HammingUtils;
import Util.SimHashUtils;
import Util.TxtIOUtil;

public class main {

    public static void main(String[] args) {
        // 从命令行输入的路径名读取对应的文件
        String str0 = TxtIOUtil.readTxt(args[0]);
        String str1 = TxtIOUtil.readTxt(args[1]);
        String resultFileName = args[2];
        // 由字符串得出对应的 simHash值,求出相似度
        String simHash0 = SimHashUtils.getSimHash(str0);
        String simHash1 = SimHashUtils.getSimHash(str1);
        double similarity = HammingUtils.getSimilarity(simHash0, simHash1);
        // 把相似度写入结果文件
        TxtIOUtil.writeTxt(similarity, resultFileName);
        System.exit(0);
    }
}
