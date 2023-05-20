package com.example.bonus_assignment_19k1513;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Q2_part_A extends AppCompatActivity
{
   private RecyclerView recyclerView;
   private FruitAdapter adapter;

   @Override
    protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState );
      setContentView(R.layout.activity_main);

      recyclerView = findViewById(R.id.recycler);
      recyclerView.setLayoutManager(new LinearLayoutManager(this));

      List<String > fruits = new ArrayList<>();
      fruits.add("Orange");
      fruits.add("Apple");
      fruits.add("Strawberry");
      fruits.add("Mango");

      adapter = new FruitAdapter(fruits);
      recyclerView.setAdapter(adapter);
   }

   private static class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {
      private List<String> fruits;

      public FruitAdapter(List<String> fruits) {
         this.fruits = fruits;
      }

      @NonNull
      @Override
      public FruitAdapter.FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         LayoutInflater inflater = LayoutInflater.from(parent.getContext());
         View view = inflater.inflate(R.layout.activity_main, parent, false);
         return new FruitViewHolder(view);
      }

      @Override
      public void onBindViewHolder(@NonNull FruitAdapter.FruitViewHolder holder, int position) {
         String fruit = fruits.get(position);
         holder.bind(fruit);
      }

      @Override
      public int getItemCount() {
         return 0;
      }

      static class FruitViewHolder extends RecyclerView.ViewHolder {
         private TextView fruitTextView;

         public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitTextView = itemView.findViewById(R.id.fruitTextView);
         }

         public void bind(String fruit) {
            fruitTextView.setText(fruit);
         }
      }
   }
}
