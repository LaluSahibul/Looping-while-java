package loop_W;
import java.util.Scanner;
public class Opq {
	public static void main(String[] args) {

		boolean a=true;
		String nama;
		Scanner x=new Scanner (System.in);
		
		while (a) {
			System.out.print("masukkan nama>> ");
			nama=x.nextLine();
			if(nama.contentEquals("baqi hofian andriana")||nama.contentEquals("Baqi Hofian Andriana")||nama.contentEquals("opq")||nama.contentEquals("OPQ")) {
				System.out.println("\n");
				System.out.println("       ******   ******       ");
				System.out.println("      ******** ********      ");
				System.out.println("      ********L********      ");
				System.out.println("      ********O********      ");
				System.out.println("       *******V*******       ");
				System.out.println("        ******E******        ");
				System.out.println("          *********          ");
				System.out.println("            *****            ");
				System.out.println("              *              ");
				System.out.println("                             ");
				a=false;
			}else {
				System.out.println(nama+" siapa?");
				a=true;
		}
	}

}
}
