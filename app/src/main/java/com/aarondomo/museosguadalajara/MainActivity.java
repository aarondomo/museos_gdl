package com.aarondomo.museosguadalajara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aarondomo.museosguadalajara.pojos.Museum;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // ArrayList for museum names
    ArrayList<Museum> museums = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeMuseums();

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        MuseumsAdapter customAdapter = new MuseumsAdapter(MainActivity.this, museums);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

    }

    private void initializeMuseums(){
        //Museum museum1 = new Museum("nombre","direccion","telefono","horario","ciudad");
        Museum museum2 = new Museum("Instituto Cultural Cabañas ","Cabañas #8, Plaza Tapatía, Centro. ","(01 33) 3668-1647 y 3668-1640 ","Martes a sábado de 10:00 a 18:00 horas y domingo de 10:00 a 15:00 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum3 = new Museum("Museo Regional de Guadalajara ","Calle Liceo #60. Zona Centro. ","(01 33) 3614-9957 ","Martes a sábado de 9:00 a 17:30 horas y domingos de las 9:00 a las 16:30 horas.  ","Guadalajara, Jalisco, México");
        Museum museum4 = new Museum("Museo de Paleontología de Guadalajara ","Avenida R. Michel #520. Colonia San Carlos. Núcleo Parque Agua Azul. ","(01 33) 3619-7043 y 3619-5548 ","Martes a sábado de 10:00 a 18:00 horas y domingo de 11:00 a 18:00 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum5 = new Museum("Museo de Arqueología de Occidente de México ","Avenida 16 de Septiembre #889. Zona Centro Núcleo Agua Azul. ","(01 33) 3619-0104 ","Lunes a sábado de 10:00 a 14:00 y de 16:00 a 19:00 horas. Domingos de 10:00 a 14:00 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum6 = new Museum("Museo de la Ciudad de Guadalajara ","Calle Independencia #684. Centro Histórico. ","(01 33) 1201-8712, y con terminación 13, 14 y 15 ","Martes a sábado de 10:00 a 17:30 horas y domingos de 10:00 a 14:30 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum7 = new Museum("Museo del Periodismo y las Artes Gráficas ","Avenida Alcalde #225. Centro Histórico. ","(01 33) 3613-9285 y 3613-9286 ","Martes a sábado de 10:00 a 18:00 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum8 = new Museum("Museo del Ejército y Fuerza Aérea ","Gómez Farias #600, Colonia General Real. ","(01 33) 3618-3974 ","Martes a sábado de 10:00 a 18:00 horas.  Domingo y días festivos de 10:00 a 16:00 horas. ","Guadalajara, Jalisco, México.");
        Museum museum9 = new Museum("Museo de las Artes de la Universidad de Guadalajara ","Avenida Juárez #975 o López Cotilla #930. Colonia Americana. ","(01 33) 3134-1664 ","Martes a sábado de 10:00 a 18:00 horas  Domingos de 10:00 a 16:00 horas.","Guadalajara, Jalisco, México.");
        Museum museum10 = new Museum("Museo de la Artes Populares de Jalisco ","Periférico Norte Manuel Gómez Morín #401. ","(01 33) 3674-4106. ","Martes a domingo de 9:00 a 18:00 horas.  Observatorio astronómico de 9:00 a 20:00 horas. ","Guadalajara, Jalisco, México.");
        Museum museum11 = new Museum("Casa Museo López Portillo ","Calle Liceo #117, Centro Histórico. ","01 33) 3613-2411, 3613-2435. ","Martes a sábado de 10:00 a 17:00 horas.  Domingo de 10:00 a 15:00 horas. ","Guadalajara, Jalisco, México.");
        Museum museum12 = new Museum("Casa Museo Clemente Orozco ","Calle Aurelio Aceves #27, Arcos Vallarta. ","(01 33) 3616-8329 ","Lunes a viernes de 10:00 a 16:00 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum13 = new Museum("Museo Regional de la Cerámica ","Calle Independencia #237. Zona Centro. ","(01 33) 3635-5404 ","Martes a sábado de 10:00 a 18:00 horas.  Domingos de 9:00 a 16:00 horas. ","Tlaquepaque, Jalisco, México.");
        Museum museum14 = new Museum("Museo Premio Nacional de la Cerámica Pantaleón Panduro ","Prisciliano Sánchez #191. Zona Centro. ","(01 33) 3635-1089 extensión 217 ","Martes a sábado de 10:00 a 18:00 horas.  Domingo de 10:00 a 15:00 horas. ","Tlaquepaque, Jalisco, México.");
        Museum museum15 = new Museum("Museo Nacional de la Cerámica ","Calle Constitución #4. Zona Centro. ","(01 33) 3283-4765, 3683-2519 extensión 1194 y 3683-0971 ","Martes a viernes de 10:00 a 17:00 horas.  Sábados y domingos de 10:00 a 15:00 horas. ","Tonalá, Jalisco, México.");
        Museum museum16 = new Museum("Museo Tonallán ","Calle Ramón Corona #73. Centro. ","(01 33) 3683-2519 ","Lunes a viernes de 10:00 a 15:00 horas.  ","Tonalá, Jalisco, México.");
        Museum museum17 = new Museum("Museo de Arte de Zapopan ","Andador 20 de Noviembre #166. Zona Centro. ","(01 33) 3818-2575 ","Martes a domingos de 10:00 a 18:00 horas  Jueves de 10:00 a 22:00 horas. ","Zapopan, Jalisco, México.");
        Museum museum18 = new Museum("Museo de Caza Albarrán ","Paseo de los Parques #3450. Colinas de San Javier ","(01 33) 3641-4511 ","Domingos y días festivos de 10:00 a 14:30 horas  y entre semana previa cita. ","Zapopan, Jalisco, México.");
        Museum museum19 = new Museum("Museo de Arte Huichol Wixárica ","Costado Norte de la Basílica de Zapopan. ","(01 33) 3633-2247 y 3633-6614 ","Lunes a sábado de 9:00 a 13:30 horas y de 15:30 a 18:00 horas.  Domingos de 10:00 a 14:00 horas. ","Zapopan, Jalisco, México.");
        Museum museum20 = new Museum("Museo de Cera Guadalajara ","Morelos #217. Colonia Centro. ","(01 33) 3614-8487 ","Abierto todos los días de 11:00 a 20:00 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum21 = new Museum("Museo de Ripley ","Morelos #217. Colonia Centro. ","(01 33) 3614-8487 ","Abierto todos los días de 11:00 a 20:00 horas.  ","Guadalajara, Jalisco, México.");
        Museum museum22 = new Museum("Museo Raúl Anguiano ","Av. Mariano Otero #375, Colonia Moderna. ","52 (33) 1377 7909 y 08 ","Martes a domingo de 10:00 a 18:00 hrs.  ","Guadalajara, Jalisco, México.");

        museum2.setIcon(R.drawable.logo_cabanas1);
        museum2.setPhoto(R.drawable.cabanas);

        museum3.setIcon(R.drawable.icon_museo_regional_gdl);
        museum3.setPhoto(R.drawable.museo_regional_de_guadalajara);


        //museums.add(museum1);
        museums.add(museum2);
        museums.add(museum3);
        museums.add(museum4);
        museums.add(museum5);
        museums.add(museum6);
        museums.add(museum7);
        museums.add(museum8);
        museums.add(museum9);
        museums.add(museum10);
        museums.add(museum11);
        museums.add(museum12);
        museums.add(museum13);
        museums.add(museum14);
        museums.add(museum15);
        museums.add(museum16);
        museums.add(museum17);
        museums.add(museum18);
        museums.add(museum19);
        museums.add(museum20);
        museums.add(museum21);
        museums.add(museum22);
    }
}
