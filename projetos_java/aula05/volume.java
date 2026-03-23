void main(){

	IO.print("digite o raio: ");
	String r = IO.readln();
    IO.print("digite a altura: ");
	String h = IO.readln();


    Double rr = Double.parseDouble(r);
    Double hh = Double.parseDouble(h);

    Double v = 3.14159 * (rr*rr) * hh;

	IO.print(v);

}