package cornejo.adan.practica6_popcornfactory

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.ImageView


class DetallePelicula : AppCompatActivity() {

    private lateinit var ivPeliculaImagen: ImageView
    private lateinit var tvNombrePelicula: TextView
    private lateinit var tvPeliculaDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        ivPeliculaImagen = findViewById(R.id.iv_pelicula_imagen)
        tvNombrePelicula = findViewById(R.id.tv_nombre_pelicula)
        tvPeliculaDesc = findViewById(R.id.tv_pelicula_desc)

        intent.extras?.let { bundle ->

            ivPeliculaImagen.setImageResource(bundle.getInt("header"))
            tvNombrePelicula.text = bundle.getString("nombre")
            tvPeliculaDesc.text = bundle.getString("sinopsis")
        }
    }
}