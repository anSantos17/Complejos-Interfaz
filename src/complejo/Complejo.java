
package complejo;

public class Complejo {
  private double real;
  private double imag;

  public Complejo() {
    this.real = 0;
    this.imag = 0;
  }

  public Complejo(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getReal() {
    return this.real;
  }

  public void setImag(double imag) {
    this.imag = imag;
  }

  public double getImag() {
    return this.imag;
  }

  public Complejo suma(Complejo c1) {
    return new Complejo(this.real + c1.real, this.imag + c1.imag);
  }

  public Complejo resta(Complejo c1) {
    return new Complejo(this.real - c1.real, this.imag - c1.imag);
  }

  public Complejo multiplicacion(Complejo c1) {
    return new Complejo(this.real * c1.real - this.imag * c1.imag, this.imag * c1.real + this.real * c1.imag);

  }

  public Complejo division(Complejo c1) {
    Complejo num = this.multiplicacion(c1.conjugado());
    Complejo den = c1.multiplicacion(c1.conjugado());
    return new Complejo(num.real / den.real, num.imag / den.real);
  }
  public Complejo norma(){
    double num = (double) Math.pow(this.real,2) + Math.pow(this.real,2);
    double res = Math.sqrt(num);
    return new Complejo(res, 0);
  }

  public Complejo conjugado() {
    return new Complejo(this.real, this.imag * (-1));
  }

  public void leer(int a, int b) {
    this.real = a;
    this.imag = b;
  }

  public String imprimir() {
    String numero = this.real + "+" + this.imag + "i";
    return numero;
  }

}