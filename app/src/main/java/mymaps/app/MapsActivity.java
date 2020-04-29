package mymaps.app;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng bns = new LatLng(-7.896516, 112.534736);
        mMap.addMarker(new MarkerOptions().position(bns).title("BATU NIGHT SPECTACULAR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bns));

        LatLng jtp1 = new LatLng(-7.883944, 112.524613);
        mMap.addMarker(new MarkerOptions().position(jtp1).title("JAWA TIMUR PARK 1 KOTA BATU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jtp1));

        LatLng jtp2 = new LatLng(-7.888702, 112.530186);
        mMap.addMarker(new MarkerOptions().position(jtp2).title("JAWA TIMUR PARK 2 KOTA BATU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jtp2));

        LatLng jtp3 = new LatLng(-7.897640, 112.554478);
        mMap.addMarker(new MarkerOptions().position(jtp3).title("JAWA TIMUR PARK 3 KOTA BATU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jtp3));

        LatLng ma = new LatLng(-7.878598, 112.519807);
        mMap.addMarker(new MarkerOptions().position(ma).title("MUSEUM ANGKUT"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ma));

        LatLng pfp = new LatLng(-7.912674, 112.548741);
        mMap.addMarker(new MarkerOptions().position(pfp).title("PREDATOR FUN PARK BATU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pfp));

        LatLng bfg = new LatLng(-7.911851, 112.518940);
        mMap.addMarker(new MarkerOptions().position(bfg).title("BATU FLOWER GARDEN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bfg));

    }
}
