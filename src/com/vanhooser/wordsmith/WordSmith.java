package com.vanhooser.wordsmith;

public class WordSmith {

	public static void main(String[] args) {
		for(int i=0 ; i<100 ; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("wordsmith");
			}else if(i % 3 == 0){
				System.out.println("word");
			}else if (i % 5 == 0){
				System.out.println("smith");
			}else{
				System.out.println(i);
			}
		}

	}

}
