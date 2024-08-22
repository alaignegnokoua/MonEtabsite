
// POUR ELEVE
// Ce fichier peut être utilisé pour ajouter des fonctionnalités interactives
// Ex : Confirmation lors de la suppression d'un élève

document.addEventListener('DOMContentLoaded', function() {
    // Sélectionner tous les liens de suppression
    const deleteLinks = document.querySelectorAll('.actions a:last-child');

    deleteLinks.forEach(function(link) {
        link.addEventListener('click', function(event) {
            const confirmation = confirm('Voulez-vous vraiment supprimer cet élève ?');
            if (!confirmation) {
                event.preventDefault(); // Annuler l'action si l'utilisateur refuse
            }
        });
    });
});


/* POUR PROFESSEUR*/

// JavaScript pour les boutons "Modifier" et "Supprimer"
document.addEventListener('DOMContentLoaded', function () {
    // Sélectionner tous les boutons "Supprimer"
    const deleteButtons = document.querySelectorAll('.delete');

    // Ajouter un écouteur d'événement pour chaque bouton "Supprimer"
    deleteButtons.forEach(button => {
        button.addEventListener('click', function () {
            if (confirm('Voulez-vous vraiment supprimer ce professeur ?')) {
                // Code pour supprimer l'élément ici
                alert('Professeur supprimé');
            }
        });
    });

    // Sélectionner tous les boutons "Modifier"
    const editButtons = document.querySelectorAll('.edit');

    // Ajouter un écouteur d'événement pour chaque bouton "Modifier"
    editButtons.forEach(button => {
        button.addEventListener('click', function () {
            // Code pour modifier l'élément ici
            alert('Modification du professeur');
        });
    });
});

// POUR UTILISATEUR

// Ce fichier peut être utilisé pour ajouter des fonctionnalités interactives
// Ex : Confirmation lors de la suppression d'un utilisateur

document.addEventListener('DOMContentLoaded', function() {
    // Sélectionner tous les liens de suppression
    const deleteLinks = document.querySelectorAll('.actions a:last-child');

    deleteLinks.forEach(function(link) {
        link.addEventListener('click', function(event) {
            const confirmation = confirm('Voulez-vous vraiment supprimer cet utilisateur ?');
            if (!confirmation) {
                event.preventDefault(); // Annuler l'action si l'utilisateur refuse
            }
        });
    });
});
