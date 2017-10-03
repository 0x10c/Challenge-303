package testchallenge013;

public class Main {
    public static void main(String args[]) {
        String firstName[] = {
                "Albion", "Alcina", "Alethea" , "Althea", "Amarantha", "Amaryllis",
                "Amoret", "Arcadia", "Auberon", "Aurelian", "Bastien", "Cadmus",
                "Calantha", "Callista", "Calypso", "Camilla", "Caspian", "Cassandra",
                "Circe", "Corisande", "Cosimo", "Cressida", "Calidore", "Delphine"
        };
        String secondName[] = {
                "Albion", "Alcina", "Alethea" , "Althea", "Amarantha", "Amaryllis",
                "Amoret", "Arcadia", "Auberon", "Aurelian", "Bastien", "Cadmus",
                "Calantha", "Callista", "Calypso", "Camilla", "Caspian", "Cassandra",
                "Circe", "Corisande", "Cosimo", "Cressida", "Calidore", "Delphine"
        };

        System.out.println("Generated name: ");
        int generatedName = (firstName.length * secondName.length);
        System.out.println(generatedName);
    }
}
