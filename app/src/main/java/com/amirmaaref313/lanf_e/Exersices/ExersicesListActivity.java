package com.amirmaaref313.lanf_e.Exersices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.amirmaaref313.lanf_e.R;

public class ExersicesListActivity extends AppCompatActivity implements ListExersicesMethod {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersices_list);
        initilizeExersicesListView();
    }

    @Override
    public String getTextContent(int position) {
        String content;
        switch (position) {
            case 0:
                content = getString(R.string.varzesh_haye_ehteghan_zodaE);
                break;

            case 1:
                content = getString(R.string.varzesh_haye_andame_foghani);
                break;

            case 2:
                content = getString(R.string.tanafose_shekami);
                break;

            case 3:
                content = getString(R.string.varzesh_haye_gardan);
                break;

            case 4:
                content = getString(R.string.varzesh_haye_shane);
                break;

            case 5:
                content = getString(R.string.varzesh_haye_dast);
                break;

            case 6:
                content = getString(R.string.bazo_va_dast_ha);
                break;

            case 7:
                content = getString(R.string.varzesh_ba_dasteye_jaro);
                break;

            case 8:
                content = getString(R.string.varzesh_ha_ba_tope_narm);
                break;

            case 9:
                content = getString(R.string.tanafos_shekami_2);
                break;

            case 10:
                content = getString(R.string.be_ham_feshordane_angoshtan);
                break;

            case 11:
                content = getString(R.string.baz_kardane_angoshtan_az_ham);
                break;

            case 12:
                content = getString(R.string.ghose_dar_kardane_moche_pa);
                break;

            case 13:
                content = getString(R.string.charkheshe_moche_pa);
                break;

            case 14:
                content = getString(R.string.docharkhe);
                break;

            case 15:
                content = getString(R.string.laghzandane_pashne_pa);
                break;

            case 16:
                content = getString(R.string.lamse_zano_va_dast);
                break;

            case 17:
                content = getString(R.string.boland_kardane_kopol);
                break;

                default:
                    content = "";
        }
        return content;
    }

    @Override
    public void initilizeExersicesListView() {
        listView = (ListView)findViewById(R.id.exersicesListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,titles);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startTextActivity(getTextContent(position));
            }
        });
    }

    @Override
    public void startTextActivity(String Content) {
        Intent intent = new Intent(this , ExersicesTextActivity.class);
        intent.putExtra("CONTENT",Content);
        startActivity(intent);
    }
}
