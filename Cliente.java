package OrientacaoObjetos;

public class Cliente 
{
	String nome;
	int idade;
	String endere�o;
	float altura;
	boolean estudante;
	
	//M�TODOS
	public void estudante() {
		estudante=true;
	}
	
	public void exestudante() {
		estudante=false;
	}
	
	public void estuda() {
		if(estudante==true)
			System.out.print("INCORRETO! A pessoa � estudante!");
		else
			System.out.print("Estudando");
			
	}

	public void status()
	{
		System.out.print("A pessoa tem: "+this.idade);
		
		
	}

}
