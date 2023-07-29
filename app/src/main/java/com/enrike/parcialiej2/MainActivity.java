package com.enrike.parcialiej2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup contenedor;
    private View opcg, opcp, opcpe, opcc, opcs;
    EditText g1, g2, g3, pr1, pr2, pr3, pz1, pz2, pz3, c1, c2, c3, s1, s2, s3;
    RadioButton gato, perro, pez, conejo, sapo;
    Button change, procede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();

    }

    private void load(){

        contenedor = findViewById(R.id.listaanimales);

        gato = findViewById(R.id.gato);
        perro = findViewById(R.id.perro);
        pez = findViewById(R.id.pez);
        conejo = findViewById(R.id.conejo);
        sapo = findViewById(R.id.sapo);

        opcg = findViewById(R.id.opcgato);
        opcp = findViewById(R.id.opcperro);
        opcpe = findViewById(R.id.opcpez);
        opcc = findViewById(R.id.opcconejo);
        opcs = findViewById(R.id.opcsapo);

        g1 = findViewById(R.id.preciogato);
        g2 = findViewById(R.id.edadgato);
        g3 = findViewById(R.id.cuotasgato);

        pr1 = findViewById(R.id.precioperro);
        pr2 = findViewById(R.id.edadperro);
        pr3 = findViewById(R.id.cuotasperro);

        pz1 = findViewById(R.id.preciopez);
        pz2 = findViewById(R.id.edadpez);
        pz3 = findViewById(R.id.cuotaspez);

        c1 = findViewById(R.id.precioconejo);
        c2 = findViewById(R.id.edadconejo);
        c3 = findViewById(R.id.cuotasconejo);

        s1 = findViewById(R.id.preciosapo);
        s2 = findViewById(R.id.edadsapo);
        s3 = findViewById(R.id.cuotassapo);

        change = findViewById(R.id.cambiar);
        procede = findViewById(R.id.continuar);

    }

    public void seleccionar(View view){
        boolean opc = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.gato:
                if (opc){
                    opcg.setVisibility(View.VISIBLE);
                    opcp.setVisibility(View.INVISIBLE);
                    opcpe.setVisibility(View.INVISIBLE);
                    opcc.setVisibility(View.INVISIBLE);
                    opcs.setVisibility(View.INVISIBLE);
                    perro.setEnabled(false);
                    pez.setEnabled(false);
                    conejo.setEnabled(false);
                    sapo.setEnabled(false);

                    procede.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String ga1 = g1.getText().toString();
                            String ga2 = g2.getText().toString();
                            String ga3 = g3.getText().toString();
                            if (ga1.length()==0 || ga2.length()==0 || ga3.length()==0){
                                Toast.makeText(getApplicationContext(),"Ingrese los valores", Toast.LENGTH_SHORT).show();
                            }else{
                                int var1 = Integer.parseInt(ga1);
                                int var2 = Integer.parseInt(ga2);
                                int var3 = Integer.parseInt(ga3);

                                if (var1==0 || var2==0 || var3==0){
                                    g1.setEnabled(false);
                                    g2.setEnabled(false);
                                    g3.setEnabled(false);

                                    Toast.makeText(getApplicationContext(),"Datos inválidos", Toast.LENGTH_SHORT).show();

                                }else{
                                    float cuota1 = Float.parseFloat(ga1)/Float.parseFloat(ga3);

                                    Toast.makeText(getApplicationContext(),"Precio: $"+var1+"\nEdad: "+var2+"\nCuotas: "+var3+
                                            "\nValor por cuota: $"+cuota1, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    });

                    change.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            gato.setEnabled(true);
                            perro.setEnabled(true);
                            pez.setEnabled(true);
                            conejo.setEnabled(true);
                            sapo.setEnabled(true);
                            g1.setEnabled(true);
                            g2.setEnabled(true);
                            g3.setEnabled(true);
                            opcg.setVisibility(View.INVISIBLE);
                            opcp.setVisibility(View.INVISIBLE);
                            opcpe.setVisibility(View.INVISIBLE);
                            opcc.setVisibility(View.INVISIBLE);
                            opcs.setVisibility(View.INVISIBLE);

                        }
                    });

                }
                break;
            case R.id.perro:
                if (opc){
                    opcg.setVisibility(View.INVISIBLE);
                    opcp.setVisibility(View.VISIBLE);
                    opcpe.setVisibility(View.INVISIBLE);
                    opcc.setVisibility(View.INVISIBLE);
                    opcs.setVisibility(View.INVISIBLE);
                    gato.setEnabled(false);
                    pez.setEnabled(false);
                    conejo.setEnabled(false);
                    sapo.setEnabled(false);

                    procede.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String ga1 = pr1.getText().toString();
                            String ga2 = pr2.getText().toString();
                            String ga3 = pr3.getText().toString();
                            if (ga1.length()==0 || ga2.length()==0 || ga3.length()==0){
                                Toast.makeText(getApplicationContext(),"Ingrese los valores", Toast.LENGTH_SHORT).show();
                            }else{
                                int var1 = Integer.parseInt(ga1);
                                int var2 = Integer.parseInt(ga2);
                                int var3 = Integer.parseInt(ga3);

                                if (var1==0 || var2==0 || var3==0){
                                    pr1.setEnabled(false);
                                    pr2.setEnabled(false);
                                    pr3.setEnabled(false);

                                    Toast.makeText(getApplicationContext(),"Datos inválidos", Toast.LENGTH_SHORT).show();

                                }else{
                                    float cuota1 = Float.parseFloat(ga1)/Float.parseFloat(ga3);

                                    Toast.makeText(getApplicationContext(),"Precio: $"+var1+"\nEdad: "+var2+"\nCuotas: "+var3+
                                            "\nValor por cuota: $"+cuota1, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    });

                    change.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            gato.setEnabled(true);
                            perro.setEnabled(true);
                            pez.setEnabled(true);
                            conejo.setEnabled(true);
                            sapo.setEnabled(true);
                            pr1.setEnabled(true);
                            pr2.setEnabled(true);
                            pr3.setEnabled(true);
                            opcg.setVisibility(View.INVISIBLE);
                            opcp.setVisibility(View.INVISIBLE);
                            opcpe.setVisibility(View.INVISIBLE);
                            opcc.setVisibility(View.INVISIBLE);
                            opcs.setVisibility(View.INVISIBLE);
                        }
                    });
                }
                break;
            case R.id.pez:
                if (opc){
                    opcg.setVisibility(View.INVISIBLE);
                    opcp.setVisibility(View.INVISIBLE);
                    opcpe.setVisibility(View.VISIBLE);
                    opcc.setVisibility(View.INVISIBLE);
                    opcs.setVisibility(View.INVISIBLE);
                    gato.setEnabled(false);
                    perro.setEnabled(false);
                    conejo.setEnabled(false);
                    sapo.setEnabled(false);

                    procede.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String ga1 = pz1.getText().toString();
                            String ga2 = pz2.getText().toString();
                            String ga3 = pz3.getText().toString();
                            if (ga1.length()==0 || ga2.length()==0 || ga3.length()==0){
                                Toast.makeText(getApplicationContext(),"Ingrese los valores", Toast.LENGTH_SHORT).show();
                            }else{
                                int var1 = Integer.parseInt(ga1);
                                int var2 = Integer.parseInt(ga2);
                                int var3 = Integer.parseInt(ga3);

                                if (var1==0 || var2==0 || var3==0){
                                    pz1.setEnabled(false);
                                    pz2.setEnabled(false);
                                    pz3.setEnabled(false);

                                    Toast.makeText(getApplicationContext(),"Datos inválidos", Toast.LENGTH_SHORT).show();

                                }else{
                                    float cuota1 = Float.parseFloat(ga1)/Float.parseFloat(ga3);

                                    Toast.makeText(getApplicationContext(),"Precio: $"+var1+"\nEdad: "+var2+"\nCuotas: "+var3+
                                            "\nValor por cuota: $"+cuota1, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    });

                    change.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            gato.setEnabled(true);
                            perro.setEnabled(true);
                            pez.setEnabled(true);
                            conejo.setEnabled(true);
                            sapo.setEnabled(true);
                            pz1.setEnabled(true);
                            pz2.setEnabled(true);
                            pz3.setEnabled(true);
                            opcg.setVisibility(View.INVISIBLE);
                            opcp.setVisibility(View.INVISIBLE);
                            opcpe.setVisibility(View.INVISIBLE);
                            opcc.setVisibility(View.INVISIBLE);
                            opcs.setVisibility(View.INVISIBLE);
                        }
                    });
                }
                break;
            case R.id.conejo:
                if (opc){
                    opcg.setVisibility(View.INVISIBLE);
                    opcp.setVisibility(View.INVISIBLE);
                    opcpe.setVisibility(View.INVISIBLE);
                    opcc.setVisibility(View.VISIBLE);
                    opcs.setVisibility(View.INVISIBLE);
                    gato.setEnabled(false);
                    perro.setEnabled(false);
                    pez.setEnabled(false);
                    sapo.setEnabled(false);

                    procede.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String ga1 = c1.getText().toString();
                            String ga2 = c2.getText().toString();
                            String ga3 = c3.getText().toString();
                            if (ga1.length()==0 || ga2.length()==0 || ga3.length()==0){
                                Toast.makeText(getApplicationContext(),"Ingrese los valores", Toast.LENGTH_SHORT).show();
                            }else{
                                int var1 = Integer.parseInt(ga1);
                                int var2 = Integer.parseInt(ga2);
                                int var3 = Integer.parseInt(ga3);

                                if (var1==0 || var2==0 || var3==0){
                                    c1.setEnabled(false);
                                    c2.setEnabled(false);
                                    c3.setEnabled(false);

                                    Toast.makeText(getApplicationContext(),"Datos inválidos", Toast.LENGTH_SHORT).show();

                                }else{
                                    float cuota1 = Float.parseFloat(ga1)/Float.parseFloat(ga3);

                                    Toast.makeText(getApplicationContext(),"Precio: $"+var1+"\nEdad: "+var2+"\nCuotas: "+var3+
                                            "\nValor por cuota: $"+cuota1, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    });

                    change.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            gato.setEnabled(true);
                            perro.setEnabled(true);
                            pez.setEnabled(true);
                            conejo.setEnabled(true);
                            sapo.setEnabled(true);
                            c1.setEnabled(true);
                            c2.setEnabled(true);
                            c3.setEnabled(true);
                            opcg.setVisibility(View.INVISIBLE);
                            opcp.setVisibility(View.INVISIBLE);
                            opcpe.setVisibility(View.INVISIBLE);
                            opcc.setVisibility(View.INVISIBLE);
                            opcs.setVisibility(View.INVISIBLE);
                        }
                    });
                }
                break;
            case R.id.sapo:
                if (opc){
                    opcg.setVisibility(View.INVISIBLE);
                    opcp.setVisibility(View.INVISIBLE);
                    opcpe.setVisibility(View.INVISIBLE);
                    opcc.setVisibility(View.INVISIBLE);
                    opcs.setVisibility(View.VISIBLE);
                    gato.setEnabled(false);
                    perro.setEnabled(false);
                    pez.setEnabled(false);
                    conejo.setEnabled(false);

                    procede.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String ga1 = s1.getText().toString();
                            String ga2 = s2.getText().toString();
                            String ga3 = s3.getText().toString();
                            if (ga1.length()==0 || ga2.length()==0 || ga3.length()==0){

                                Toast.makeText(getApplicationContext(),"Ingrese los valores", Toast.LENGTH_SHORT).show();
                            }else{
                                int var1 = Integer.parseInt(ga1);
                                int var2 = Integer.parseInt(ga2);
                                int var3 = Integer.parseInt(ga3);
                                if (var1==0 || var2==0 || var3==0){
                                    s1.setEnabled(false);
                                    s2.setEnabled(false);
                                    s3.setEnabled(false);

                                    Toast.makeText(getApplicationContext(),"Datos inválidos", Toast.LENGTH_SHORT).show();

                                }else{
                                    float cuota1 = Float.parseFloat(ga1)/Float.parseFloat(ga3);

                                    Toast.makeText(getApplicationContext(),"Precio: $"+var1+"\nEdad: "+var2+"\nCuotas: "+var3+
                                            "\nValor por cuota: $"+cuota1, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    });

                    change.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            gato.setEnabled(true);
                            perro.setEnabled(true);
                            pez.setEnabled(true);
                            conejo.setEnabled(true);
                            sapo.setEnabled(true);
                            s1.setEnabled(true);
                            s2.setEnabled(true);
                            s3.setEnabled(true);
                            opcg.setVisibility(View.INVISIBLE);
                            opcp.setVisibility(View.INVISIBLE);
                            opcpe.setVisibility(View.INVISIBLE);
                            opcc.setVisibility(View.INVISIBLE);
                            opcs.setVisibility(View.INVISIBLE);
                        }
                    });
                }
                break;
        }
    }

}