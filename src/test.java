import java.time.LocalDate;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate fechaActual = LocalDate.now();
		
		CalcularPeriodo c = new CalcularPeriodo();
		
		c.calcularPeriodo("Inicio del curso", fechaActual);
		
		System.out.print(c.toString());

	}

}
