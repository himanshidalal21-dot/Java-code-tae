// Interface
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class
class ImageProcessor implements Filterable {

    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter on Image (brightness/contrast adjusted).");
    }

    @Override
    public void reset_filter() {
        System.out.println("Image filters reset to original.");
    }
}

// DataAnalyzer class
class DataAnalyzer implements Filterable {

    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter on Data (cleaning/noise removal).");
    }

    @Override
    public void reset_filter() {
        System.out.println("Data filters reset to original dataset.");
    }
}

// Main class
public class Que8 {
    public static void main(String[] args) {

        // Using ImageProcessor
        Filterable img = new ImageProcessor();
        img.apply_filter("Blur");
        img.reset_filter();

        System.out.println();

        // Using DataAnalyzer
        Filterable data = new DataAnalyzer();
        data.apply_filter("Normalization");
        data.reset_filter();
    }
}