package observer.solution.old;

import observer.problwm.Chart;
import observer.problwm.DataSource;
import observer.problwm.SpreadSheet;

public class Client {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        Chart chart = new Chart();
        SpreadSheet spreadSheet = new SpreadSheet();

        System.out.println(dataSource.getValue());

        DataSourceObserver observer = new DataSourceObserver(dataSource, new Observer() {
            @Override
            public void onChanged(DataSource dataSource) {
                chart.communicate(dataSource);
                spreadSheet.expose(dataSource);
            }
        });

        observer.setData("12 Persons");
    }
}
