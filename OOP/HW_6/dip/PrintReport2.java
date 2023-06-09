package OOP.HW_6.dip;

import java.util.List;

public class PrintReport2 extends Output {
    
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f ", item.getDescription(), item.getAmount());
        }
    }
}
