package com.islajava.abstractclass;

public class Principal {

	public static void main(String[] args) {

		// Vehiculo es abstracto, esto ya no podemos hacerlo
//		Coche coche = new Vehiculo();
//		coche.setColor("azul");
//		coche.setMarca("Reanult");
//		coche.setModelo("Clio");
//		coche.setMatricula("76789-OMD");
//		coche.setAireAcondicionado(true);

		Coche coche = new Coche();
		coche.setColor("azul");
		coche.setMarca("Reanult");
		coche.setModelo("Clio");
		coche.setMatricula("76789-OMD");
		coche.setAireAcondicionado(true);
		Motocicleta moto = new Motocicleta();
		moto.setColor("negro");
		moto.setMarca("Honda");
		moto.setModelo("VFR800F");
		moto.setMatricula("43234-CKN");
		moto.setTipoCarenado("Plástico");
	}

}
