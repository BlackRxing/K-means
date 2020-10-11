import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<float[]> dataSet = new ArrayList<float[]>();

        dataSet.add(new float[] { 0,0 });
        dataSet.add(new float[] { 3,8 });
        dataSet.add(new float[] { 2,2 });
        dataSet.add(new float[] { 1,1 });
        dataSet.add(new float[] { 5,3 });
        dataSet.add(new float[] { 4,8 });
        dataSet.add(new float[] { 6,3 });
        dataSet.add(new float[] { 5,4 });
        dataSet.add(new float[] { 6,4 });
        dataSet.add(new float[] { 7,5 });

        KMeans kRun =new KMeans(2, dataSet);

        Set<Cluster> clusterSet = kRun.run();
        System.out.println("迭代次数："+kRun.getIterTimes());
        for (Cluster cluster : clusterSet) {
            System.out.println(cluster);
        }
    }
}