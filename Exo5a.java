import java.util.Calendar;
class Exo5a{
    public static void main(String[] argv) throws Exception{
        Calendar cal = Calendar.getInstance();
        int daynum = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(daynum);
  }
}