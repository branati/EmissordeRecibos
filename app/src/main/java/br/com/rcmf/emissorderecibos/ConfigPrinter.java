package br.com.rcmf.emissorderecibos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ConfigPrinter extends AppCompatActivity implements View.OnClickListener {

    EditText address, port;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_printer);

        address = (EditText) findViewById(R.id.lbladdress);
        port = (EditText) findViewById(R.id.lblport);
    }

    public void onClick(View v) {
        Bundle bundle = getIntent().getExtras();

        if (bundle.containsKey("lbladdress")) {
            String valor = bundle.getString("lbladdress");
            address.setText(valor + "111");
        }
        finish();
    }


}
