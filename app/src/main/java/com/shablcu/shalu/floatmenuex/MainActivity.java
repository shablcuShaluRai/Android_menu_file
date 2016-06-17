package com.shablcu.shalu.floatmenuex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  ListView list;
    String contact[]={"shalu","sahil","ayush","Ram","Shayam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        list=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contact);
        list.setAdapter(adapter);
        //register the list for context menu
        registerForContextMenu(list);



    }


    public  void onCreateContextMenu(ContextMenu menu,View view,ContextMenu.ContextMenuInfo menuInfo)


    {
        super.onCreateContextMenu(menu, view, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0, view.getId(), 0, "Call");//groupId, itemId, order, title
        menu.add(0, view.getId(), 0, "SMS");
        menu.add("add");

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Call"){
            Toast.makeText(getApplicationContext(), "calling code", Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="SMS"){
            Toast.makeText(getApplicationContext(),"sending sms code",Toast.LENGTH_LONG).show();
        }else{
            return false;
        }
        return true;
    }
}
