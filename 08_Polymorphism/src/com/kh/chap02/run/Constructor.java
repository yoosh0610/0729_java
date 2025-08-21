package com.kh.chap02.run;

import com.kh.chap02.model.vo.BeerDrinker;
import com.kh.chap02.model.vo.Drinker;
import com.kh.chap02.model.vo.RiceWineDrinker;
import com.kh.chap02.model.vo.SojuDrinker;

public class Constructor {

	public static void main(String[] args) {
		SojuDrinker s1 = new SojuDrinker(1);
		SojuDrinker s2 = new SojuDrinker(3);
		BeerDrinker b1 = new BeerDrinker(false);
		BeerDrinker b2 = new BeerDrinker(true);
		RiceWineDrinker r1 = new RiceWineDrinker(40);
		RiceWineDrinker r2 = new RiceWineDrinker(50);
	
		s1.drink();
		s1.drink();
		b1.drink();
		b1.drink();
		r1.drink();
		r1.drink();
		
		s1.eat();
		s2.eat();
		b1.eat();
		b2.eat();
		r1.eat();
		r2.eat();
	
		System.out.println("===========================");
		SojuDrinker[] sojuarr = new SojuDrinker[2];
		BeerDrinker[] beerarr = new BeerDrinker[2];
		RiceWineDrinker[] rwarr = new RiceWineDrinker[2];
		
		sojuarr[0] = s1;
		sojuarr[1] = s2;
		beerarr[0] = b1;
		beerarr[1] = b2;
		rwarr[0] = r1;
		rwarr[1] = r2;
		
		for(int i = 0; i < sojuarr.length; i++) {
			sojuarr[i].drink();
			sojuarr[i].eat();
		}
		for(int i = 0; i < beerarr.length; i++) {
			beerarr[i].drink();
			beerarr[i].eat();
		}
		for(int i = 0; i < rwarr.length; i++) {
			rwarr[i].drink();
			rwarr[i].eat();
		}
		
		System.out.println("===========================");
		
		Drinker[] drinkArr = new Drinker[6];
		drinkArr[0] = s1;
		drinkArr[1] = s2;
		drinkArr[2] = b1;
		drinkArr[3] = b2;
		drinkArr[4] = r1;
		drinkArr[5] = r2;
		
		for(int i = 0; i < drinkArr.length; i++) {
			drinkArr[i].drink();
			drinkArr[i].eat();
		}
		
		
	}
	
	
	

}
