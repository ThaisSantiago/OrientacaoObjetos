package OrientacaoObjetos;

public class Cliente 
{
	String nome;
	int idade;
	String endereço;
	float altura;
	boolean estudante;
	
	//MÉTODOS
	public void estudante() {
		estudante=true;
	}
	
	public void exestudante() {
		estudante=false;
	}
	
	public void estuda() {
		if(estudante==true)
			System.out.print("INCORRETO! A pessoa é estudante!");
		else
			System.out.print("Estudando");
			
	}

	public void status()
	{
		System.out.print("A pessoa tem: "+this.idade);
		
		
	}

}
