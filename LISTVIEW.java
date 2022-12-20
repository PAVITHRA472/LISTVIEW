PROGRAM:
LISTVIEW:
ACTIVITY_MAIN.XML:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
 xmlns:app="http://schemas.android.com/apk/res-auto"
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 tools:context=".MainActivity">
 <ListView
 android:id="@+id/list"
 android:layout_width="match_parent"
 android:layout_height="match_parent"/>
</LinearLayout>
MAINACTIVITY.JAVA:
package com.example.listelementpavi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
 ListView l;
 String technical[]={"Algorithms", "Data 
Structures","Languages", "Interview Corner", "GATE", 
"ISRO CS", "UGC NET CS", "CS Subjects", "Web 
Technologies"};
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 l = findViewById(R.id.list);
 ArrayAdapter<String> arr;
 arr = new ArrayAdapter<String>( this, 
androidx.appcompat.R.layout.support_simple_spinner_dropdo
wn_item,technical);
 l.setAdapter(arr);
 l.setOnItemClickListener(new 
AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> 
adapterView, View view, int i, long l) {
 if(i==0) {
 startActivity(new Intent(MainActivity.this, 
Algorithm.class));
 }
 else if(i==1)
 {
 startActivity(new Intent(MainActivity.this, 
language.class));
 }
 else if(i==2)
 {
 startActivity(new Intent(MainActivity.this, 
datastructure.class));
 }
 else
 {
 }
 }
 });
 }
}
