package edu.ifsp.hto.poo.torneio;

import java.util.List;

public class Rodada {
	
	List<Partida> partidas;

	public void addPartida(Partida partida) {
		//Verificar se a partida j� existe, ou algum jogador est� em uma partida duplicada.
		partidas.add(partida);
	}
	
	public List<Partida> getPartidas(){
		return partidas;
	}

}
