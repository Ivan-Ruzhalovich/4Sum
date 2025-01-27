//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
    public static int maxArea(int[] height) {
        int heightLength = height.length;
        int first = 0;
        int last = heightLength-1;
        int square = 0;
        for (int i = 0; i < heightLength; i++) {
            square = Math.max(square,Math.min(height[last],
                    height[first])*Math.abs(first-last));
            if (height[first]>=height[last]) last--;
            else first++;
            if (first>=last) return square;
        }
        return square;
    }
}