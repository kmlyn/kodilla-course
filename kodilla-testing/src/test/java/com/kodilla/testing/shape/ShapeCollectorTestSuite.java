package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for ShapeCollector class")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for shapes")
    public class ShapeTester {
        @DisplayName("Return added shape")
        @Test
        public void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(1);

            //When
            shapeCollector.addShape(circle);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), circle);
        }

        @DisplayName("Remove existing shape")
        @Test
        public void testRemoveExistingShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(1);
            shapeCollector.addShape(circle);

            //When
            boolean result = shapeCollector.removeShape(circle);

            //Then
            Assertions.assertTrue(result);
        }

        @DisplayName("When given a non-empty collection, a non-null figure should be returned")
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(1);
            shapeCollector.addShape(circle);

            //When
            Shape shape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertNotNull(shape);
        }
    }
}
