package kruskal;

import java.util.ArrayList;

public class KruskalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Muchie> muchii = new ArrayList<Muchie>(); //creez un sir de muchii si adaug muchii
		muchii.add(new Muchie(1,2,3));
		muchii.add(new Muchie(1,3,1));
		muchii.add(new Muchie(1,4,6));
		muchii.add(new Muchie(2,3,5));
		muchii.add(new Muchie(2,5,3));
		muchii.add(new Muchie(3,4,5));
		muchii.add(new Muchie(3,5,6));
		muchii.add(new Muchie(3,6,4));
		muchii.add(new Muchie(4,6,2));
		muchii.add(new Muchie(5,6,6));
		
		//Ordonez sirul dupa cost
		
		for(int i=0;i<muchii.size();i++)
			for(int j=0; j<muchii.size();j++)
			{
				if(muchii.get(i).getValoare()<muchii.get(j).getValoare())
				{
					muchii.get(i).Swap(muchii.get(j));
				}
			}
		int[] noduri = new int[7];
		//Fac un sir cu numerele nodurilor
		for(int i=1;i<=6;i++)
			noduri[i] = i;
		
		ArrayList<Muchie> arbore = new ArrayList<Muchie>();
		int NrM = 0; //Numara muchiile din arbore
		arbore.add(muchii.get(0));
		NrM++;
		noduri[muchii.get(0).getV2()] = noduri[muchii.get(0).getV1()];
		int k = 1;
 		while(NrM<6-1&& k<muchii.size())
 		{
 			if(noduri[muchii.get(k).getV1()]!=noduri[muchii.get(k).getV2()])
 			{
 				arbore.add(muchii.get(k));
 				for(int j = 1;j<=6;j++)
 					if(noduri[j] == noduri[muchii.get(k).getV2()])
 						noduri[j] = noduri[muchii.get(k).getV1()];
 				NrM++;
 			}
 			k++;
 		}
 		
		for(int i=0;i<arbore.size();i++)
			arbore.get(i).afis();
		
	}

}
