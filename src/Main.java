void main() {
    System.out.println("\n --Sıralanmamış Sayılar--");
    Random random = new Random();
    int[] numbers = new int[50];
    for (int i = 0; i < 50 ; i++) {
        numbers[i] = random.nextInt(1,1000);
        System.out.println(numbers[i]);
    }
    System.out.println("\n --Sıralanmış Sayılar--");
    Arrays.sort(numbers);
    for (int n : numbers) {
        System.out.println(n);
    }
}

