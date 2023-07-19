package com.example.proyecto_final_rancho;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class registroganadoactivity extends AppCompatActivity {

    private EditText editTextNombreDueño, editTextIdAnimal, editTextEspecie, editTextNombreAnimal,
            editTextFechaNacimiento, editTextEdad, editTextSexo, editTextVacunas;
    private Button buttonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_ganado);

        // Inicializar vistas
        editTextNombreDueño = findViewById(R.id.editTextNombreDueño);
        editTextIdAnimal = findViewById(R.id.editTextIdAnimal);
        editTextEspecie = findViewById(R.id.editTextEspecie);
        editTextNombreAnimal = findViewById(R.id.editTextNombreAnimal);
        editTextFechaNacimiento = findViewById(R.id.editTextFechaNacimiento);
        editTextEdad = findViewById(R.id.editTextEdad);
        editTextSexo = findViewById(R.id.editTextSexo);
        editTextVacunas = findViewById(R.id.editTextVacunas);
        buttonRegistrar = findViewById(R.id.buttonRegistrar);

        // Manejar evento de clic en el botón de registrar
        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados en los campos de texto
                String nombreDueño = editTextNombreDueño.getText().toString().trim();
                String idAnimal = editTextIdAnimal.getText().toString().trim();
                String especie = editTextEspecie.getText().toString().trim();
                String nombreAnimal = editTextNombreAnimal.getText().toString().trim();
                String fechaNacimiento = editTextFechaNacimiento.getText().toString().trim();
                String edad = editTextEdad.getText().toString().trim();
                String sexo = editTextSexo.getText().toString().trim();
                String vacunas = editTextVacunas.getText().toString().trim();

                // Aquí puedes realizar la lógica para guardar los datos del ganado en una base de datos o en algún otro almacenamiento.
                // Por ejemplo, puedes usar Firebase Realtime Database o Firestore para almacenar los datos.

                // Luego de guardar los datos, puedes mostrar un mensaje de éxito o realizar alguna otra acción.


            }
        });
    }
}
