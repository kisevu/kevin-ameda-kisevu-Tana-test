package com.ameda.tana.test.tests.Question7;


import com.ameda.tana.test.Question7.Node;
import com.ameda.tana.test.Question7.Question7_RotateList;
import org.junit.jupiter.api.Test;

import static com.ameda.tana.test.Question7.Question7_RotateList.stringify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Author: kev.Ameda
 */
public class Question7_RotateListTest {
    @Test
    public void test_rotate_by_2() {
        String[] values = {"ID_A01", "ID_A02", "ID_A03", "ID_A04", "ID_A05", "ID_A06"};
        Node head = Question7_RotateList.buildList(values);
        Node result = Question7_RotateList.rotateRight(head, 2);
        assertEquals("ID_A05->ID_A06->ID_A01->ID_A02->ID_A03->ID_A04->null", stringify(result));
    }

    @Test
    public void test_rotate_by_0() {
        String[] values = {"ID_A01", "ID_A02"};
        Node head = Question7_RotateList.buildList(values);
        Node result = Question7_RotateList.rotateRight(head, 0);
        assertEquals("ID_A01->ID_A02->null", stringify(result));
    }

    @Test
    public void test_rotate_by_length() {
        String[] values = {"A", "B", "C"};
        Node head = Question7_RotateList.buildList(values);
        Node result = Question7_RotateList.rotateRight(head, 3);
        assertEquals("A->B->C->null", stringify(result));
    }

    @Test
    public void test_rotate_more_than_length() {
        String[] values = {"1", "2", "3", "4", "5", "6", "7"};
        Node head = Question7_RotateList.buildList(values);
        Node result = Question7_RotateList.rotateRight(head, 9);
        assertEquals("6->7->1->2->3->4->5->null", stringify(result));
    }

    @Test
    public void test_empty_list() {
        String[] values = {};
        Node head = Question7_RotateList.buildList(values);
        Node result = Question7_RotateList.rotateRight(head, 3);
        assertNull(result);
    }

    @Test
    public void test_single_node() {
        String[] values = {"X"};
        Node head = Question7_RotateList.buildList(values);
        Node result = Question7_RotateList.rotateRight(head, 5);
        assertEquals("X->null", stringify(result));
    }


}
