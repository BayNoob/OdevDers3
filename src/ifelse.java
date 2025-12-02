void main() {
    double sinav1 = 59.0;
    double sinav2 = 78.0;
    double ortalama = sinav1 * 0.6 + sinav2 * 0.4;
    System.out.println(ortalama);
    if (ortalama >= 75) {
        System.out.println("Geçtin");
    }
    else {
        System.out.println("kaldın");
    }
}
