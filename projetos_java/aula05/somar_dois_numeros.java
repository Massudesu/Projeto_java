void main(){

	IO.print("digite a temperatura em graus Celsius: ");
	String c = IO.readln();


	float cel = Float.parseFloat(c);
	float f = ((cel*9)/5)+32;


	IO.print(f);

}