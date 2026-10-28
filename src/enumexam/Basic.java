package enumexam;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        //enum constants
        //public ,static , final
        //since it is final no child enums
        //type is week
    }

    public static void main(String[] args) {
        Week week;
        week =Week.Monday;
        for(Week day:Week.values()){
            System.out.println(day );
        }
    }
}

