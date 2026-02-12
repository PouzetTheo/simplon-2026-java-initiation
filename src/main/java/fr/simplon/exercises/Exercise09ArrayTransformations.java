package fr.simplon.exercises;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux
 * existants
 */
public class Exercise09ArrayTransformations {

    /**
     * Double tous les éléments d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i] * 2;
        }
        return array2;
    }

    /**
     * Filtre les nombres pairs d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
        int[] temp = new int[array.length];
        int compteur = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                temp[compteur] = array[i];
                compteur++;
            }
        }

        int[] array2 = new int[compteur];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = temp[i];
        }
        return array2;
    }

    /**
     * Copie un tableau dans l'ordre inverse
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {

        int[] array2 = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            array2[array.length - 1 - i] = array[i];
        }
        return array2;

        /*
         * int[] array2 = new int[array.length];
         * for (int i = 0; i < array.length; i++) {
         * array2[i] = array[array.length -1 -i];
         * }
         * return array2;
         */
    }

    /**
     * Concatène deux tableaux
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis
     *         ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + array1.length] = array2[i];
        }
        return array3;
    }

    /**
     * Extrait une sous-partie d'un tableau
     * 
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end   l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
        int[] array2 = new int[end - start ];
        for (int i = start; i < end;i++){
            array2[i-start] = array[i];
        }
        return array2;
    }
}
