package cl.generation.f20221103;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		
		// opcion 1 en la cual creamos un arreglo en el main y lo igualamos al arreglo-atributo del objeto Usuario
		/*
		ArrayList <String> telefono = new ArrayList <String>();
		
		telefono.add("11111111");
		telefono.add("22222222");
		
		usuario.setTelefonos(telefono);
		System.out.println(telefono);
		*/
		
		//asi añadimos telefonos cuando instanciamos la creacion del arraylist dentro del constructor vacio de la clase 
		
		usuario.getTelefonos().add("33333333");
		usuario.getTelefonos().add("44444444");
		System.out.println(usuario.getTelefonos());
		
		Direccion direccion =new Direccion();
		direccion.setCalle("los pablos");
		direccion.setNumero("1234");
		direccion.setCiudad("Temuco");
		direccion.setRegion("Araucania");
		usuario.setDireccion(direccion);
		System.out.println(direccion);
		System.out.println(usuario);
		
}

}