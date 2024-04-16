package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList <Desktop> desktops= new ArrayList<>();
		
		Desktop PcdaXuxa = new Desktop();
		PcdaXuxa.setFabricante("Positivo");
		PcdaXuxa.setGamer(true);
		PcdaXuxa.setCodigodebarras(123l);
		
		ArrayList <String> pecas1 = new ArrayList<>();
		pecas1.add("Mouse");
		pecas1.add("Tecrado");
		
		PcdaXuxa.setPecas(pecas1);
		desktops.add(PcdaXuxa);
		
		
		Desktop PcdoAlvaro = new Desktop();
		PcdoAlvaro.setFabricante("Negativo");
		PcdoAlvaro.setGamer(false);
		PcdoAlvaro.setCodigodebarras(321l);
		
		ArrayList <String> pecas2 = new ArrayList<>();
		pecas2.add("Mouse");
		pecas2.add("Tecrado");
		
		PcdoAlvaro.setPecas(pecas2);
		desktops.add(PcdoAlvaro);
		
		Desktop PcdoPredo = new Desktop();
		PcdoPredo.setFabricante("Intuitivo");
		PcdoPredo.setGamer(true);
		PcdoPredo.setCodigodebarras(132l);
		
		ArrayList <String> pecas3 = new ArrayList<>();
		pecas3.add("Mouse gamer com luzinha");
		pecas3.add("Tecrado Mechanico");
		
		PcdoPredo.setPecas(pecas3);
		desktops.add(PcdoPredo);
		
		ArrayList <Smartphone> celulares = new ArrayList<>();
		
		Smartphone CelldoWilly = new Smartphone();
		CelldoWilly.setNome("A01 fdp do Willy");
		CelldoWilly.setDimensoestela("Dimensoes Grandes");
		CelldoWilly.setVersaodosistema(10);
		CelldoWilly.setFabricante("Samsung");
		celulares.add(CelldoWilly);
		
		Smartphone CelldoPredo = new Smartphone();
		CelldoPredo.setNome("Iphone 2 do Predo");
		CelldoPredo.setDimensoestela("Dimensoes Pequenas");
		CelldoPredo.setVersaodosistema(2);
		CelldoPredo.setFabricante("Apple");
		celulares.add(CelldoPredo);
		
		Smartphone CelldoThales = new Smartphone();
		CelldoThales.setNome("Motobomba do Thalles");
		CelldoThales.setDimensoestela("Dimensoes Medianas");
		CelldoThales.setVersaodosistema(4);
		CelldoThales.setFabricante("Motobomba");
		celulares.add(CelldoThales);
		
		System.out.println("Os Desktops sao:");
		for (Desktop desktop : desktops) {
			System.out.println(desktop.getFabricante());
			System.out.println(desktop.getGamer());
			System.out.println(desktop.getCodigodebarras());
			//System.out.println(desktop.getPecas());
			for (String peca : desktop.getPecas()) {
				System.out.println(peca);
			}
		}
		System.out.println("");
		System.out.println("Os celulares sao:");
		for (Smartphone smartphone : celulares) {
			System.out.println(smartphone.getNome());
			System.out.println(smartphone.getDimensoestela());
			System.out.println(smartphone.getVersaodosistema());
			System.out.println(smartphone.getFabricante());
		}
	}
}
