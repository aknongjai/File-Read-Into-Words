import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

class is {

    public static void n(File in1,File in2,File output) throws Exception{
        PrintWriter pw = new PrintWriter(output);
//            File f=new File("D:\\File Read into words\\src\\file1.txt");
//            FileReader fr=new FileReader(f);
        BufferedReader br = new BufferedReader(new FileReader(in1));
        String line = br.readLine();
        // loop to copy each line of
        // file1.txt to  file3.txt
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader(in2));

        line = br.readLine();

        // loop to copy each line of
        // file2.txt to  file3.txt
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        System.out.println("Merged");
//            File file = new File("D:\\File Read into words\\file3.txt");// double backslash is to avoid compiler interpret as words for example \test as \t (ie. as a escape sequence)
//        BufferedReader Br = new BufferedReader(new FileReader(output));
//        ArrayList<String> st=new ArrayList<String>();
//        String s=Br.readLine();
//        while(s!= null){
//            // System.out.println(s);
//            st.add(s);
//            s=Br.readLine();
//        }
//        for(int i=0;i<st.size();i++){
//            System.out.println(st.get(i));
//        }
    }
    public static void duplicate(File file,File out)throws Exception{
        // PrintWriter object for output.txt
        PrintWriter pw = new PrintWriter(out);
        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader(file));

        String line1 = br1.readLine();

        // loop for each line of input.txt
        while(line1 != null)
        {
            boolean flag = false;

            // BufferedReader object for output.txt
            BufferedReader br2 = new BufferedReader(new FileReader(out));

            String line2 = br2.readLine();

            // loop for each line of output.txt
            while(line2 != null)
            {

                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }

                line2 = br2.readLine();

            }

            // if flag = false
            // write line of input.txt to output.txt
            if(!flag){
                pw.println(line1);

                // flushing is important here
                pw.flush();
            }

            line1 = br1.readLine();

        }

        // closing resources
        br1.close();
        pw.close();

        System.out.println("File operation performed successfully");
    }
    public static void print(File f)throws Exception{
        BufferedReader Br = new BufferedReader(new FileReader(f));
        ArrayList<String> st=new ArrayList<String>();
        String s=Br.readLine();
        while(s!= null){
            // System.out.println(s);
            st.add(s);
            s=Br.readLine();
        }
        for(int i=0;i<st.size();i++){
            System.out.println(st.get(i));
        }
        System.out.println("word Count is "+st.size());
    }
}
public class Read {
    public static is ob=new is();

    public static void main(String[] args)throws Exception
        {

            ArrayList<String> ta=new ArrayList<String>();
            ta.add("milk");
            ta.add("cheese");
            String esum=ta.get(0);
            System.out.println("is "+esum);
            ob.n(new File("D:\\File Read into words\\src\\file1.txt"),new File("D:\\File Read into words\\src\\file2.txt"),new File("D:\\File Read into words\\file3.txt"));
           ob.duplicate(new File("D:\\File Read into words\\file3.txt"),new File("D:\\File Read into words\\file1.txt"));

            ob.print(new File("D:\\File Read into words\\file1.txt"));
            ob.print(new File("D:\\File Read into words\\src\\file1.txt"));
            ob.print(new File("D:\\File Read into words\\src\\file2.txt"));
           int t=1;
            for(int i=1;i<=4;i++){
                t=t*i;
            }
            System.out.println(t);

        }

}
/*All Rights Reserved
Nongjaimayum Annas khan
Husband of Ph Tabasum Sahani
*/