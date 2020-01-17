package team.gif.robot;

import java.io.*;

public class Globals {

    //public static FileReader r;
    //public static BufferedReader reader;
    //public static FileWriter writer;
    //public static File file;

    public double shooterSpeed = 0.7;
    public double kPx = .02;
    public double marginx = 5;
    public double kFx = .1;

    public double kPy = .02;
    public double marginy = 5;
    public double kFy = .1;
    // defaults above
/*

    public static void init() {
        try {
            file = new File("C:\\...\\test.txt");// i dont know how we are going to implement this on ri
            r = new FileReader(file);
            writer = new FileWriter(file);
            reader = new BufferedReader(r);
        }catch (FileNotFoundException e ) {
            System.out.println("file not found");
        }catch (IOException a){
            System.out.println("Io exception failure");
        }




    }



    public static void savedouble(String tag, double value ){
        for (int line =0;;line++){//look for number overwrite number underneath
            //if not found create new number and value
            if (tag = reader.readLine(line)){
                break;
            }
        }
        loader.append(tag);
        loader.append( String.valueOf(value));
    }

*/
}