package cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.dto;

import java.util.Arrays;
import java.util.List;

public class FlorDTO {

    private int pk_FlorID;
    private String nomFlor;
    private String paisFlor;
    private String tipusFlor;
    private static List<String> paisos = Arrays.asList("austria", "belgica",
            "bulgaria", "croacia", "chipre", "republica Checa", "dinamarca", "estonia",
            "finlandia", "francia", "alemania", "grecia", "hungria", "irlanda", "italia",
            "letonia", "lituania", "luxemburgo", "malta", "paises bajos", "polonia",
            "portugal", "rumania", "eslovaquia", "eslovenia", "españa", "suecia"); //Lista para tipusFlor

    public FlorDTO() {
    }

    // Getters y Setters

    public int getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(int pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
    }

    public String getNomFlor() {
        return nomFlor;
    }

    public void setNomFlor(String nomFlor) {
        this.nomFlor = nomFlor;
    }

    public String getPaisFlor() {
        return paisFlor;
    }

    public void setPaisFlor(String paisFlor) {
        this.paisFlor = paisFlor;
        this.tipusFlor = paisos.contains(this.paisFlor.toLowerCase()) ? "UE" : "Fora UE";
    }

    public String getTipusFlor() {
        return tipusFlor;
    }

    public void setTipusFlor(String tipusFlor) {
        this.tipusFlor = tipusFlor;
    }

    public static List<String> getPaisos() {
        return paisos;
    }

    public static void setPaisos(List<String> paisos) {
        FlorDTO.paisos = paisos;
    }
}