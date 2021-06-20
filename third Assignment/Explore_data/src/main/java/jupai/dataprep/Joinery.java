package jupai.dataprep;

import joinery.DataFrame;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.util.Date;

public class Joinery {
    public static void main(String args[]){
        try {


            DataFrame<Object>  df= DataFrame.readCsv ("src/main/resources/data/titanic.csv")
                    .retain("pclass", "survived","name","age");
            for (int i = 0 ; i < df.length() ; i ++){
                System.out.println(df.row(i));

            }

            //getting the median of people who survived in each class
            DataFrame<Object> med =df.groupBy(row ->row.get(0)).median();
            System.out.println(df.groupBy(row ->row.get(0)).median());

            //getting the min of people who survived in each class
            DataFrame<Object>min =df.groupBy(row ->row.get(0)).min();

            //System.out.println(df.groupBy(row ->row.get(0) ).groupBy(row -> row.get(2)).min() );
            System.out.println(df.groupBy(row ->row.get(0) ).min() );

            //getting the max of people who survived in each class
            DataFrame<Object>max =df.groupBy(row ->row.get(0)).max();
            System.out.println(df.groupBy(row ->row.get(0)).max());

            //getting the standard diviation
            System.out.println(df.groupBy(row ->row.get(0)).stddev());

            /*
             merge max and median
             min.merge(max);
            System.out.println(min);
            */
            System.out.println ("=========================================================================================");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
