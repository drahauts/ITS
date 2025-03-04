public class Persona {
    private String nome;
    private String cognome;
    private int age;
    static int num_studenti = 0;

    public Persona(String nome, String cognome, int age){
        this.nome = nome;
        this.cognome = cognome;
        this.age = age;

        num_studenti ++;
    }

    public Persona(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", age=" + age +
                '}';
    }
    public static class Studenti extends  Persona{
        private String corso;
        private int anno;

        public Studenti(String nome, String cognome, int age, String corso, int anno){
            super(nome, cognome, age);
            this.corso = corso;
            this.anno = anno;
        }

        public int getAnno() {
            return anno;
        }

        public String getCorso() {
            return corso;
        }

    }
}
