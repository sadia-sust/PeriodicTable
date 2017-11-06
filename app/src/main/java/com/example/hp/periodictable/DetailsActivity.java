package com.example.hp.periodictable;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailsActivity extends Activity {
    TextView name,no,num,shonket;
    ArrayList<String> Name,No,Num,Shonket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        name= (TextView)findViewById(R.id.name);
        no= (TextView)findViewById(R.id.atomicno);
        num= (TextView)findViewById(R.id.atomicnum);
        shonket= (TextView)findViewById(R.id.shonket);
        Name = new ArrayList<String>();

        Num = new ArrayList<String>();
        Shonket = new ArrayList<String>();
        initData();
        name.setText("Element Name: "+ Name.get(PeriodicTableActivity.index));
        no.setText("Atomic Number: "+ (PeriodicTableActivity.index+1));
        num.setText("Atomic Weight: "+ Num.get(PeriodicTableActivity.index));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void initData(){
        Name.add("Hydrogen");
        Name.add("Helium");
        Name.add("Lithium");
        Name.add("Beryllium");
        Name.add("Boron");
        Name.add("Carbon");
        Name.add("Nitrogen");
        Name.add("Oxygen");
        Name.add("Fluorine");
        Name.add("Neon");
        Name.add("Sodium");
        Name.add("Magnesium");
        Name.add("Aluminum");
        Name.add("Silicon");
        Name.add("Phosphorus");
        Name.add("Sulfur");
        Name.add("Chlorine");
        Name.add("Argon");
        Name.add("Potassium");
        Name.add("Calcium");
        Name.add("Scandium");
        Name.add("Titanium");
        Name.add("Vanadium");
        Name.add("Chromium");
        Name.add("Manganese");
        Name.add("Iron");
        Name.add("Cobalt");
        Name.add("Nickel");
        Name.add("Copper");
        Name.add("Zinc");
        Name.add("Gallium");
        Name.add("Germanium");
        Name.add("Arsenic");
        Name.add("Selenium");
        Name.add("Bromine");
        Name.add("Krypton");
        Name.add("Rubidium");
        Name.add("Strontium");
        Name.add("Yttrium");
        Name.add("Zirconium");
        Name.add("Niobium");
        Name.add("Molybdenum");
        Name.add("Technetium");
        Name.add("Ruthenium");
        Name.add("Rhodium");
        Name.add("Palladium");
        Name.add("Silver");
        Name.add("Cadmium");
        Name.add("Indium");
        Name.add("Tin");
        Name.add("Antimony");
        Name.add("Tellurium");
        Name.add("Iodine");


        Name.add("Xenon");
        Name.add("Cesium");
        Name.add("Barium");
        Name.add("Lanthanum");
        Name.add("Cerium");
        Name.add("Praseodymium");
        Name.add("Neodymium");
        Name.add("Promethium");
        Name.add("Samarium");
        Name.add("Europium");
        Name.add("Gadolinium");
        Name.add("Terbium");
        Name.add("Dysprosium");
        Name.add("Holmium");
        Name.add("Erbium");
        Name.add("Thulium");
        Name.add("Yttebium");
        Name.add("Lutetium");
        Name.add("Hafnium");
        Name.add("Tantalum");
        Name.add("Tungsten");
        Name.add("Rhenium");
        Name.add("Osmium");
        Name.add("Iridium");
        Name.add("Platinum");
        Name.add("Gold");
        Name.add("Mercury");
        Name.add("Thallium");
        Name.add("Lead");
        Name.add("Bismuth");
        Name.add("Polonium");
        Name.add("Astatine");
        Name.add("Radon");
        Name.add("Francium");
        Name.add("Radium");
        Name.add("Actinium");
        Name.add("Thorium");
        Name.add("Protactinium");
        Name.add("Uranium");
        Name.add("Neptunium");
        Name.add("Plutonium");
        Name.add("Americium");
        Name.add("Curium");
        Name.add("Berkelium");
        Name.add("Californium");
        Name.add("Einsteinium");
        Name.add("Fermium");
        Name.add("Mendelivium");
        Name.add("Nobelium");
        Name.add("Lawrencium");
        Name.add("Rutherfordium");
        Name.add("Dubnium");

        Name.add("Seaborgium");
        Name.add("Bohrium");
        Name.add("Hassium");
        Name.add("Meitnerium");


        Num.add("1.0079");
        Num.add("4.0026");
        Num.add("6.941");
        Num.add("9.0122");
        Num.add("10.811");
        Num.add("12.0107");
        Num.add("14.0067");
        Num.add("15.9994");
        Num.add("18.9994");
        Num.add("20.1797");
        Num.add("22.9897");
        Num.add("24.305");
        Num.add("26.9815");
        Num.add("28.0855");
        Num.add("30.9738");
        Num.add("32.065");
        Num.add("35.453");
        Num.add("39.948");
        Num.add("39.0983");
        Num.add("40.078");
        Num.add("44.9559");
        Num.add("47.867");
        Num.add("50.9415");
        Num.add("51.9961");
        Num.add("54.938");
        Num.add("55.845");
        Num.add("58.9332");
        Num.add("8.6934");
        Num.add("63.546");
        Num.add("65.39");
        Num.add("69.723");
        Num.add("72.64");
        Num.add("74.9216");
        Num.add("78.96");
        Num.add("79.904");
        Num.add("83.8");
        Num.add("85.4678");
        Num.add("87.62");
        Num.add("88.9052");
        Num.add("91.224");
        Num.add("92.9064");
        Num.add("95.94");
        Num.add("98");
        Num.add("101.07");
        Num.add("102.9055");
        Num.add("106.42");
        Num.add("107.8682");
        Num.add("112.411");
        Num.add("114.814");
        Num.add("118.71");
        Num.add("121.76");
        Num.add("127.6");
        Num.add("126.90");


        Num.add("131.293");
        Num.add("132.9055");
        Num.add("137.327");
        Num.add("138.9055");
        Num.add("140.116");
        Num.add("140.9077");
        Num.add("144.24");
        Num.add("144.24");
        Num.add("145");
        Num.add("150.36");
        Num.add("151.9253");
        Num.add("158.9253");
        Num.add("162.5");
        Num.add("164.9303");
        Num.add("167.259");
        Num.add("167.259");
        Num.add("168.9342");
        Num.add("173.04");
        Num.add("174.967");
        Num.add("178.49");
        Num.add("180.9479");
        Num.add("183.84");
        Num.add("186.207");
        Num.add("190.23");
        Num.add("192.217");
        Num.add("195.078");
        Num.add("196.9665");
        Num.add("200.59");
        Num.add("204.3833");
        Num.add("207.2");
        Num.add("208.9804");
        Num.add("209");
        Num.add("210");
        Num.add("222");
        Num.add("223");
        Num.add("226");
        Num.add("227");
        Num.add("232.0381");
        Num.add("231.0359");
        Num.add("238.0289");
        Num.add("237");
        Num.add("244");
        Num.add("243");
        Num.add("247");
        Num.add("247");
        Num.add("251");
        Num.add("252");
        Num.add("257");
        Num.add("258");
        Num.add("259");
        Num.add("262");
        Num.add("266");
        Num.add("264");
        Num.add("277");
        Num.add("277");
        Num.add("268");










    }
}
