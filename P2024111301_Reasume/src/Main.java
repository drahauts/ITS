import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();

		li.add(7);
		li.add(5);
		li.add(9);
		li.add(2);
		li.addFirst(11);
		li.addLast(37);
		li.add(3, 99);

		System.out.println(li);

		Integer theBigOne = Collections.max(li);
		Collections.sort(li);
		System.out.println(li);
		System.out.println(theBigOne);

		Collections.shuffle(li);
		System.out.println(li);

		Ghepardo ghepardo1 = new Ghepardo(15, 60, 90.0);
		Ghepardo ghepardo2 = new Ghepardo(13, 66, 80.0);
		Ghepardo ghepardo3 = new Ghepardo(16, 50, 100.0);
		Ghepardo ghepardo4 = new Ghepardo(14, 55, 85.0);

		LinkedList<Ghepardo> lg = new LinkedList<Ghepardo>();
		lg.add(ghepardo1);
		lg.add(ghepardo2);
		lg.add(ghepardo3);
		lg.add(ghepardo4);

		for (Ghepardo g : lg) {
			System.out.println(g);
		}

		for (var g : lg) {
			System.out.println(g);
		}
		Collections.sort(lg);
		System.out.println(lg);

		Collections.shuffle(lg);
		lg.sort(new Comparator<Ghepardo>() {
			public int compare(Ghepardo g1, Ghepardo g2) {
				return g1.getSpeed().compareTo(g2.getSpeed());
			}
		});

		LinkedList<Elefante> el = new LinkedList<Elefante>();

		el.add(new Elefante(5, 10, 4500.0));
		el.add(new Elefante(4, 11, 5000.0));
		el.add(new Elefante(6, 9, 4444.0));
		el.add(new Elefante(4, 12, 6000.0));

		LinkedList<Mammifero> mm = new LinkedList<Mammifero>();
		mm.addAll(lg);
		mm.addAll(el);

		// Procedura MERGE, usiamo 2 liste di interi gia ordinate

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();

		l1.add(3);
		l1.add(8);
		l1.add(11);
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(9);
		l2.add(12);
		l2.add(15);

		
		LinkedList<Integer> lsorted = MergeLists(l1, l2);
		System.out.println(lsorted);
	}

	private static LinkedList<Integer> MergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		//Prima  cosa: impariamo a usare gli iteratori!!1
		
		// Usando un iteratore, stampare una lista
		
		/*Iterator<Integer> it1 = l1.iterator();
		while(it1.hasNext()) {
			Integer num = it1.next();
			System.out.println(num);
		}
		*/
		
		// 1) Creo la lista risultato
		LinkedList<Integer> lret = new LinkedList<Integer>();
		
		//2) Faccio la merge delle 2 liste ordinate
		
		
		if (l1==null || l1.size() == 0){
			return l2;
		}
		if (l2 == null || l2.size() == 0){
			return l1;
		}
		
		Iterator<Integer> it1 = l1.iterator();
		Iterator<Integer> it2 = l2.iterator();
		
		Integer n1 = it1.next();
		Integer n2 = it2.next();
		while (true) {
			if (n1 <= n2) {
				lret.add(n1);
				if (it1.hasNext()) {
					n1 = it1.next();
				} else {
					lret.add(n2);
					while (it2.hasNext()) {
						lret.add(it2.next());
					}
					return lret;
				}
			}else {
					lret.add(n2);
					if (it2.hasNext()) {
						n2 = it2.next();
					}
					else {
						lret.add(n1);
						while (it1.hasNext()) {
							lret.add(it1.next());
						}
						return lret;
					}
				
			}
			
		}
	}
}
