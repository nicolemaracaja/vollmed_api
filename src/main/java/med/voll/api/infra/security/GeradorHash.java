package med.voll.api.infra.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorHash {

    public static void main(String[] args) {
        String senha = "123456"; // a senha que você quer hashear
        String hash = gerarHash(senha);
        System.out.println("Hash da senha: " + hash);
    }

    public static String gerarHash(String senha) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(senha);
    }
}


