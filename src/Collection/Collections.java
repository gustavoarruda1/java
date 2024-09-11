package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections {
	public static void main(String[] args) {
		
//ArrayList
		
//      Criando uma lista		
		List<String> list = new ArrayList<>();
		
//		Adicionando valores a lista
		list.add("A");
		list.add("B");
		list.add("C");
		
//		Selecionando valores da lista
		System.out.println("List: " + list.get(0) + "\n");
		
//LinkedList
		
//		Criando uma LinkedList	
		List<String> linkedList = new LinkedList<>();
		
//		Adicionando valores a LinkedList
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
//		Selecionando valores da LinkedList
		System.out.println("LinkedList: " + linkedList.get(1) + "\n");
		
//HashSet
		
//		Criando uma HashSet
		Set<String> set =  new HashSet<>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");// Elemento duplicado
		
//		Descobrindo o tamanho da HashSet
		System.out.println("HashSet: " + set.size() + "\n");
		
//HashMap
		
//		Criando uma HashMap
		Map<String, Integer> map = new HashMap<>();
		
//		Adicionando valores a HashMap
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
//		Selecionado o terceiro elemento do HashMap
		System.out.println("HashMap: " + map.get("C") + "\n");
		
//Queue
		
//		Criando uma Queue
		Queue<String> queue = new LinkedList<>();
		
//		Adicionando valores a Queue
		
		queue.add("Primeiro");
		queue.add("Segundo");
		queue.add("Terceiro");
		
//		Selecionando elementos da Queue
		System.out.println("Elementos da Queue: " + queue + "\n");
		
//		Removendo um elemento da Queue
		System.out.println("Removendo da Queue [" + queue.poll() + 	"]\n");
		
//		Selecionando elementos da Queue após a remoção
		System.out.println("Elementos da Queue: " + queue + "\n");
		
		
	}
}
