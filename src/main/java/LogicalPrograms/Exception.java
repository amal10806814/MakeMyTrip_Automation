package LogicalPrograms;

import javafx.scene.chart.ScatterChart;

public class Exception {

    public static void main(String[] args) {

        String s = null;

        try {
            if (s.equals("hello")) {
                System.out.println("value is same");
            } else {
                System.out.println("value not same");
            }
        }
            catch(NullPointerException e)
            {
                System.out.println("null pointer");
            }
    }
}
