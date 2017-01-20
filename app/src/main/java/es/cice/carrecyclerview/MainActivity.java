package es.cice.carrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import es.cice.carrecyclerview.adapters.CarAdapter;
import es.cice.carrecyclerview.model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView carRV= (RecyclerView) findViewById(R.id.carRV);
        carRV.setAdapter(new CarAdapter(this,getData()));
        carRV.setLayoutManager(new LinearLayoutManager(this));

    }

    private List<Car> getData() {
        List<Car> list=new ArrayList<>();
        list.add(new Car("bla bla bla","Peugeot",R.drawable.vehiculo1,R.drawable.vehiculo1_thumb,
                "307"));
        list.add(new Car("bla bla bla","Renault",R.drawable.vehiculo2,R.drawable.vehiculo2_thumb,
                "Megane"));
        list.add(new Car("bla bla bla","Peugeot",R.drawable.vehiculo3,R.drawable.vehiculo3_thumb,
                "3008"));
        list.add(new Car("bla bla bla","MVW",R.drawable.vehiculo4,R.drawable.vevhiculo4_thumb,
                "401"));
        list.add(new Car("bla bla bla","Peugeot",R.drawable.vehiculo5,R.drawable.vehiculo5_thumb,
                "407"));
        return list;
    }
}
