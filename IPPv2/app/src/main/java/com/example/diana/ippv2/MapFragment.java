package com.example.diana.ippv2;

import android.os.Bundle;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import com.google.android.gms.maps.GoogleMap;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;

public class MapFragment extends FragmentActivity implements OnMapReadyCallback, OnMarkerClickListener
{
    private SupportMapFragment sMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);

        sMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        sMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap mMap)
    {
        LatLng one = new LatLng(10.7187530, 122.5611620);
        LatLng ILOILO = new LatLng(10.730278, 122.548889);

        mMap.setBuildingsEnabled(true);
        mMap.setMyLocationEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ILOILO, 12));

        Marker oneJRD = mMap.addMarker(new MarkerOptions()
                            .title("Lot ID: 0115-0001JRD")
                            .snippet("Click for more info")
                            .position(one)
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        oneJRD.showInfoWindow();
        mMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick (Marker marker)
    {
        setContentView(R.layout.info_layout);

        return false;
    }
}
