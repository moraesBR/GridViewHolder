package examples.gridviewholder;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import examples.gridviewholder.R;
import examples.gridviewholder.adapters.StudentAdapter;
import examples.gridviewholder.models.StudentData;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List<StudentData> studentDataList = new ArrayList<>();

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        studentAdapter = new StudentAdapter(studentDataList);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(studentAdapter);
        StudentDataPrepare();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void StudentDataPrepare() {
        StudentData data = new StudentData("sai", 25);
        studentDataList.add(data);
        data = new StudentData("sai", 25);
        studentDataList.add(data);
        data = new StudentData("raghu", 20);
        studentDataList.add(data);
        data = new StudentData("raj", 28);
        studentDataList.add(data);
        data = new StudentData("amar", 15);
        studentDataList.add(data);
        data = new StudentData("bapu", 19);
        studentDataList.add(data);
        data = new StudentData("chandra", 52);
        studentDataList.add(data);
        data = new StudentData("deraj", 30);
        studentDataList.add(data);
        data = new StudentData("eshanth", 28);
        studentDataList.add(data);
        Collections.sort(studentDataList, new Comparator<StudentData>() {
            @Override
            public int compare(StudentData o1, StudentData o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
