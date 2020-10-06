import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.tuple.Triple;

public class ItenaryConstruct {

	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static List<String> logic() {

		List<List<String>> tickets = new ArrayList<List<String>>();

		tickets.add(new ArrayList<String>());
		tickets.add(new ArrayList<String>());
		tickets.add(new ArrayList<String>());
		tickets.add(new ArrayList<String>());
		tickets.add(new ArrayList<String>());

		tickets.get(0).add("JFK");
		tickets.get(0).add("SFO");
		tickets.get(1).add("JFK");
		tickets.get(1).add("ATL");
		tickets.get(2).add("SFO");
		tickets.get(2).add("ATL");
		tickets.get(3).add("ATL");
		tickets.get(3).add("JFK");
		tickets.get(4).add("ATL");
		tickets.get(4).add("SFO");

		Map<String, PriorityQueue<String>> graph = new HashMap<String, PriorityQueue<String>>();

		for (List<String> adj : tickets) {

			graph.putIfAbsent(adj.get(0), new PriorityQueue<String>());

			graph.get(adj.get(0)).offer(adj.get(1));

		}
		
		List<String> itinerary = new ArrayList<>();
		
		dfs(graph, "JFK", itinerary);

		return itinerary;
	}

	public static void dfs(Map<String, PriorityQueue<String>> graph, String from, List<String> itenary) {
		
		 PriorityQueue<String> adjacents = graph.getOrDefault(from, new PriorityQueue<String>());
		 
		 while(!adjacents.isEmpty()) {
			 dfs(graph, adjacents.poll(), itenary);
		 }
		 
		 itenary.add(0, from);

	}

}