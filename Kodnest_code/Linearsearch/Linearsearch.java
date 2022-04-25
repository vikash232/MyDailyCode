class Linearsearch {
    public static void main(Sting[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Length");
            int n = scan.nextInt();
            int arr[] = new int(n);
        System.out.println("Enter Array Elements");

        for (int i=0; i<=arr1.length-1; i++)
        {
        System.out.println("Enter An Element");
                arr[1] = scan.nextInt();
        }

        System.out.println("Enter key to Search");
        int key = scan.nextInt();
        
        for (int i=0; i<=arr1.length-1; i++){
            if(key == arr1[i])
            {
                System.out.println("Key found at the index" + 1);
                System.exit(0);
            }
        }

        System.out.println("Key not found");

        
    }
}
