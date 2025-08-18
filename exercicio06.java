public class exercicio06 {
    public class Circulo {
        private Double raio;

        public double calcularArea() {
            return Math.PI * Math.pow(this.raio, 2);
        }

        public Circulo(Double raio) {
            this.raio = validaRaio(raio);
        }

        public Double getRaio() {
            return raio;
        }

        public void setRaio(Double raio) {
            this.raio = validaRaio(raio);
        }

        private double validaRaio(Double raio) {
            if (raio <= 0) {
                throw new IllegalArgumentException("Raio deve ser um número positivo");
            }
            return raio;
        }
    }
}
    