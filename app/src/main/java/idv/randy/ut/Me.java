package idv.randy.ut;

import android.app.Application;
import android.content.Context;

public class Me extends Application {
    private static Context context;
    private static String ip = "http://10.0.2.2:8081/BA103G10/";
//    private static String ip = "http://10.120.38.3:8081/BA103G1/";
    public static final String MembersServlet = ip + "MembersServlet";
    public static final String PetServlet = ip + "PetServlet";

    //    public static final String PetServlet = "http://10.120.38.31:8081/BA103G1/PetServlet";
//    public static final String MembersServlet = "http://10.120.38.31:8081/BA103G1/MembersServlet";
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context gc() {
        return context;
    }

    public static void replaceFragment() {

    }
}
