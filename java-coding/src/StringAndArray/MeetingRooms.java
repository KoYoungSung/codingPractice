package StringAndArray;

import java.util.Arrays;
import java.util.Comparator;

class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end= 0;
    }
    Interval(int s, int e){
        this.start = s;
        this.end= e;
    }

}


public class MeetingRooms {
    public static void main(String[] args) {
        MeetingRooms a = new MeetingRooms();

        Interval in1 = new Interval(7, 10);
        Interval in2 = new Interval(2, 4);

        Interval[] intervals = {in1, in2};
        System.out.println(a.solve(intervals));

    }

    private boolean solve(Interval[] intervals) {
        if (intervals == null) return false;
        print(intervals);
        Arrays.sort(intervals, Comp);
        print(intervals);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) {
                return false;
            }
        }
        return true;

    }

    Comparator<Interval> Comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    };


    public void print(Interval[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            Interval in = intervals[i];
            System.out.println(in.start + " " + in.end);
        }
    }
}




