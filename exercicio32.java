import java.lang.reflect.Field;

public class exercicio32 {
    public static class Configuracao {
        private String urlConexao = "localhost:5432";
    }

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Configuracao config = new Configuracao();

        try {
            Field campo = config.getClass().getDeclaredField("urlConexao");
            campo.setAccessible(true);
            campo.set(config, "db.producao.com:5432");
            System.out.println(campo.get(config));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
