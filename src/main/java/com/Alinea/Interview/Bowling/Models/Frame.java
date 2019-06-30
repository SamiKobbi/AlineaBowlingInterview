package com.Alinea.Interview.Bowling.Models;

public class Frame {
	private int nbQuillePremierLancer;
	private int nbQuilleSecondLancer;

	public int getNbQuillePremierLancer() {
		return nbQuillePremierLancer;
	}

	public void setNbQuillePremierLancer(int nbQuillePremierLancer) {
		this.nbQuillePremierLancer = nbQuillePremierLancer;
	}

	public int getNbQuilleSecondLancer() {
		return nbQuilleSecondLancer;
	}

	public void setNbQuilleSecondLancer(int nbQuilleSecondLancer) {
		this.nbQuilleSecondLancer = nbQuilleSecondLancer;
	}

	public boolean isStrike() {
		return nbQuillePremierLancer == 10;
	}

	public boolean isSpare() {
		return nbQuillePremierLancer + nbQuilleSecondLancer == 10;
	}

	public int getTotalScore() {
		return nbQuillePremierLancer + nbQuilleSecondLancer;
	}
}
