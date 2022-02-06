package com.company.google;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by yuriy_polyakevich at 2/6/22
 */

//Who would've guessed? Doomsday devices take a LOT of power.
//Commander Lambda wants to supplement the
//LAMBCHOP's quantum antimatter reactor core with solar arrays, and you've been tasked with setting up the solar panels.
//
//Due to the nature of the space station's outer paneling, all of its solar panels must be squares.
//Fortunately, you have one very large and flat area of solar material,
//a pair of industrial-strength scissors, and enough MegaCorp Solar Tape(TM)
//to piece together any excess panel material into more squares. For example,
//if you had a total area of 12 square yards of solar material,
//you would be able to make one 3x3 square panel (with a total area of 9).
//That would leave 3 square yards, so you can turn those into three 1x1 square solar panels.
//
//Write a function solution(area) that takes as its input a single
//unit of measure representing the total area of solar panels you have
//(between 1 and 1000000 inclusive) and returns a
//list of the areas of the largest squares you could make out of those panels,
//starting with the largest squares first. So, following the example above, solution(12) would return [9, 1, 1, 1].
public class SquareSolution {

    public static void main(String[] args) {
        solution(10_000);
    }

    public static int[] solution(int area) {
        final List<Integer> answers = new ArrayList<>();
        int right = (int) Math.sqrt(area);
        int left = 0;
        while (left <= right) {
        }
        return answers.stream().mapToInt(i -> i).toArray();
    }

}