package ci.digitalacademy.monetab.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

    private String nom;
    private String prenom;
    private String ville;
    private String telephone;
    private String age;
    private String genre;
}
