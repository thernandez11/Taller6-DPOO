package uniandes.dpoo.swing.interfaz.principal;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelDetallesRestaurante extends JPanel
{
    /**
     * La etiqueta donde se muestra el nombre de un restaurante
     */
    private JLabel labNombre;

    /**
     * La etiqueta donde se muestra la calificación de un restaurante, usando imágenes de estrellas
     */
    private JLabel labCalificacion;

    /**
     * Un checkbox en el que se muestra si un restaurante fue visitado o no
     */
    private JCheckBox chkVisitado;

    public PanelDetallesRestaurante( )
    {
    	setLayout( new GridLayout(3, 1) );
    	
        // Configura la etiqueta para el nombre
        // TODO completar el constructor
    	labNombre = new JLabel();
    	
        // Configura la etiqueta para la calificación
        // TODO completar el constructor
    	labCalificacion = new JLabel();
    	
        // Configura el checkbox para indicar si ya se visitaó o no el restaurante
        // TODO completar el constructor
    	chkVisitado = new JCheckBox();
    	chkVisitado.setEnabled( false );
    	
        // Organiza los elementos en la venta
        // TODO completar el constructor
    	add(new JLabel("Nombre: "));
    	add(labNombre);
    	
    	add(new JLabel("Calificacion: "));
    	add(labCalificacion);
    	
    	add(new JLabel("Visitado: "));
    	add(chkVisitado);
    }

    /**
     * Actualiza los datos mostrados del restaurante, indicando los valores por separado.
     * @param nombre
     * @param calificacion
     * @param visitado
     */
    private void actualizarRestaurante( String nombre, int calificacion, boolean visitado )
    {
     // TODO completar actualizarRestaurante
    	labNombre.setText(nombre);
    	labCalificacion.setIcon(buscarIconoCalificacion(calificacion));
    	chkVisitado.setSelected(visitado);
    }

    /**
     * Actualiza los datos que se muestran de un restaurante
     * @param r El restaurante que se debe mostrar
     */
    public void actualizarRestaurante( Restaurante r )
    {
        this.actualizarRestaurante( r.getNombre( ), r.getCalificacion( ), r.isVisitado( ) );
    }

    /**
     * Dada una calificación, retorna una imagen para utilizar en la etiqueta que muestra la calificación
     * @param calificacion La calificación del restaurante, que debe ser un numero entre 1 y 5.
     * @return Una imagen a la que corresponde la calificación
     */
    private ImageIcon buscarIconoCalificacion( int calificacion )
    {
        String imagen = "./imagenes/stars" + calificacion + ".png";
        return new ImageIcon( imagen );
    }
}
