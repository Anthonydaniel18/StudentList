import java.util.*;

public class Pert08{
	Scanner scan = new Scanner(System.in);
	Vector<String> names = new Vector<String>();
	Vector<Integer> ages = new Vector<Integer>();

	public void addData(){
		String name = "";
		int age = 0;
		System.out.println("Insert name: ");
		name = scan.nextLine();
		System.out.println("Insert age: ");
		age = scan.nextInt(); scan.nextLine();
		//Masukkin ke vector
		names.add(name);
		ages.add(age);
	}

	public void viewAll(){

		if(names.size() == 0){
			System.out.println("There is no data");
		} else {
			for (int i = 0; i < names.size(); i++){
				System.out.println("Name: " + names.get(i));
				System.out.println("Age: " + ages.get(i));
			}
		}

	}

	public void updateData(){
		String update = "";
		int index = -1;
		String newName = "";
		int newAge = 0;

		if(names.size() == 0){
			System.out.println("There is no data");
		} else {

		System.out.println("Insert data to be updated");
		update = scan.nextLine();

		for (int i = 0; i < names.size(); i++){
			if ((names.get(i)).equalsIgnoreCase(update)){
				index = i;
			}
		}

		if (index == -1){
			System.out.println("Data not found!");
		} else {
			System.out.println("Insert new name: ");
			newName = scan.nextLine();
			System.out.println("Insert new age: ");
			newAge = scan.nextInt(); scan.nextLine();
			names.set(index,newName);
			ages.set(index,newAge);
		}
	}

	}

	public void deleteData(){
		String delete = "";
		int index = -1;

		if(names.size() == 0){
			System.out.println("There is no data");
		} else {

		System.out.println("Insert data to be deleted");
		delete = scan.nextLine();

		for (int i = 0; i < names.size(); i++){
			if ((names.get(i)).equalsIgnoreCase(delete)){
				index = i;
			}
		}

		if (index == -1){
			System.out.println("Data not found!");
		} else {
			names.remove(index);
			ages.remove(index);
		}
		}
	}

	public Pert08(){ //constructor
		int choose = 0;
		do{
			System.out.println("Welcome");
			System.out.println("=======");
			System.out.println("1. Add Data");
			System.out.println("2. View All Data");
			System.out.println("3. Update Data");
			System.out.println("4. Search Data");
			System.out.println("5. Delete Data");
			System.out.println("6. Exit");
			choose = scan.nextInt(); scan.nextLine();

			switch(choose){
				case 1:
					addData();
				break;
				case 2:
				viewAll();
				break;
				case 3:
				updateData();
				break;
				case 4:
				break;
				case 5:
				deleteData();
				break;
			}

		}while (choose!=6);
	}

	public static void main(String[] args){
		new Pert08();
	}

}