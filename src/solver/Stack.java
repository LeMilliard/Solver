/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kbouzan
 */
public class Stack<E> {

	private List<E> stack;

	public Stack() {
		this.stack = new ArrayList<>();
	}

	public Stack(List<E> stack) {
		this.stack = stack;
	}

	public void push(E e) {
		this.stack.add(e);
	}

	public E pop() {
		return this.stack.remove(this.stack.size() - 1);
	}

	public boolean search(E e) {
		return this.stack.contains(e);
	}

	public int size() {
		return stack.size();
	}

        /**
         * retourne le dernier element de la pile
         * @return 
         */
	public E getLastIn() {
		return this.stack.get((this.stack.size() - 1));
	}
}
