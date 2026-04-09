public class Video extends Publicacion {
    private float duracionHoras;
    private Idioma idioma;

    public Video() {
        super();
    }

    public Video(float duracionHoras, Idioma idioma) {
        super();
        this.duracionHoras = duracionHoras;
        this.idioma = idioma;
    }

    public Video(float duracionHoras, Idioma idioma, String titulo, double precio) {
        super(titulo, precio);
        this.duracionHoras = duracionHoras;
        this.idioma = idioma;
    }

    public float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Video [duracionHoras=" + duracionHoras + ", idioma=" + idioma + ", " + super.toString() + "]";
    }
}