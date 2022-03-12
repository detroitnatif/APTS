package APTS;
import java.lang.Math.sqrt;

public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2){
int counter = 0;
for(int i: x){
    int d = Math.sqrt( (Math.pow((x[i] - x1), 2)) +  (Math.pow((y[i] - y1), 2)));
    if(d<r[i]){
        counter += 1;
    }   
}
for(int j: x){
    int di = Math.sqrt( (Math.pow((x[j] - x1), 2)) +  (Math.pow((y[j] - y1), 2)));
    if(di<r[j]){
    counter += 1;
        }   
}
}}



System.out.prinln(counter);

    Public

    static void main(String[] args) {
    System.out.println(leastBorders((
        [1, -3, 2, 5, -4, 12, 12],
        [1, -1, 2, 5, 5, 1, 1],
        [8, 1, 2, 1, 1, 1, 2],
        -5,
        1,
        12,
        1,
    ))  
}

}
