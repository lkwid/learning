package behavioral.template;

public class CsvDataRenderer extends DataRenderer {

    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        return "Processed " + data;
    }

}
