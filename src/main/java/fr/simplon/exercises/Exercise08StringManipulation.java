package fr.simplon.exercises;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {

    /**
     * Inverse une chaîne de caractères
     * 
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {
        String inverse = "";
        char[] tableau = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            inverse = inverse + tableau[i];
        }
        return inverse;
    }

    /**
     * Vérifie si une chaîne est un palindrome
     * 
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {

        String inveString = reverseString(str);
        if (!inveString.equals(str)) {

            return false;
        } else {
            return true;
        }
    }

    /**
     * Compte le nombre de voyelles dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        int voyelles = 0;
        for (int i = 0; i < str.length(); i++)
            if ("aeiou".contains(str.toLowerCase().substring(i, i + 1)))
                voyelles++;

        return voyelles;
    }

    /**
     * Compte le nombre de mots dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {
        int count = 0;
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++)
            count++;
        return count;
    }

    /**
     * Met la première lettre de chaque mot en majuscule
     * 
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {
        String motFinal = "";
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            String mot = array[i];
            String first = mot.charAt(0) + "";
            String end = mot.substring(1, mot.length());
            mot = first.toUpperCase() + end.toLowerCase();
            motFinal = motFinal + mot + " ";
        }
        return motFinal.trim();// .trim enlev les espace au debut et a la fin et les sretour a la ligne
    }
}
