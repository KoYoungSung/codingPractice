package StringAndArray;

import java.util.*;




/*
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
*/

public class MergeInterval {

    public static void main(String[] args) {
        Interval in2 = new Interval(1, 3);
        Interval in1 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);
        MergeInterval a = new MergeInterval();
        List<Interval> list = a.merge(intervals);
        System.out.println(list);

    }

    private List<Interval> merge(List<Interval> intervals) {
        if(intervals.isEmpty()) return intervals;
        //1
        List<Interval> result = new ArrayList<>();

        Collections.sort(intervals, (a, b) -> a.start - b.start);
        //2
        Interval before = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (before.end >= current.start) {
                before.end = Math.max(before.end, current.end);
            } else {
                result.add(before);
                before = current;
            }
        }

        if (!result.contains(before)) {
            result.add(before);
        }
        return result;
    }

}
