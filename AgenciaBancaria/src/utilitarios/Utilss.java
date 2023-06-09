 package utilitarios;
 
 import java.text.DecimalFormat;
 import java.text.NumberFormat;

public class Utilss {
static NumberFormat   formatandandoValores = new DecimalFormat("R$ #,##0.#");
 public static 	String doubleToString(Double valor) {
	 return formatandandoValores.format(valor);
 }
 
 
}
