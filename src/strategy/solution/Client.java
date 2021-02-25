package strategy.solution;

import strategy.solution.compressors.JPEGCompressor;
import strategy.solution.compressors.PNGCompressor;
import strategy.solution.filters.BlackWhiteFilter;
import strategy.solution.filters.ContractFilter;

public class Client {

    public static void main(String[] args) {

        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("AtFile.png", new PNGCompressor(), new ContractFilter());

        imageStorage.store("AtFile.Jpeg", new JPEGCompressor(), new BlackWhiteFilter());
    }
}
