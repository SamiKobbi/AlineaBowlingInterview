package com.Alinea.Interview.Bowling.Models;

public class Game {
	private Frame[] frames;
	private int nbQuilleFinalPremierLanceeSupp;
	private int nbQuilleFinalSecondLanceeSupp;

	public Game(String gameFramesString) {

		String[] gameFrames = gameFramesString.split("#");
		frames = new Frame[10];
		for (int i = 0; i < gameFrames.length; i++) {
			frames[i] = new Frame();
			String nbQuillePremierLancerString = gameFrames[i].substring(0, 1);
			if (nbQuillePremierLancerString.equals("X")) {
				frames[i].setNbQuillePremierLancer(10);
			} else {
				String nbQuilleSecondLancerString = gameFrames[i].substring(1, 2);
				frames[i].setNbQuillePremierLancer(Integer.parseInt(nbQuillePremierLancerString));
				frames[i].setNbQuilleSecondLancer(
						nbQuilleSecondLancerString.equals("/") ? 10 - frames[i].getNbQuillePremierLancer()
								: Integer.parseInt(nbQuilleSecondLancerString));
			}

		}
		if (gameFrames[9].substring(0, 1).equals("X")) {
			String nbQuilleFinalPremierLanceeSuppString = gameFrames[9].substring(1, 2);
			String nbQuilleFinalSecondLanceeSuppString = gameFrames[9].substring(2, 3);
			nbQuilleFinalPremierLanceeSupp = nbQuilleFinalPremierLanceeSuppString.equals("X") ? 10
					: Integer.parseInt(nbQuilleFinalPremierLanceeSuppString);
			nbQuilleFinalSecondLanceeSupp = nbQuilleFinalSecondLanceeSuppString.equals("X") ? 10
					: Integer.parseInt(nbQuilleFinalSecondLanceeSuppString);
		}
		if (gameFrames[9].substring(1, 2).equals("/")) {
			String nbQuilleFinalPremierLanceeSuppString = gameFrames[9].substring(2, 3);
			nbQuilleFinalPremierLanceeSupp = Integer.parseInt(nbQuilleFinalPremierLanceeSuppString);

		}

	}

	public int score() {
		int totalScore = 0;
		for (int i = 0; i < frames.length; i++) {
			totalScore = totalScore + frames[i].getTotalScore();
			if (frames[i].isStrike() && i < frames.length - 1) {
				if (frames[i + 1].isStrike()) {
					if (i < frames.length - 2) {
						totalScore = totalScore + 10 + frames[i + 2].getNbQuillePremierLancer();
					} else {
						totalScore = totalScore + 10 + nbQuilleFinalPremierLanceeSupp;
					}
				} else {
					totalScore = totalScore + frames[i + 1].getTotalScore();
				}
			} else if (frames[i].isSpare()) {
				if (i < frames.length - 1) {
					totalScore = totalScore + frames[i + 1].getNbQuillePremierLancer();
				}
			}
		}
		totalScore = totalScore + nbQuilleFinalPremierLanceeSupp + nbQuilleFinalSecondLanceeSupp;
		return totalScore;

	}
}
