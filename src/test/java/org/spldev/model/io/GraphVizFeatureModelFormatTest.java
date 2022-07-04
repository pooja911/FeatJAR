package org.spldev.model.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.spldev.model.FeatureModel;
import org.spldev.model.io.xml.GraphVizFeatureModelFormat;
import org.spldev.model.io.xml.XMLFeatureModelFormat;
import org.spldev.util.io.FileHandler;

import java.io.IOException;
import java.nio.file.Paths;

public class GraphVizFeatureModelFormatTest {
	@Test
	public void graphVizFeatureModelFormat() throws IOException {
		FeatureModel featureModel = FileHandler.load(Paths.get(
			"src/test/resources/testFeatureModels/car.xml"), new XMLFeatureModelFormat()).get();
		Assertions.assertTrue(FileHandler.print(featureModel, new GraphVizFeatureModelFormat()).startsWith("digraph {"));
	}
}