public class ExerciseClassOne {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.cor = "Laranja";
        gato.nome = "Reddie";
        gato.idade = 1;

        System.out.println("Esse é o gato " + gato.cor + " " + gato.nome + " com " + gato.idade + " ano");
        gato.miar();
    }
}
