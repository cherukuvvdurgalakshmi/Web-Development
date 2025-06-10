 public class ReverseString
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = sc.nextLine();

  
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) 
{
            reversed += input.charAt(i);
        }


        System.out.println("Reversed string: " + reversed);
    }
}
 class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

