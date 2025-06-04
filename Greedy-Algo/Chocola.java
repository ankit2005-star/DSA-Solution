import java.util.*;


// we are given a bar of chocolate composed of m x n square pieces , One
//should break the choclate into single squares.Each break of a part of the //choclate is charged a cost expressed by a positive integer.This cost does //not 
//depend on the of the part that is being broken but only depends on the line //the break goes along.Let us denote the costs of breaking along consecutive //vertical lines with x1 ,x2,...xm-1 and along horizontal lines with //y1,y2,...yn-1.
// Compute the minimal cost of breaking the whole choclate into single //squares.


public class Chocola{

	public static void main(String[] args){
		int n  = 4 , m = 6;
		Integer[] hCost = { 6 , 1 , 2 }; //n-1
		Integer[] vCost= { 2 , 1 , 3 , 1 , 4 };//m-1
		
		Arrays.sort( hCost , Collections.reverseOrder());
		Arrays.sort( vCost , Collections.reverseOrder());

		int hp , vp ;
		 hp = vp = 1;
		int h , v;
		h = v = 0; //two pointers
		int cost = 0; 

		while( h < hCost.length && v < vCost.length){
		
			if( vCost[v] <= hCost[h] ){ //horizontal cut 
				cost += (vp * hCost[h] );
				hp++;
				h++;
			}else{ //vertical cut 
			
				cost += ( hp * vCost[v]);
				vp++; v++;
			}
		} 

		while( v < vCost.length){
		 cost += (hp *  vCost[v++] ); vp++ ; 
		}
		while( h < hCost.length){
		 cost += (vp *  hCost[h++] ); hp++ ; 
		}	

		System.out.println( "min cost of cuts  is : " + cost );
	}

}