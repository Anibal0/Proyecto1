package com.example.anipa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//se importan las librerías del tipo Widget
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//Se importa  una utilidad llamada  Lista
import java.util.List;

//Se importan las librer&iacute;as  espec&iacute;ficas que se utilizar&aacute;n del paquete de retrofit2
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class activity_serviciosweb extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serviciosweb);

        listView = findViewById(R.id.listView);

        //Codigo para llamar al método que deslpliega a los Heroes
        getPeople();
    }

    private void getPeople () {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Aquí usamos el GsonConverterFactory para convertir directamente la data en formato JSON a Objetos
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<People>> call = api.getPeoples();

        call.enqueue(new Callback<List<People>>() {
            @Override
            public void onResponse(Call<List<People>> call, Response<List<People>> response) {
                List<People> PeopleList = response.body();

                //Se crea un Array de tipo String para el ListView
                String[] People = new String[com.example.anipa.myapplication.People.size()];

                //Proceso cíclico de los heroes que los inserta dentro del array
                for (int i = 0; i < PeopleList.size(); i++) {
                    People [i] = PeopleList.get(i).getName();

                }


                //Despliega el Arreglo de tipo String en la ListView
                listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, People));

            }

            @Override
            public void onFailure(Call<List<People>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
