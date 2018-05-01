package com.example.aayush.click;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class RepairShops extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair_shops);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng r1 = new LatLng(32.3214443, 78.0030876);
        mMap.addMarker(new MarkerOptions().position(r1).title("r1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(r1));

        LatLng r2 = new LatLng(30.4092012, 77.9696033);
        mMap.addMarker(new MarkerOptions().position(r2).title("bidholi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(r2));
    }
    private void setUpMapIfNeeded() {

        if (mMap == null) {
            //mMap=((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
            //        .getMapAsync();
            Toast.makeText(this, "Error. No Internet Connection.", Toast.LENGTH_SHORT).show();

        }
    }
}

