package com.ameda.tana.test.tests.Question4;

import com.ameda.tana.test.Question4.Question4_UniqueProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Author: kev.Ameda
 */
public class Question4_UniqueProductTest {

    @Test
    void test_first_unique_product_normal_case() {
        String[] products = {"Python", "Java", "Python", "Go"};
        String result = Question4_UniqueProduct.firstUniqueProduct(products);
        assertEquals("Java", result);
    }

    @Test
    void test_first_unique_product_duplicates() {
        String[] products = {"Apple", "Apple", "Computer", "Computer"};
        String result = Question4_UniqueProduct.firstUniqueProduct(products);
        assertNull(result);
    }

    @Test
    void test_first_unique_product_single_element() {
        String[] products = {"OnlyOne"};
        String result = Question4_UniqueProduct.firstUniqueProduct(products);
        assertEquals("OnlyOne", result);
    }

    @Test
    void test_first_unique_product_empty_array() {
        String[] products = {};
        String result = Question4_UniqueProduct.firstUniqueProduct(products);
        assertNull(result);
    }

    @Test
    void test_first_unique_product_null_input() {
        String result = Question4_UniqueProduct.firstUniqueProduct(null);
        assertNull(result);
    }

    @Test
    void test_first_unique_product_multiple_uniques() {
        String[] products = {"A", "B", "A", "C", "D"};
        String result = Question4_UniqueProduct.firstUniqueProduct(products);
        assertEquals("B", result);
    }

}
