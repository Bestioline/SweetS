package ricetta;

public class Ricetta {

    private String id, id_cuoco, nome, categoria, descrizione, foto, ingredienti, ricetta;


        public Ricetta(String id, String id_cuoco, String nome, String categoria, String descrizione, String foto, String ingredienti, String ricetta){
            this.id=id;
            this.nome=nome;
            this.categoria=categoria;
            this.descrizione=descrizione;
            this.foto=foto;
            this.ingredienti=ingredienti;
            this.ricetta=ricetta;
            this.id_cuoco=id_cuoco;
        }

    public String getId_cuoco() {
        return id_cuoco;
    }

    public void setId_cuoco(String id_cuoco) {
        this.id_cuoco = id_cuoco;
    }

    public String getId(){return id;}

        public String getNome() {
            return nome;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public String getCategoria(){return categoria;}

        public String getFoto() {
            return foto;
        }

        public String getRicetta() {
            return ricetta;
        }

        public String getIngredienti() {
            return ingredienti;
        }
}
