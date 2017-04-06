package kruskal;

public class Muchie {
	
	int v1;
	int v2;
	int valoare;

public Muchie(int v1, int v2, int valoare)
{
	this.v1 = v1;
	this.v2 = v2;
	this.valoare = valoare;
}

public int getValoare() {
	return valoare;
}

public void setValoare(int valoare) {
	this.valoare = valoare;
}

public void Swap(Muchie a)
{
	int aux;
	aux = this.v1;
	this.v1 = a.v1;
	a.v1 = aux;
	aux = this.v2;
	this.v2 = a.v2;
	a.v2 = aux;
	aux = this.valoare;
	this.valoare = a.valoare;
	a.valoare = aux;
	
}

public void afis()
{
	System.out.println(v1 + " " + v2 + " " + valoare);
}

public int getV1() {
	return v1;
}

public void setV1(int v1) {
	this.v1 = v1;
}

public int getV2() {
	return v2;
}

public void setV2(int v2) {
	this.v2 = v2;
}

}
