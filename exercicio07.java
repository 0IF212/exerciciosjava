public class exercicio07 {
    private static class Veiculo {
        private String marca;
        private String modelo;

        public Veiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

    public static class Carro extends Veiculo {
        public Carro(String marca, String modelo, int numeroDePortas) {
            super(marca, modelo);
            this.numeroDePortas = numeroDePortas;
        }

        private int numeroDePortas;

        public int getNumeroDePortas() {
            return numeroDePortas;
        }

        public void setNumeroDePortas(int numeroDePortas) {
            this.numeroDePortas = numeroDePortas;
        }

        @Override
        public String toString() {
            return String.format("Marca: %s\nModelo: %s\nNúmero de portas: %d\n", this.getMarca(), this.getModelo(),
                    this.getNumeroDePortas());
        }
    }

    public static class Moto extends Veiculo {
        public Moto(String marca, String modelo, int cilindradas) {
            super(marca, modelo);
            this.cilindradas = cilindradas;
        }

        private int cilindradas;

        public int getCilindradas() {
            return cilindradas;
        }

        public void setCilindradas(int cilindradas) {
            this.cilindradas = cilindradas;
        }

        @Override
        public String toString() {
            return String.format("Marca: %s\nModelo: %s\nCilindradas: %d\n", this.getMarca(), this.getModelo(),
                    this.getCilindradas());
        }
    }
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", 4);
            Moto moto = new Moto("Suzuki", "Hayabusa", 1340);
        System.out.println(carro.toString());
        System.out.println(moto.toString());
    }
}
