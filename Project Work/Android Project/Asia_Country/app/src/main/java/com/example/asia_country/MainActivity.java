package com.example.asia_country;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<Alpha> alpha;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        alpha=new ArrayList<>();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://restcountries.eu/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitInterface service = retrofit.create(RetrofitInterface.class);

        Call<Data> call=service.getAlpha();
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                Log.i("MYDATA",response.body().getName());
                Log.i("MYDATA",response.body().getCapital());
                Log.i("MYDATA",response.body().getFlag());
                Log.i("MYDATA",response.body().getRegion());
                Log.i("MYDATA",response.body().getSubregion());
                Log.i("MYDATA",""+response.body().getPopulation());
                Log.i("MYDATA",""+response.body().getBorders());
                Log.i("MYDATA",""+response.body().getLanguages());
                Alpha a = new Alpha(response.body().getName(),response.body().getCapital(),response.body().getFlag(),
                        response.body().getRegion(),response.body().getSubregion(),String.valueOf(response.body().getPopulation()),String.valueOf(response.body().getBorders()),
                        String.valueOf(response.body().getLanguages()));
                alpha.add(a);
        RecyclerAdapter adapter=new RecyclerAdapter(alpha,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });
        /*call.enqueue(new Callback<List<Alpha>>() {
            @Override
            public void onResponse(Call<List<Alpha>> call, Response<List<Alpha>> response) {
                Log.i("DDDDD",""+response.body().size());
                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this,"Response Fail"+response.code(),Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(MainActivity.this,"Done"+response.code(),Toast.LENGTH_SHORT).show();
                alpha.addAll(response.body());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Alpha>> call, Throwable t) {

            }
        });*/

    }

    private static class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder>{
        List<Alpha>alpha;
        Context context;

        public RecyclerAdapter(List<Alpha> users, Context context) {
            this.alpha = users;
            this.context = context;
        }

        @NonNull
        @Override
        public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view, viewGroup,false);
            return new myViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

            myViewHolder.name.setText(alpha.get(position).getName());
            myViewHolder.capital.setText(alpha.get(position).getCapital());
            myViewHolder.flag.setText(alpha.get(position).getFlag());
            myViewHolder.region.setText(alpha.get(position).getRegion());
            myViewHolder.subregion.setText(alpha.get(position).getSubregion());
            myViewHolder.population.setText(alpha.get(position).getPopulation());
            myViewHolder.borders.setText(alpha.get(position).getBorders());
            myViewHolder.languages.setText(alpha.get(position).getLanguages());

        }

        @Override
        public int getItemCount() {
            return alpha.size();
        }

        public static class myViewHolder extends RecyclerView.ViewHolder {


            private static TextView name;
            private static TextView capital;
            private static TextView flag;
            private static TextView region;
            private static TextView subregion;
            private static TextView population;
            private static TextView borders;
            private static TextView languages;
            public myViewHolder(@NonNull View itemView) {
                super(itemView);
                name=(TextView)itemView.findViewById(R.id.name);
                capital=(TextView)itemView.findViewById(R.id.capital);
                flag=(TextView)itemView.findViewById(R.id.flag);
                region=(TextView)itemView.findViewById(R.id.region);
                subregion=(TextView)itemView.findViewById(R.id.subregion);
                population=(TextView)itemView.findViewById(R.id.population);
                borders=(TextView)itemView.findViewById(R.id.borders);
                languages=(TextView)itemView.findViewById(R.id.languages);

            }
        }
    }
}