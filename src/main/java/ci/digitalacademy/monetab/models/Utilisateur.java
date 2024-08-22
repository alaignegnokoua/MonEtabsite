package ci.digitalacademy.monetab.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Utilisateur {
    private String pseudo;
    private String dateCreation;
}
