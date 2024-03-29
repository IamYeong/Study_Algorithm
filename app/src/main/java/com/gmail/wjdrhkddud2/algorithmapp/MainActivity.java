package com.gmail.wjdrhkddud2.algorithmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.gmail.wjdrhkddud2.algorithmapp.Dijkstra.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView arrayText;
    private Button bubbleSortButton, selectionSortButton, insertionSortButton, shellSortButton,
            quickSortButton, heapSortButton, bucketSortButton, countingSortButton, radixSortButton, mergeSortButton, toSearchButton;
    private List<Integer> array;
    private ImageButton shuffleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayText = findViewById(R.id.tv_array);
        shuffleButton = findViewById(R.id.btn_shuffle);
        bubbleSortButton = findViewById(R.id.btn_bubble_sort);
        selectionSortButton = findViewById(R.id.btn_selection_sort);
        insertionSortButton = findViewById(R.id.btn_insertion_sort);
        shellSortButton = findViewById(R.id.btn_shell_sort);
        quickSortButton = findViewById(R.id.btn_quick_sort);
        mergeSortButton = findViewById(R.id.btn_merge_sort);
        radixSortButton = findViewById(R.id.btn_radix_sort);
        countingSortButton = findViewById(R.id.btn_counting_sort);
        heapSortButton = findViewById(R.id.btn_heap_sort);
        bucketSortButton = findViewById(R.id.btn_bucket_sort);
        toSearchButton = findViewById(R.id.btn_to_search);

        toSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shuffleArray(array);
            }
        });

        bubbleSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SortManager sortManager = new SortManager();
                sortManager.bubbleSort(array);

                updateArrayText();

            }
        });

        selectionSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SortManager sortManager = new SortManager();
                sortManager.selectionSort(array);

                updateArrayText();
            }
        });

        insertionSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SortManager sortManager = new SortManager();
                sortManager.insertionSort(array);

                updateArrayText();

            }
        });

        shellSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SortManager sortManager = new SortManager();
                sortManager.shellSort(array);

                updateArrayText();
            }
        });

        quickSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SortManager sortManager = new SortManager();
                sortManager.quickSort(array, 0, array.size() - 1);

                updateArrayText();

            }
        });

        mergeSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SortManager sortManager = new SortManager();
                sortManager.mergeSort(array, 0, array.size() - 1);

                updateArrayText();
            }
        });

        countingSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SortManager sortManager = new SortManager();
                sortManager.countingSort(array);

                updateArrayText();
            }
        });

        heapSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SortManager sortManager = new SortManager();
                sortManager.heapSort(array);

                updateArrayText();

            }
        });

        bucketSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SortManager sortManager = new SortManager();
                sortManager.bucketSort(array);

                updateArrayText();
            }
        });

        radixSortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SortManager sortManager = new SortManager();
                sortManager.radixSort(array);

                updateArrayText();

            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        //List<Integer> array1 = new ArrayList<>();
        array = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {

            array.add(i);

        }

        shuffleArray(array);
        updateArrayText();


        /*
        DijkstraTest d = new DijkstraTest(8);
        d.input("a","b",4);
        d.input("a","c",3);
        d.input("b","c",2);
        d.input("b","d",5);
        d.input("c","d",3);
        d.input("c","e",6);
        d.input("d","e",1);
        d.input("d","f",5);
        d.input("e","g",5);
        d.input("f","g",2);
        d.input("f","z",7);
        d.input("g","z",4);

        //시작점 a에서부터의 최단거리 및 최단경로 출력
        d.algorithm("a");

         */

    }

    private void shuffleArray(List<Integer> array) {

        for (int i = array.size() - 1; i >= 0; i--) {

            int random = (int)(Math.random() * i);
            int j = array.get(random);
            int k = array.get(i);

            array.set(random, k);
            array.set(i, j);

            //System.out.println((array.get(i) + ", "));

        }

        updateArrayText();

        //return array;
    }

    private void updateArrayText() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.size(); i++) {

            stringBuilder.append(array.get(i)).append(", ");

        }

        arrayText.setText(stringBuilder.toString());

    }



}