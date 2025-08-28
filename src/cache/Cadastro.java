    package cache;

    import java.util.Random;

    public class Cadastro {
        Random rand = new Random();
        int id;
        String nome;
        String email;
        int idade;
        String cpf;

        public Cadastro(String nome, String email, int idade, String cpf) {
            this.id = rand.nextInt(1,10000);
            this.nome = nome;
            this.email = email;
            this.idade = idade;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", email='" + email + '\'' +
                    ", idade=" + idade +
                    ", cpf='" + cpf + '\'' +
                    '}';
        }
    }
